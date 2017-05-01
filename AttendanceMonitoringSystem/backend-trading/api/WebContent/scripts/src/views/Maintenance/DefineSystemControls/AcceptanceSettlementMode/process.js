'use strict';

var React = require('react');

var ButtonComponent = require('../../../../components/ButtonComponent');
var AppHeader = require('../../../../components/AppHeader');
var AppHeaderTitle = require('../../../../components/AppHeaderTitle');
var AppBody = require('../../../../components/AppBody');
var ViewFooter = require('../../../../components/ViewFooter');
var Auth = require('../../../../auth/Auth');
// var Table = require('../../../../components/TableComponent');
var API = require('../../../../api');
var SystemResponse = require('../../../../components/SystemResponse');
var AppConstants = require('../../../../AppConstants');

var AcceptanceSettlementModeProcess = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){
		return ({
			data: null,
			code_disable: false,
			details_disable: false,
			modeCode: '',
			modeDesc: '',
			mcroTag: '',
			activeTag: '',
			phpTag: '',
			list_mode: ''
		});
	},
	componentWillReceiveProps: function (props) {
		this.Redirect(props.mode);
	},
	componentDidMount: function(){
		this.Redirect(this.props.mode);
		var data = this.props.data;

		if(this.props.mode != 'add'){
			this.setState({
				modeCode: data.MODE_CODE,
				modeDesc: data.MODE_DESC.trim(),
				mcroTag: data.MCRO_TAG,
				activeTag: data.ACTV_TAG,
				phpTag: data.PHP_TAG
			});
		}

		this.updateTypeRB('deposit');
	},
	Redirect:function(mode){
		switch(mode){
			case 'add':
				this.setState({ code_disable: false,
								details_disable: false,
								process_disable: false });
				break;
			case 'details':
				this.setState({ code_disable: true,
								details_disable: true,
								process_disable: true });
				break;
			case 'modify':
				this.setState({ code_disable: true,
								details_disable:false,
								process_disable: false });
				break;
			default:
				this.context.router.push('menu');
		}
	},
	Process:function(){
		
		switch(this.props.mode){
			case 'add':
				this.Add();
				break;
			case 'details':
				this.Details();
				break;
			case 'modify':
				this.Modify();
				break;
		}

	},
	Add:function(){

		var processData = {
			"modeCode": this.state.modeCode,
			"modeDesc": this.state.modeDesc,
			"mcroTag": this.state.mcroTag,
			"actvTag": this.state.activeTag,
			"phpTag": this.state.phpTag
		}

		API.maintenance_defsyscontrols.acceptance_settlement_add(
			processData,
			function(data){
				if(data.meta.code == 200 || data.meta.code == 0){
					this.setState({
						dialog: <SystemResponse title="Success" content="Add Success" close={this.closeDialog} />
					});
				}else{
					this.setState({
						dialog: <SystemResponse title="Error" content={AppConstants.ERROR_PROCESS} />
					});
				}
			}.bind(this),
			function(data){
				this.setState({
					dialog: <SystemResponse title="Error" content={AppConstants.ERROR_CANNOT_CONNECT} close={this.closeDialog} />
				})
			}.bind(this)
			);
	},
	Modify:function(){

		var processData = {
			"modeCode": this.state.modeCode,
			"modeDesc": this.state.modeDesc,
			"mcroTag": this.state.mcroTag,
			"actvTag": this.state.activeTag,
			"phpTag": this.state.phpTag
		}

		API.maintenance_defsyscontrols.acceptance_settlement_modify(
			processData,
			function(data){
				if(data.meta.code == 200 || data.meta.code == 0){
					this.setState({
						dialog: <SystemResponse title="Success" content="Update Success" close={this.closeDialog} />
					});
				}else{
					this.setState({
						dialog: <SystemResponse title="Error" content={AppConstants.ERROR_PROCESS} />
					});
				}
			}.bind(this),
			function(data){
				console.log(data);
				this.setState({
					dialog: <SystemResponse title="Error" content={AppConstants.ERROR_CANNOT_CONNECT} close={this.closeDialog} />
				})
			}.bind(this)
			);
	},
	closeDialog: function(){
		this.setState({dialog: null});
	},
	updateTypeRB: function(type){
		this.setState({
			modeType_cash: false,
			modeType_deposit: false,
			modeType_check: false,
			modeType_specialSqr: false,
			modeType_regularSqr: false
		})

		switch(type){
			case 'cash':
				this.setState({modeType_cash: true});
				break;
			case 'deposit':
				this.setState({modeType_deposit: true});
				break;
			case 'check':
				this.setState({modeType_check:true});
				break;
			case 'special':
				this.setState({modeType_specialSqr: true});
				break;
			case 'regular':
				this.setState({modeType_regularSqr: true});
				break;
		}
	},
	updateModeType: function(e){
		var modeType = e.target.id;
		if(this.props.mode != 'details'){
			this.setState({mcroTag: modeType});
			this.updateTypeRB(modeType);
		}

	},
	updateActiveTag: function(){
		if(this.state.activeTag === "Y"){
			this.setState({activeTag: "N"});
		}else{
			this.setState({activeTag: "Y"});
		}
	},
	updatePhpTag: function(){
		if(this.state.phpTag === "Y"){
			this.setState({phpTag: "N"});
		}else{
			this.setState({phpTag: "Y"});
		}
	},
	Close:function(event){
		this.context.router.push('/menu/list_acceptance_settlement');
	},

	render:function(){
		var title
		return(
			<div>
			<div className='app-border process_modal'>
				<AppBody>
						<div className="a-center process-title"><h3>&gt;&gt;&gt;{this.props.mode}&lt;&lt;&lt;</h3></div>
						<div className='col-sm-12 app-body-inner'>
							<form className='form-group no-border-content'>
								<div className='row app-body-content'>
									<div className='row'>
										<div className='col-xs-12'>
											<div className='col-xs-4'>
												<h5>Mode Code:</h5>
											</div>
											 <div className='col-xs-8'>
											 	<input className="form-control" type="text" value={this.state.modeCode} disabled={this.state.code_disable} />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12'>
											<div className='col-xs-4'>
												<h5>Description:</h5>
												</div>
											 <div className='col-xs-8'>
											 	<input className="form-control" type="text" value={this.state.modeDesc} disabled={this.state.details_disable} />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-8'>
											<div className='col-xs-4'>
												<h5>Mode Type:</h5>
											</div>
											 <div className='col-xs-8'>
											 	<div className='col-xs-12'>
											 		<label><input id="cash" className="" type="radio" onChange={this.updateModeType} checked={this.state.modeType_cash} name='mode' />
											 		Cash</label>
											 	</div>
											 	<div className='col-xs-12'>
											 		<label><input id="deposit" className="" type="radio" onChange={this.updateModeType} checked={this.state.modeType_deposit} name='mode' />
											 		Deposit</label>
											 	</div>
											 	<div className='col-xs-12'>
											 		<label><input id="check" className="" type="radio" onChange={this.updateModeType} checked={this.state.modeType_check} name='mode' />
											 		Check</label>
											 	</div>
											 	<div className='col-xs-12'>
											 		<label><input id="special" className="" type="radio" onChange={this.updateModeType} checked={this.state.modeType_specialSqr} name='mode' />
											 		Special Squaring</label>
											 	</div>
											 	<div className='col-xs-12'>
											 		<label><input id="regular" className="" type="radio" onChange={this.updateModeType} checked={this.state.modeType_regularSqr} name='mode' />
											 		Regular Squaring</label>
											 	</div>
											 </div>
										</div>
										<div className='col-xs-4'>
											<div className='col-xs-12'>
												<h5><label><input type='checkbox' checked={this.state.activeTag==="Y"?true :false} onClick={this.updateActiveTag} disabled={this.state.details_disable}/>
												Active</label></h5>
											</div>
											<div className='col-xs-12'>
												<h5><label><input type='checkbox' checked={this.state.phpTag==="Y"?true :false} onClick={this.updatePhpTag} disabled={this.state.details_disable} />
												PHP</label></h5>
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
								<ButtonComponent ButtonClass='btn btn-default' ButtonName='Process' whenClicked={this.Process} Disable={this.state.process_disable} />
							: null	
						}
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.props.close} />
					</div>
				</ViewFooter>
			</div>
				{
					this.state.dialog != null ?
						this.state.dialog
						: null
				}
			</div>
			);
	}

});

module.exports = AcceptanceSettlementModeProcess;
