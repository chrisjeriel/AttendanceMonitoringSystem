'use strict';

var React = require('react');

var ButtonComponent = require('../../../../components/ButtonComponent');
var ViewFooter = require('../../../../components/ViewFooter');
var Table = require('../../../../components/TableComponent');
var AppBody = require('../../../../components/AppBody');
var Auth = require('../../../../auth/Auth');
var API = require('../../../../api');
var TableComponent = require('../../../../components/TableComponent');
var AppHeader = require('../../../../components/AppHeader');
var AppHeaderTitle = require('../../../../components/AppHeaderTitle');
var SystemResponse = require('../../../../components/SystemResponse');
var ConfirmationPrompt = require('../../../../components/ConfirmationPrompt');

var CutOffTimeRegularSquaringModify = React.createClass({

	getInitialState: function () {
		return (
			{	
				dialog: null,
				cutTime1: "00:00",
				cutPeriod1: "AM",
				cutTime2: "00:00",
				cutPeriod2: "AM",
				trdrFi: "2",
				scutTime: "00:00",
				scutPeriod: "AM",
				trdrDesc: "NONE"
			}
		);
	},
	Process: function (e) {
		this.closeDialogBox();
		var valid = true;

		var scutTime = this.timeToNumber(this.state.scutTime, this.state.scutPeriod);
		var trdrFi = this.state.trdrFi;

		if (scutTime === null) {
			this.setState({
	            dialog: <SystemResponse title="System Response" content="Invalid Squaring Cut-Off Time. Please try again." close={this.closeDialogBox} />
	        });
	        valid = false;
		}

		if (valid) {
			var data = {
				  		scutTime: scutTime,
				  		trdrFi: trdrFi
			};
			e.preventDefault();
			console.log(data);
			API.maintenance_defsyscontrols.cutoff_squaring_post(data)
				.done(this.processSuccess)
				.fail(this.processFail);
		}

	},
	confirmProcess: function () {
        this.setState({
            dialog: <ConfirmationPrompt title="Confirmation" content="Are you sure you want to save changes?" yes={this.Process} no={this.closeDialogBox} />
        })
	},
	processSuccess: function () {
		this.setState({
            dialog: <SystemResponse title="System Response" content="FFF1LUNL FORCED SQUARING CUT-OFF TIME SUCCESSFULLY UPDATED" close={this.props.CloseAndUpdate} />
        });
	},
	processFail: function (xhr, err) {
		this.setState({
            dialog: <SystemResponse title="Error" content={err} close={this.props.Close} />
        });
	},
	numberToTime: function (time) {
		var newTime = ('0000'+time).slice(-4);
		newTime = newTime.replace(/\D/g,'');
		return newTime.slice(0,2)+":"+newTime.slice(-2);
	},
	timeToNumber: function (time, period) {
		function stringTime (string) {
			return ('0000'+string.toString()).slice(-4);
		}

		if (time.match(/^([1][0-2]|[0]?[0-9])([.:][0-5][0-9])?$/) === null) {
			return null;
		}
		time = Number(time.replace(/\D/g,''));

		if (time < 100 || time >= 1300) {
			return null;
		}

		if (time < 1200 && period === "AM") {
			return stringTime(time);
		}
		if (time >= 1200 && period === "AM") {
			return stringTime(time - 1200);
		}

		if (time < 1200 && period === "PM") {
			return stringTime(time + 1200);
		}
		if (time < 1300 && period === "PM") {
			return stringTime(time);
		}
		return stringTime(time);
	},
	componentWillMount: function () {
		
		var scutTime = Number(this.props.data.SCUT_TIME);
		var scutPeriod = "AM";
		var trdrDesc = this.props.data.TRDR_DESC;
		var trdrFi = this.props.data.TRDR_FI;

		if (scutTime >= 1300) {
			scutTime = scutTime - 1200;
			scutPeriod = "PM";
		}

		scutTime = this.numberToTime(scutTime.toString());

		this.setState({	scutTime: scutTime,
					scutPeriod: scutPeriod,
					trdrFi: trdrFi,
					trdrDesc: trdrDesc
					});
	},
	componentDidMount: function() {
		this.loadData();
	},
	loadData: function () {
		console.log(this.state.trdrFi);
		API.maintenance_defsyscontrols.cutoff_check(this.state.trdrFi,
			function (res) {
				var data = res.data;
				console.log(data);

				var cutTime1 = Number(data[0]['CUT_TIME1']);
				var cutPeriod1 = "AM";
				var cutTime2 = Number(data[0]['CUT_TIME2']);
				var cutPeriod2 = "AM";

				if (cutTime1 >= 1300) {
					cutTime1 = cutTime1 - 1200;
					cutPeriod1 = "PM";
				} 
				
				if (cutTime2 >= 1300) {
					cutTime2 = cutTime2 - 1200;
					cutPeriod2 = "PM";
				} 

				cutTime1 = this.numberToTime(cutTime1.toString());
				cutTime2 = this.numberToTime(cutTime2.toString());

				this.setState ( {
					cutTime1: cutTime1,
					cutTime2: cutTime2,
					cutPeriod1: cutPeriod1,
					cutPeriod2: cutPeriod2,
					 }
				);

			}.bind(this),
			function (res) {
				data = res.data;
				console.log(data);
                this.setState({
                    dialog: <SystemResponse 
                                title="Error"
                                content="Cannot connect to middleware"
                                close={this.closeDialogBox} />
                });
			}.bind(this));
	},
    closeDialogBox: function () {
        this.setState({dialog: null});
    },
    handleChange: function (e) {
    	var name = e.target.name;
    	var val = e.target.value;
    	var obj = {};
    	obj[name] = val;

    	this.setState (obj);
    },
	render:function(){
		return(
			<div className='app-border process_modal'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>Set Lead Time for FX Position Force Unloading</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
						<div className='col-sm-12 app-body-inner margin-bottom '>
							<form className='form-group no-border-content'>
								<div className='row app-body-content'>
									<div className='row'>
										<div className='col-xs-12 a-center'>
											<label>Branches Cut-Off Time</label>
										</div>
									</div>
									<div className='row a-center'>
										<label>BPI:</label>
										<input type='text' disabled="true" className="text-right" value={this.state.cutTime1} maxLength='5' />
										<input type='radio' disabled="true" checked={this.state.cutPeriod1 === "AM"} />A.M.
										<input type='radio' disabled="true" checked={this.state.cutPeriod1 === "PM"} />P.M.
									</div>
									<div className='row a-center'>
										<label>BFB:</label>
										<input type='text' disabled="true" className="text-right" value={this.state.cutTime2} maxLength='5' />
										<input type='radio' disabled="true" checked={this.state.cutPeriod2 === "AM"} />A.M.
										<input type='radio' disabled="true" checked={this.state.cutPeriod2 === "PM"} />P.M.
									</div>
								</div>
							</form>
						</div>
						<div className='col-sm-12 app-body-inner'>
							<form className='form-group no-border-content'>
								<div className='row app-body-content'>
									<div className='row a-center'>
										<label>Trading Unit: </label>
										<select disabled="true">
											<option>{this.state.trdrDesc}</option>
										</select>
									</div>
									<div className='row a-center'>
										<label>Squaring Cut Off Time: </label>
										<input type='text' className="text-right" name="scutTime" onChange={this.handleChange} value={this.state.scutTime} maxLength='5' />
										<input type='radio' onChange={this.handleChange} name="scutPeriod" value="AM" checked={this.state.scutPeriod === "AM"} />A.M.
										<input type='radio' onChange={this.handleChange} name="scutPeriod" value="PM" checked={this.state.scutPeriod === "PM"} />P.M.
									</div>
								</div>
							</form>
						</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Process' whenClicked={this.confirmProcess} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.props.Close} />
				</ViewFooter>
                {
                    this.state.dialog != null ?
                        this.state.dialog
                        : ''
                }
			</div>
			);
	}

});

module.exports = CutOffTimeRegularSquaringModify;