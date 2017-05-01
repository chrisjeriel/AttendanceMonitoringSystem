var React = require('react');

 var AppBody = require('../../../components/AppBody');
 var ViewFooter = require('../../../components/ViewFooter');
var ButtonComponent = require('../../../components/ButtonComponent');
var Auth = require('../../../auth/Auth');
var API = require('../../../api');
var AppHeader = require('../../../components/AppHeader');
var AppHeaderTitle = require('../../../components/AppHeaderTitle');
var SystemResponse = require('../../../components/SystemResponse');
var ConfirmationPrompt = require('../../../components/ConfirmationPrompt');

var LoaSignatures = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function () {
		var formArr = [];
		for (var i = 0; i < 5; i++) {
			formArr.push({id: i, lastName: "", middleName: "", 
				firstName: ""});
		} 
		return (
			{	
				dialog: null,
				formArr: formArr,
				trdrFi: "2",
				trdrDesc: null
			}
		)
	},
	loadDesc: function () {
		API.sys_ref.getByCode ("0131", function (res) {
			var trdrTable = res.data;
			var trdrFi = this.state.trdrFi;
			console.log("load reference table sucess");
			
			var desc = "NO DESCRIPTION AVAILABLE - " + trdrFi;	
				for (var y = 0; y < trdrTable.length; y++) {
					if (trdrTable[y].trdrFi === trdrFi) {
						desc = trdrTable[y].trdrDesc;
						break;
					}
				}

            this.setState({
                trdrDesc: desc 
            });
			}.bind(this),
			function (res) {
                this.setState({
                    dialog: <SystemResponse 
                                title="Error"
                                content="Cannot connect to middleware"
                                close={this.closeDialogBox} />
                });
			}.bind(this));
	},
	loadData: function () {
		var data = {};
		var that = this;

		API.maintenance_defsyscontrols.loa_signatories_list(this.state.trdrFi,
			function (res) {
				var data = res.data;
				console.log("success");
				console.log(data);

				var formArr = [];
				for (i = 0; i < 5; i++) {
					if (i < data.length) { 
						formArr.push({	id: i,
										lastName: data[i]['LOA_LNAME'], 
										middleName: data[i]['LOA_MNAME'], 
										firstName: data[i]['LOA_FNAME'],
									});
					} else {
						formArr.push({id: i, lastName: "", middleName: "", 
							firstName: ""});
					}
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
	componentDidMount:function(){
        this.loadDesc();
		this.loadData();
	},
	Process: function (e) {
		this.closeDialogBox;

		var data = [];
		var i = 1;

		for (var i = 0; i < this.state.formArr.length; i++) {
			data.push ({
		  		lastName: this.state.formArr[i].lastName,
		  		middleName: this.state.formArr[i].middleName,
		  		firstName: this.state.formArr[i].firstName
			});
		}

		console.log(data);
		e.preventDefault();
		API.maintenance_defsyscontrols.loa_signatories_encode(this.state.trdrFi, data)
			.done(this.processSuccess)
			.fail(this.processFail);
	},
	processSuccess: function () {
		this.setState({
            dialog: <SystemResponse title="System Response" content="FFF1SLOG SYSCTRL FILE UPDATED" close={this.closeDialogBox} />
        });
	},
	processFail: function (xhr, err) {
		this.setState({
            dialog: <SystemResponse title="Error" content={err} close={this.closeDialogBox} />
        });
	},
	confirmProcess: function () {
        this.setState({
            dialog: <ConfirmationPrompt title="Confirmation" content="Are you sure you want to save changes?" yes={this.Process} no={this.closeDialogBox} />
        })
	},
    closeDialogBox: function () {
        this.setState({dialog: null});
    },
	Close:function(){
		this.context.router.push('menu');
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
	render:function(){
		var comps = [];

		for (var x = 0; x < 5; x++) {
			comps.push (<div className="row">
							<div className="col-sm-4">
								<div className="row">
									<div className="col-sm-1"><label htmlFor={"lastName"+x}>{x+1}. </label></div>
									<div className="col-sm-10"><input type="text" name={'lastName'+x} onChange={this.handleChange} className="form-control" value={this.state.formArr[x].lastName}></input></div>
								</div>
							</div>
							<div className="col-sm-4">
								<div className="row">
									<div className="col-sm-11"><input type="text" name={'firstName'+x} onChange={this.handleChange} className="form-control" value={this.state.formArr[x].firstName}></input></div>
								</div>
							</div>
							<div className="col-sm-4">
								<div className="row">
									<div className="col-sm-11"><input type="text" name={'middleName'+x} onChange={this.handleChange} className="form-control" value={this.state.formArr[x].middleName}></input></div>
								</div>
							</div>
						</div>);
		}

		return(
			<div className='app-border'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>Change LOA Signatories</h5>
						{this.state.trdrDesc}
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className="row">
						<div className="col-sm-4">
							<label>Please Enter Names of Settlement Officers</label>
						</div>
					</div>
					<div className='col-sm-12 app-body-inner'>
						<div className="row">
							<div className="col-sm-4">
								<label>Last Name</label>
							</div>
							<div className="col-sm-4">
								<label>First Name</label>
							</div>
							<div className="col-sm-4">
								<label>Middle Name</label>
							</div>
						</div>
						{comps}
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

module.exports = LoaSignatures;