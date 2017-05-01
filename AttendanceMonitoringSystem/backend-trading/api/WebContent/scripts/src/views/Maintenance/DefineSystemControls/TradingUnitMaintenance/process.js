'use strict';

var React = require('react');

var ButtonComponent = require('../../../../components/ButtonComponent');
var AppHeader = require('../../../../components/AppHeader');
var AppHeaderTitle = require('../../../../components/AppHeaderTitle');
var AppBody = require('../../../../components/AppBody');
var ViewFooter = require('../../../../components/ViewFooter');
var Auth = require('../../../../auth/Auth');
var Table = require('../../../../components/TableComponent');
var API = require('../../../../api');
var SystemResponse = require('../../../../components/SystemResponse');
var ConfirmationPrompt = require('../../../../components/ConfirmationPrompt');


var TradingUnitMaintenanceProcess = React.createClass({
		contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){
		return ({
			data:null,
			delete_mode: '',
			modify_mode: '',
			title: '',
			//fields
			trdr_fi: '',
			tran_fi: '',
			trdr_desc: '',
			trdr_pcc: ''
		});
	},
	propTypes: {
			mode: React.PropTypes.string,
			data: React.PropTypes.object
	},
	componentDidMount: function(){
		var data = this.props.data;
		console.log(data);
		if(this.props.mode != 'add'){
			this.setState({
				trdr_fi: data.TRDR_FI,
				tran_fi: data.TRAN_FI,
				trdr_desc: data.TRDR_DESC.trim(),
				trdr_pcc: data.TRDR_PCC,
				forc_unld: data.FORC_UNLD
			});
		}

		switch(this.props.mode){
			case 'modify':
				this.setState({ modify_mode : true });
				this.setState({ delete_mode : false});
				break;
			case 'delete':
				this.setState({ delete_mode : true });
				this.setState({ modify_mode : false });
				break;
			case 'details':
				this.setState({delete_mode: true});
				this.setState({modify_mode: false});
		}

		$("#tradeCode").mask("000");
		$("#tranUnitCode").mask("AAA");
		$("#officeCode").mask("00-00-000");
	},
	ConfirmYes: function(){
		console.log(this.state.data);

		switch(this.props.mode){
			case 'add':
				this.Add();
				break;
			case 'modify':
				this.Modify();
				break;
			case 'delete':
				this.Delete();
				break;
		}		
	},
	ConfirmNo: function(){
		this.closeDialogBox();
		console.log("User changed mind");
	},
	Process:function(){
		console.log("mode:"+this.props.mode);

		var trdr_fi = this.state.trdr_fi;
		var tran_fi = this.state.tran_fi;
		var trdr_desc = this.state.trdr_desc;
		var trdr_pcc = this.state.trdr_pcc;
		var forc_unld = this.state.forc_unld;

		if(	trdr_fi == "" ||
			tran_fi == "" ||
			trdr_desc == "" ||
			trdr_pcc == "" )
		{
			this.setState({
				dialog: <SystemResponse 
						title='System Response' 
						content='Input Incomplete' 
						close={this.closeDialogBox} 
						/>
			});	
		}else{
			this.setState({
				data: {
					trdrFi: trdr_fi,
					tranFi: tran_fi,
					trdrDesc: trdr_desc,
					trdrPcc: trdr_pcc,
					forcUnld: forc_unld
				},
				dialog: <ConfirmationPrompt 
						title="Process"
						content={"Are you sure you want to "+this.props.mode+" record?"}
						yes={this.ConfirmYes}
						no={this.ConfirmNo}
						/>
			});
		}
		
	},
	Add:function(){
		// alert('Add');
		// console.log(data);
		
		API.maintenance_defsyscontrols.trading_unit_get(
			this.state.data,
			function(data){
				if(data.meta.code == 200 || data.meta.code == 0){
					this.setState({
						dialog: <SystemResponse 
									title="Successful" 
									content={data.meta.errorMessage} 
									close={this.closeDialogBox} />
					});	
				}else{
					this.setState({
						dialog: <SystemResponse 
									title="Error"
									content={data.meta.errorMessage}
									close={this.closeDialogBox}
									/>
					});
				}
			}.bind(this),
			function(data){
				this.setState({
					dialog: <SystemResponse
								title="Error"
								content="Cannot connect to middleware"
								close={this.closeDialogBox} />
				});
			}.bind(this)
			);
	},
	Delete:function(){
		// alert('Delete');
		// console.log(data);

		API.maintenance_defsyscontrols.trading_unit_delete(
			this.state.data,
			function(data){
				if(data.meta.code == 200 || data.meta.code == 0){
					this.setState({
						dialog: <SystemResponse 
									title="Successful" 
									content={data.meta.errorMessage} 
									close={this.closeDialogBox} />
					});	
				}else{
					this.setState({
						dialog: <SystemResponse 
									title="Error"
									content={data.meta.errorMessage}
									close={this.closeDialogBox}
									/>
					});
				}
			}.bind(this),
			function(data){
				this.setState({
					dialog: <SystemResponse
								title="Error"
								content="Cannot connect to middleware"
								close={this.closeDialogBox} />
				});
			}.bind(this)
			);
	},
	Modify:function(){
		// alert('Modify');
		// console.log(data);
		
		API.maintenance_defsyscontrols.trading_unit_modify(
			this.state.data,
			function(data){
				if(data.meta.code == 200 || data.meta.code == 0){
					this.setState({
						dialog: <SystemResponse 
									title="Successful" 
									content={data.meta.errorMessage} 
									close={this.closeDialogBox} />
					});	
				}else{
					this.setState({
						dialog: <SystemResponse 
									title="Error"
									content={data.meta.errorMessage}
									close={this.closeDialogBox}
									/>
					});
				}
			}.bind(this),
			function(data){
				this.setState({
					dialog: <SystemResponse
								title="Error"
								content="Cannot connect to middleware"
								close={this.closeDialogBox} />
				});
			}.bind(this)
			);
	},
	processSuccess: function (res) {
		// alert('Process Successful');
	},
	processFail: function (xhr, err) {
		// alert('Err: ' + err);
	},
	closeDialogBox: function () {
	  this.setState({dialog: null});
	},

	updateTradeCode: function(e){
		this.setState({trdr_fi: e.target.value});
	},
	updateTranUnitCode:function(e){
		this.setState({tran_fi: e.target.value});
	},
	updateOfficeCode: function(e){
		this.setState({trdr_pcc: e.target.value});
	},
	updateDescription: function(e){
		this.setState({trdr_desc: e.target.value});
	},
	updateForceUnloading: function(){
		this.setState({forc_unld: !this.state.forc_unld});
	},

	Close:function(event){
		this.context.router.push('/menu/trading_maintenance');
	},
	render:function(){
		return(
			<div className='app-border process_modal'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>Trade Unit File Maintenance</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
						<div className="a-center process-title"><h3>&gt;&gt;&gt; {this.props.mode} &lt;&lt;&lt;</h3></div>
						<div className='col-sm-12 app-body-inner'>
							<form className='form-group no-border-content'>
								<div className='row app-body-content'>
									<div className='row'>
										<div className='col-xs-6'>
											<div className='col-xs-4'>
												<h5>Code:</h5>
											</div>
											 <div className='col-xs-8 padding-left-20'>
											 	<input id="tradeCode" value={this.state.trdr_fi} onChange={this.updateTradeCode} className='form-control' type="text" placeholder="" disabled={this.state.delete_mode} />
											 </div>
										</div>
										<div className='col-xs-6'>
											<div className='col-xs-7'>
												<h5>Transacting Unit Code:</h5>
											</div>
											<div className='col-xs-5'>
												<input id="tranUnitCode" value={this.state.tran_fi} onChange={this.updateTranUnitCode} className='form-control' type="text" placeholder='' disabled={this.state.delete_mode} />
											</div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12'>
											<div className='col-xs-2'>
												<h5>Description:</h5>
												</div>
											 <div className='col-xs-9 col-xs-offset-1'>
											 	<input id="description" value={this.state.trdr_desc} onChange={this.updateDescription} className='form-control' type="text" placeholder="" disabled={this.state.delete_mode} />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12'>
											<div className='col-xs-2'>
												<h5>Office Code:</h5>
											</div>
											 <div className='col-xs-9 col-xs-offset-1'>
											 	<input id="officeCode" value={this.state.trdr_pcc} onChange={this.updateOfficeCode} className='form-control' type="text" placeholder="" disabled={this.state.delete_mode} />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12'>
											<div className='col-xs-10 col-xs-offset-2 padding-left-20'>
												<h5><input id="forceUnloading" className='' checked={this.state.forc_unld==="Y"?true:false} onChange={this.updateForceUnloading} type='checkbox' disabled={this.state.delete_mode} />with Force Unloading</h5>
											</div>
										</div>
									</div>
								</div>
							</form>
						</div>
				</AppBody>
				<ViewFooter>
					<div className='row'>
						{
							this.props.mode != 'details' ?
							<ButtonComponent ButtonName='Process' ButtonClass='btn btn-default' whenClicked={this.Process} />
							: null
						}
						<ButtonComponent ButtonName='Close'  ButtonClass='btn btn-default' whenClicked={this.props.close} />
					</div>
				</ViewFooter>
				{
					this.state.dialog != null ?
						this.state.dialog:
						''
				}
			</div>
			);
	}

});

module.exports = TradingUnitMaintenanceProcess;
