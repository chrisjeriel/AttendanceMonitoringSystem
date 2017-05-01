var React = require('react');

 var AppBody = require('../../../components/AppBody');
 var ViewFooter = require('../../../components/ViewFooter');
var ButtonComponent = require('../../../components/ButtonComponent');
var UpdateApprovingAuthorityLimitTextboxComponent = require('../../../components/UpdateApprovingAuthorityLimitTextboxComponent');
var Auth = require('../../../auth/Auth');
var API = require('../../../api');
var AppHeader = require('../../../components/AppHeader');
var AppHeaderTitle = require('../../../components/AppHeaderTitle');
var SystemResponse = require('../../../components/SystemResponse');
var ConfirmationPrompt = require('../../../components/ConfirmationPrompt');
var ApprovingAuthorityLimit = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function () {
		var formArr = [];
		for (var i = 0; i < 4; i++) {
			formArr.push({id: i, php: "", usd: "", 
				officerselected1: "", officerselected2: "", 
				officer1: "", officer2: "", override: "",
				officeroverride1: "", officeroverride2: "",});
		} 

		return (
			{	
				dialog: null,
				modal: null,
				formArr: formArr,
				id: null,
				name: null,
				off: null
			}
		);
	},
	componentDidMount: function() {
		this.loadData();	
	},
	loadData: function () {
		var data = {};
		var that = this;


		API.maintenance_defsyscontrols.authority_limit_list(null,
			function (res) {
				var data = res.data;
				console.log("success");

				var formArr = [];
				for (i = 0; i < 4; i++) {
					formArr.push({	id: i,
									php: Number(data[0]['PHP_LMIT'+(i+1)]).toString(), 
									usd: Number(data[0]['USD_LMIT'+(i+1)]).toString(), 
									officer1: data[0]['OFCR1_TYP'+(i+1)], 
									officer2: data[0]['OFCR2_TYP'+(i+1)], 
									override: Number(data[0]['OVRD_PTT'+(i+1)]).toString(),
									officerselected1: (data[0]['OFCR1_TYP'+(i+1)] !== '00' ? 'true' : ''),
									officerselected2: (data[0]['OFCR2_TYP'+(i+1)] !== '00' ? 'true' : ''),
									officeroverride1: '1',
									officeroverride2: '1',
								});
				} 


                this.setState({
                    formArr: formArr
                });
			}.bind(this),
			function (res) {
                this.setState({
                    dialog: <SystemResponse 
                                title="Error"
                                content="Cannot connect to middleware"
                                close={this.closeDialogBox} />
                });
			}.bind(this))
	}, 
	process: function (e) {
		this.closeDialogBox;

		var data = [];
		var i = 1;

		for (var i = 0; i < this.state.formArr.length; i++) {
			data.push ({
		  		phpLmt: this.state.formArr[i].php,
		  		ovrdPtt: this.state.formArr[i].override,
		  		ofcr1Typ: this.state.formArr[i].officer1,
		  		ofcr2Typ: this.state.formArr[i].officer2
			});
		}

		console.log(data);
		e.preventDefault();
		API.maintenance_defsyscontrols.authority_limit_encode(data)
			.done(this.processSuccess)
			.fail(this.processFail);
	},
	processSuccess: function (res) {
		console.log(res);
		if (res.meta.code == "200") {
			this.setState({
	            dialog: <SystemResponse title="System Response" content="Process successful" close={this.closeDialogBox} />
	        });
		} else {
			this.setState({
	            dialog: <SystemResponse title="System Response" 
	            	content={"Error " + res.meta.code + ": " + res.meta.errorMessage } 
	            	close={this.closeDialogBox} />
	        });

		}
	},

	processFail: function (xhr, err) {
		this.setState({
            dialog: <SystemResponse title="Error" content={err} close={this.closeDialogBox} />
        });
	},
	confirmProcess: function () {
		this.setState({
			modal: null,
            dialog: <ConfirmationPrompt title="Confirmation" content={"Are you sure you want to save changes?"} yes={this.process} no={this.closeDialogBox} />
        });
	},
	showUserTypeModal: function() {
		this.setState ({ modal: <UserType process={this.handleUserType} close={this.closeModal} /> });
	},
	handleUserType: function (off) {
		var name = this.state.name;
		var id = this.state.id;
        this.setState({modal: null});
    	var formArr = this.state.formArr;
    	formArr[id][name] = 'true';
    	formArr[id]['officer'+name.slice(-1)] = off;
    	this.setState({ 
    			formArr: formArr
    		});
	},
    closeModal: function () {
        this.setState({modal: null});
    },
	close:function(){
		this.context.router.push('menu');
	},
    closeDialogBox: function () {
        this.setState({dialog: null});
    },
    handleChange: function (e) {
    	var name = e.target.name.slice(0, -1);
    	var id = Number(e.target.name.slice(-1));

    	var formArr = this.state.formArr;
		formArr[id][name] = e.target.value;

    	this.setState({ 
    			formArr: formArr
    		});
    	
    },
    handleClick: function (e) {
    	var name = e.target.name.slice(0, -1);
    	var id = Number(e.target.name.slice(-1));

    	var formArr = this.state.formArr;
		if (formArr[id][name] === '') {
			this.setState({id: id, name: name});
			formArr = null;
			this.showUserTypeModal();
		} else {
			formArr[id][name] = '';
    		formArr[id]['officer'+name.slice(-1)] = '00';

			this.setState({ 
    			formArr: formArr
    		});
		}
    },
	render:function(){
		var comps = [];

		for (var x = 0; x < 4; x++) {
			comps.push (<UpdateApprovingAuthorityLimitTextboxComponent 
								formObj={this.state.formArr[x]}
								handleChange={this.handleChange} 
								handleClick={this.handleClick}
						>
								<label>
								{ x < 3 ? 'Maximum of' : 'More than' }
								</label>
						</UpdateApprovingAuthorityLimitTextboxComponent>);
		}

		return(
			<div className='app-border'>
                {
                    this.state.modal ?
                        this.state.modal
                        : ''
                }
				<AppHeader>
					<AppHeaderTitle>
						<h5>Update Approving Authority Limit</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className='col-sm-12 app-body-inner'>
						<form className='form-group no-border-content'>
							<div className='row app-body-content'>
								<div className='row'>
									<div className='col-xs-12 no-padding'>
										 <div className='col-xs-3 a-center'>
										 	<label>Amount in PHP</label>
										 </div>
										 <div className='col-xs-3'>
										 	<label className=''>Amount in USD</label>
										 </div>
										 <div className='col-xs-6 a-center'>
										 	<label>Minimum Approving Authority</label>
										 </div>										
									</div>
									<div className='col-xs-12 no-padding'>
										 <div className='col-xs-2 col-xs-offset-8 a-center'>
										 	<label>User Type</label>
										 </div>
										 <div className='col-xs-2 a-center'>
										 	<label>Points</label>
										 </div>										
									</div>
								</div>
								{comps}
							</div>
						</form>
					</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Process' 
						whenClicked={this.confirmProcess} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.close} />
				</ViewFooter>
                {
                    this.state.dialog != null ?
                        this.state.dialog
                        : ''
                }
	            {
	              this.state.modal ?
	                <div className='overlay'></div>
	                :''
	            }
			</div>
			);
	}

});

var UserType = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function () {
		return (
			{	
				value: "81"
			}
		);
	},
	handleClick: function (event) {
		var val = this.state.value;
		this.props.process(val);
	},
	handleChange: function (event) {
		this.setState({value: event.target.value});
	},
	render:function(){
		return(
			<div className='app-border process_modal'>
				<AppBody>
					<AppHeaderTitle>
						<h5>Select User Type</h5>
					</AppHeaderTitle>
					<form className='form-group no-border-content'>
						<div className='row app-body-content'>
							<div className='row'>
								<div className='col-xs-12 no-padding'>
									<select value={this.state.value} onChange={this.handleChange}>
										<option value="81">Branch Officer</option>
										<option value="83">Branch SR Service Associate</option>
									</select>
								</div>
							</div>
						</div>
					</form>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Accept' 
						whenClicked={this.handleClick} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.props.close} />
				</ViewFooter>
			</div>
			);
	}

});


module.exports = ApprovingAuthorityLimit;