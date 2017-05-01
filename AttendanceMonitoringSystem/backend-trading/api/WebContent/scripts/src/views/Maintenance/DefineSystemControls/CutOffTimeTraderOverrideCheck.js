var React = require('react');

var AppBody = require('../../../components/AppBody');
var ViewFooter = require('../../../components/ViewFooter');
var AmPmRadio = require('../../../components/RadioButtonAmPm');
var ButtonComponent = require('../../../components/ButtonComponent');
var Auth = require('../../../auth/Auth');
var API = require('../../../api');
var AppHeader = require('../../../components/AppHeader');
var AppHeaderTitle = require('../../../components/AppHeaderTitle');
var SystemResponse = require('../../../components/SystemResponse');
var ConfirmationPrompt = require('../../../components/ConfirmationPrompt');

var CutOffTimeOverrideCheckBpiBtsu = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function () {
		return (
			{	
				cutTime1: "0000",
				cutPeriod1: "AM",
				cutTime2: "0000",
				cutPeriod2: "PM",
				specialRate: 0,
				sOverride: "N",
				sTrackDays: "0",
				sTrackIndc: "0",
				sTrackAmnt: "0",
				pOverride: "N",
				pTrackDays: "0",
				pTrackIndc: "0",
				pTrackAmnt: "0",
			}
		);
	},
	componentDidMount: function() {
		this.loadData();	
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
	Process: function (e) {
		this.closeDialogBox();
		var valid = true;

		var cutTime1 = this.timeToNumber(this.state.cutTime1, this.state.cutPeriod1);
		var cutTime2 = this.timeToNumber(this.state.cutTime2, this.state.cutPeriod2);

		if (cutTime1 === null) {
			this.setState({
	            dialog: <SystemResponse title="System Response" content="Invalid BPI Cut-Off Time. Please try again." close={this.closeDialogBox} />
	        });
	        valid = false;
		}

		if (cutTime2 === null && valid) {
			this.setState({
	            dialog: <SystemResponse title="System Response" content="Invalid BFB Cut-Off Time. Please try again." close={this.closeDialogBox} />
	        });
	        valid = false;
		}

		if (this.state.specialRate.toString().match(/^[0-9]*$/) === null && valid) {
			this.setState({
	            dialog: <SystemResponse title="System Response" content="Special Rate Validity period should be a number between 1-99." close={this.closeDialogBox} />
	        });
	        valid = false;
		}

		if (Number(this.state.specialRate) <= 0 && valid) {
			this.setState({
	            dialog: <SystemResponse title="System Response" content="Special Rate Validity period should not be set to 0 minutes." close={this.closeDialogBox} />
	        });
	        valid = false;
		}

		if (Number(this.state.specialRate) > 99 && valid) {
			this.setState({
	            dialog: <SystemResponse title="System Response" content="Special Rate Validity period should not be set to more than 99 minutes." close={this.closeDialogBox} />
	        });
	        valid = false;
		}

		if (valid) {
			var data = {
				  		cutTime1: cutTime1,
				  		cutTime2: cutTime2,
				  		rateVprd: this.state.specialRate.toString(),
				  		povrdInc: this.state.pOverride,
				  		sovrdInc: this.state.sOverride
			};
			e.preventDefault();
			console.log(data);
			API.maintenance_defsyscontrols.cutoff_check_post(data)
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
            dialog: <SystemResponse title="System Response" content="Process successful" close={this.closeDialogBox} />
        });
	},
	processFail: function (xhr, err) {
		this.setState({
            dialog: <SystemResponse title="Error" content={err} close={this.closeDialogBox} />
        });
	},
	loadData: function () {
		API.maintenance_defsyscontrols.cutoff_check(null,
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
					specialRate: Number(data[0]['RATE_VPRD']),
					sOverride: data[0]['SOVRD_INDC'],
					sTrackDays: Number(data[0]['STRCK_DAYS']),
					sTrackIndc: data[0]['STRCK_INDC'],
					sTrackAmnt: Number(data[0]['STRCK_AMNT']),
					pOverride: data[0]['POVRD_INDC'],
					pTrackDays: Number(data[0]['PTRCK_DAYS']),
					pTrackIndc: data[0]['PTRCK_INDC'],
					pTrackAmnt: Number(data[0]['STRCK_AMNT']),
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
			}.bind(this))
	}, 
    handleChange: function (e) {
    	var name = e.target.name;
    	var val = e.target.value;
    	var obj = {};
    	obj[name] = val;

    	this.setState (obj);
    },
    handleCheckbox: function (e) {
    	var name = e.target.name;
    	var val = this.state[name];
		
		var obj = {};
    	if (val === "Y") {
    		val = "N";
    	} else {
    		val = "Y";
    	}

    	obj[name] = val;

    	this.setState (obj);
    },
    closeDialogBox: function () {
        this.setState({dialog: null});
    },
	Close:function(){
		this.context.router.push('menu');
	},
	render:function(){
		return(
			<div className='app-border'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>Set Time and Override Clock</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className='col-sm-12 app-body-inner'>
						<form className='form-group'>
							<div className='row app-body-content'>
								<div className='row no-padding'>
									<div className='col-xs-12 padding-content'>
										<div className='col-xs-2 col-xs-offset-2 no-padding'>	
												<h5>BPI Cut-Off Time</h5>
										</div>
										<div className='col-xs-2 no-padding' >
												<input className="form-control text-right" type="text" onChange={this.handleChange} name="cutTime1" value={this.state.cutTime1}  maxLength='5' />											
										</div>
										 <div className='col-xs-2 col-xs-offset-1'>
											<label className=''>
												<input type='radio' checked={this.state.cutPeriod1 === "AM"} onChange={this.handleChange} name="cutPeriod1" value="AM" />A.M.</label>&nbsp;
											<label className=''>
												<input type='radio' checked={this.state.cutPeriod1 === "PM"} onChange={this.handleChange} name="cutPeriod1" value="PM" />P.M.</label>
										 </div>
									</div>
								</div>
								<div className='row no-padding'>
									<div className='col-xs-12 padding-content'>
										<div className='col-xs-2 col-xs-offset-2 no-padding'>	
												<h5>BFB Cut-Off Time</h5>
										</div>
										 <div className='col-xs-2 no-padding'>
											<input className="form-control text-right" type="text" onChange={this.handleChange} name="cutTime2" value={this.state.cutTime2}  maxLength='5' />
										 </div>
										 <div className='col-xs-2 col-xs-offset-1'>
											<label className=''>
												<input type='radio' checked={this.state.cutPeriod2 === "AM"} onChange={this.handleChange} name="cutPeriod2" value="AM" />A.M.</label>&nbsp;
											<label className=''>
												<input type='radio' checked={this.state.cutPeriod2 === "PM"} onChange={this.handleChange} name="cutPeriod2" value="PM" />P.M.</label>
										 </div>
									</div>
								</div>
								<div className='row no-padding'>
									<div className='col-xs-4 col-xs-offset-2'>
											<h5>Special Rate Validity in Minutes:  </h5>
									</div>
									<div className='col-xs-4'>
											<input className="form-control  text-right" onChange={this.handleChange} name="specialRate" value={this.state.specialRate} type="number" />
									</div>
								</div>
							</div>
							<div className='row app-body-content'>
								<div className='row no-padding'>
									<div className='col-xs-4 col-xs-offset-2'>
										<h5>PURCHASE</h5>
									</div>
								</div>
								<div className='row no-padding'>
									<div className='col-xs-8 col-xs-offset-2 '>
										<h5><input type='checkbox' checked={this.state.pOverride === "Y"} name="pOverride" onClick={this.handleCheckbox} /><span>Override Check</span></h5>
									</div>
								</div>
								<div className='row no-padding'>
									<div className='col-xs-8 col-xs-offset-2'>
										<h5><input type='checkbox' disabled="true" checked={this.state.pTrackIndc === "Y"} /><span>Transaction Tracking</span></h5>
									</div>
								</div>

								<div className='row no-padding'>
									<div className='col-xs-4 col-xs-offset-2'>
											<h5>No. of Calendar Days: </h5>
									</div>
									<div className='col-xs-4'>
											<input className="form-control  text-right" disabled="true" value={this.state.pTrackDays} type="text" />	
									</div>
								</div>
								<div className='row no-padding'>
									<div className='col-xs-4 col-xs-offset-2 '>
											<h5>Amount Limit per Client (in USD): </h5>									
									</div>
									<div className='col-xs-4'>
											<input className="form-control  text-right" disabled="true" value={this.state.pTrackAmnt} type="text" />	
									</div>
								</div>
							</div>
							<div className='row app-body-content'>
								<div className='row no-padding'>
									<div className='col-xs-4 col-xs-offset-2'>
										<h5>SALE</h5>
									</div>
								</div>
								<div className='row no-padding'>
									<div className='col-xs-8 col-xs-offset-2 '>
										<h5><input type='checkbox' checked={this.state.sOverride === "Y"} name="sOverride" onClick={this.handleCheckbox} /><span>Override Check</span></h5>
									</div>
								</div>
								<div className='row no-padding'>
									<div className='col-xs-8 col-xs-offset-2' >
										<h5><input type='checkbox' disabled="true" checked={this.state.sTrackIndc === "Y"} /><span>Transaction Tracking</span></h5>
									</div>
								</div>

								<div className='row no-padding'>
									<div className='col-xs-4 col-xs-offset-2'>
											<h5>No. of Calendar Days: </h5>
									</div>
									<div className='col-xs-4'>
											<input className="form-control  text-right" disabled="true" value={this.state.sTrackDays} type="text" />	
									</div>
								</div>
								<div className='row no-padding'>
									<div className='col-xs-4 col-xs-offset-2 '>
											<h5>Amount Limit per Client (in USD): </h5>									
									</div>
									<div className='col-xs-4'>
											<input className="form-control  text-right" disabled="true" value={this.state.sTrackAmnt} type="text" />	
									</div>
								</div>
							</div>
						</form>
					</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Process' whenClicked={this.confirmProcess} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.Close} />
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

module.exports = CutOffTimeOverrideCheckBpiBtsu;
