var React = require('react');

var ButtonComponent = require('../../../../components/ButtonComponent');
var AppHeader = require('../../../../components/AppHeader');
var AppHeaderTitle = require('../../../../components/AppHeaderTitle');
var AppBody = require('../../../../components/AppBody');
var ViewFooter = require('../../../../components/ViewFooter');
var Auth = require('../../../../auth/Auth');
var Table = require('../../../../components/TableComponent');
var API = require('../../../../api');
var ConfirmationPrompt = require('../../../../components/ConfirmationPrompt');
var SystemResponse = require('../../../../components/SystemResponse');
var AppConstants = require('../../../../AppConstants');

var TransactingUnitMaintenanceProcess = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){

		return ({
			data:null,
			add_mode: '',
			view_mode: '',
			// fields
			tran_fi: '',
			trdr_tag: '',
			tran_desc: ''

		});
	},
	componentWillReceiveProps: function (props) {
		this.Redirect(props.params.mode);
	},
	componentDidMount: function(){
		console.log(data);
		var data = this.props.data;
		if(this.props.mode != 'add'){
			this.setState({
				tran_fi: data.TRAN_FI,
				trdr_tag: data.TRDR_TAG,
				tran_desc: data.TRAN_DESC.trim()
			});	
		}

		this.Redirect(this.props.mode);
	},
	Redirect:function(mode){
		switch(mode){
			case 'add':
				this.setState({ view_mode : '' });
				this.setState({ add_mode: 'true'});
				break;
			case 'details':
				this.setState({ view_mode : 'true' });
				this.setState({ add_mode: 'true'});
				break;
			case 'delete':
				this.setState({ view_mode : 'true' });
				this.setState({ add_mode: 'true'});
				break;
			default:
				this.context.router.push('menu');
		}
	},
	Process:function(){
		var mTranFi = this.state.tran_fi;
		var mTrdrTag = this.state.trdr_tag;
		var mTranDesc = this.state.tran_desc;
		// var mode = this.props.mode;

		// console.log("mode"+mode);

		if(	mTranFi == "" || 
			mTrdrTag == "" || 
			mTranDesc == "")
		{
			this.setState({
				dialog: <SystemResponse	title='Process' content='Incomplete Input' close={this.closeDialogBox} />
			});
		}else{
			this.setState({
				data: {
						"tranFi": mTranFi,
						"tranDesc": mTranDesc
					},
				dialog: <ConfirmationPrompt 
							title="Confirmation"
							content={"Are you sure you want to "+ this.props.mode +" record?"}
							yes={this.ConfirmYes}
							no={this.ConfirmNo} 
							/>
			});
			
		}

	},
	ConfirmYes: function(){
		this.closeDialogBox();
		switch(this.props.mode){
			case 'add':
				this.Add();
				break;
			case 'details':
				this.Details();
				break;
			case 'delete':
				this.Delete();
				break;
		}
	},
	ConfirmNo: function(){
		this.closeDialogBox();
		console.log('User changed mind');
	},
	Add:function(){

		API.maintenance_defsyscontrols.transacting_unit_add(
			this.state.data,
			function(data){
				if(data.meta.code==200 || data.meta.code==0){
					this.setState({
						dialog: <SystemResponse title="Successful" content={data.meta.errorMessage} close={this.closeDialogBox} />
					});
				}else{
					this.setState({
						dialog: <SystemResponse title="Error" content={data.meta.errorMessage} close={this.closeDialogBox} />
					});
				}
			}.bind(this),
			function(){
				this.setState({
					dialog: <SystemResponse title="Error"
											content={AppConstants.ERROR_CANNOT_CONNECT}
											close={this.closeDialogBox} />
				});
			}.bind(this)
			);
		
	},
	Details:function(){

		API.transacting_unit_maintenance.Details(this.state.data)
			.done(this.processSuccess)
			.fail(this.processFail);
	},
	Delete:function(){

		API.maintenance_defsyscontrols.transacting_unit_delete(
			this.state.data,
			function(data){
				if(data.meta.code==200 || data.meta.code==0){
					this.setState({
						dialog: <SystemResponse title="Successful" content={data.meta.errorMessage} close={this.closeDialogBox} />
					});
				}else{
					this.setState({
						dialog: <SystemResponse title="Error" content={data.meta.errorMessage} close={this.closeDialogBox} />
					});
				}
			}.bind(this),
			function(){
				this.setState({
					dialog: <SystemResponse title="Error"
											content={AppConstants.ERROR_CANNOT_CONNECT}
											close={this.closeDialogBox} />
				});
			}.bind(this)
			);
	},

	updateCode: function(e){
		this.setState({tran_fi: e.target.value});
	},
	updateTradingTag: function(e){
		this.setState({trdr_tag: e.target.value});
	},
	updatetran_desc: function(e){
		this.setState({tran_desc: e.target.value});
	},

	processSuccess: function (res) {
		// alert('Process Successful');
		this.setState({
			dialog: <SystemResponse title='Process' content='Successful' close={this.closeDialogBox} />
		});
	},
	processFail: function (xhr, err) {
		this.setState({
			dialog: <SystemResponse title='Process' content='Something went wrong' close={this.closeDialogBox} />
		});
	},
	closeDialogBox: function(){
		this.setState({dialog: null});
	},
	Close:function(event){
		this.context.router.push('/menu/trading_maintenance');
	},
	render:function(){
		return(
			<div className='app-border process_modal'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>Transacting Unit File Maintenance</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
						<div className="a-center process-title"><h3>&gt;&gt;&gt;{this.props.mode}&lt;&lt;&lt;</h3></div>
						<div className='col-sm-12 app-body-inner'>
							<form className='form-group no-border-content'>
								<div className='row app-body-content'>
									<div className='row'>
										<div className='col-xs-6'>
											<div className='col-xs-4'>
												<h5>Code:</h5>
											</div>
											 <div className='col-xs-8 padding-left-20'>
											 	<input id="tran_fi" value={this.state.tran_fi} onChange={this.updateCode} className='form-control' type='text' disabled={this.state.view_mode} />
											 </div>
										</div>
										<div className='col-xs-6'>
											<div className='col-xs-6'>
												<h5>Trading Unit Tag:</h5>
											</div>
											<div className='col-xs-6'>
												<input id="trdr_tag" value={this.state.trdr_tag} onChange={this.updateTradingTag} className='form-control' type='text' disabled={this.state.view_mode} />
											</div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12'>
											<div className='col-xs-2'>
												<h5>Description:</h5>
												</div>
											 <div className='col-xs-9 col-xs-offset-1'>
											 	<input id="tran_desc" value={this.state.tran_desc} onChange={this.updatetran_desc} className='form-control' type='text' disabled={this.state.view_mode} />
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
							<ButtonComponent ButtonClass='btn btn-default' ButtonName='Process' whenClicked={this.Process} />
							: null
						}
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.props.close} />
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

module.exports = TransactingUnitMaintenanceProcess;
