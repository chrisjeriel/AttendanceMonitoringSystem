var React = require('react');

var AppBody = require('../../../../components/AppBody');
var ViewFooter = require('../../../../components/ViewFooter');
var ButtonComponent = require('../../../../components/ButtonComponent');
var ApplicationCodeUpdateTextboxComponent = require('../../../../components/ApplicationCodeUpdateTextboxComponent');
var Auth = require('../../../../auth/Auth');
var API = require('../../../../api');
var ConfirmationPrompt = require('../../../../components/ConfirmationPrompt');
var SystemResponse = require('../../../../components/SystemResponse');
var AppHeader = require('../../../../components/AppHeader');
var AppHeaderTitle = require('../../../../components/AppHeaderTitle');

var ApplicationCode = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function () {
		var formArr = [];
		for (i = 0; i < 5; i++) {
			formArr.push({id: i, appCode: "", appDesc: "", disabled: "true"});
		} 

		return (
			{	
				dialog: '',
				formArr: formArr
			}
		);
	},
	ConfirmProcess: function (e) {
        this.setState({
            dialog: <ConfirmationPrompt title="Confirmation" content="Are you sure you want to save changes?" yes={this.Process} no={this.closeDialogBox} />
        });
	},
	componentDidMount:function(){
		this.loadData();
	},
	loadData: function () {
		var data = {};
		var that = this;

		API.maintenance_defsyscontrols.appcode_list(null,
			function (res) {
				data = res.data;
				var formArr = [];
				var nextDisabled = '';
				console.log("success");
				console.log(data);
		      	for (i = 0; i < 5; i++) {
		      		if (i < data.length) {
      					formArr.push({  id: i,
							appCode: data[i].APPL_CODE, 
							appDesc: data[i].APPL_DESC,
							disabled: '' });			
		      		} else {
						formArr.push({id: i, appCode: "", appDesc: "", disabled: nextDisabled});
						nextDisabled= 'true';
		      		}
			    }
				console.log(formArr);
		    	this.setState({ 
		    			formArr: formArr
		    		});
			}.bind(this),
			function (res) {
                this.setState({
                    dialog: <SystemResponse 
                                title="Error"
                                content="Cannot connect to middleware"
                                close={that.closeDialogBox} />
                });
			}.bind(this));

	}, 
	Process: function (e) {
		this.closeDialogBox;

		if (this.state.formArr[0].appCode && this.state.formArr[0].appDesc) {
			var data = [];
			var i = 0;
			while (i < 5 && (this.state.formArr[i].appCode && this.state.formArr[i].appDesc)) {
				data.push ({
					applCod: this.state.formArr[i].appCode,
					applDes: this.state.formArr[i].appDesc
				});
				i++;
			}
			console.log(data);
			e.preventDefault();
			API.maintenance_defsyscontrols.appcode_encode(data)
				.done(this.processSuccess)
				.fail(this.processFail);
		} else {
			this.setState({
                    dialog: <SystemResponse 
                                title="Error"
                                content="Please complete application code entries"
                                close={this.closeDialogBox} />
                });
		}
	},
	processSuccess: function (res) {
		this.setState({
            dialog: <SystemResponse title="System Response" content="FFF1VRBL APPL CODE SYSCTRL UPDATED" close={this.closeDialogBox} />
        });
	},

	processFail: function (xhr, err) {
		this.setState({
            dialog: <SystemResponse title="Error" content={err} close={this.closeDialogBox} />
        });
	},
    closeDialogBox: function () {
        this.setState({dialog: null});
    },
    handleChange: function (e) {
    	var name = e.target.name.slice(0, -1);
    	var id = Number(e.target.name.slice(-1));

    	var formArr = this.state.formArr;
		formArr[id][name] = e.target.value.toUpperCase();

		for (var x = 0; x < formArr.length; x++) {
			if (x == 0) {
	    		formArr[x]['disabled'] = '';
	    	} else {
	    		if (this.state.formArr[x-1].appCode && this.state.formArr[x-1].appDesc) {
	    			formArr[x]['disabled'] = '';
	    		} else {
	    			formArr[x]['disabled'] = 'true';
	    		}
	    	}
		}

    	this.setState({ 
    			formArr: formArr
    		});
    	
    },
	Close:function(){
		this.context.router.push('menu');
	},
	render:function(){
		var comps = [];

		for (var x = 0; x < 5; x++) {
			comps.push (<div className='row'>
							<div className='col-xs-12'>
								<div className='col-xs-1 a-center'>
									<h5>{x+1}.</h5>
								</div>
								<div className='col-xs-2'>
									<input className='form-control' type='text' value={this.state.formArr[x].appCode} onChange={this.handleChange} name={"appCode"+x} maxLength='2' 
									disabled={this.state.formArr[x].disabled} />
								</div>
								<div className='col-xs-1 a-center'>
									<h5 className='align-label'>-</h5>
								</div>
								<div className='col-xs-8'>
									<input className="form-control" type="text" value={this.state.formArr[x].appDesc} onChange={this.handleChange} name={"appDesc"+x} maxLength='30'
									 disabled={this.state.formArr[x].disabled} />
								</div>
							</div>
						</div>);
		}

		return(
			<div className='app-border'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>
							Application Code Update
						</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
						<div className=''><h5>  Please Enter Application Code and Description  </h5></div>
						<div className='col-sm-12 app-body-inner'>
							<form className='form-group no-border-content application-code-update'>
								<div className='row app-body-content'>
									<div className='row'>
										<div className='col-xs-12'>
											<div className='col-xs-3 col-xs-offset-1 a-center'>
												<h5>Application Code:</h5>
											</div>
											 <div className='col-xs-7 col-xs-offset-1 a-center'>
											 	<h5>Application Code Description</h5>
											 </div>
										</div>
									</div>
									{comps}
								</div>
							</form>
						</div>
				</AppBody>
				<ViewFooter>
					<div className='row'>
						<ButtonComponent ButtonClass='btn btn-default col-xs-2 col-xs-offset-4' ButtonName='Process' whenClicked={this.ConfirmProcess} />
						<ButtonComponent ButtonClass='btn btn-default col-xs-2' ButtonName='Close' whenClicked={this.Close} />
					</div>
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

module.exports = ApplicationCode;
