var React = require('react');

var AppBody = require('../../../../components/AppBody');
var ViewFooter = require('../../../../components/ViewFooter');
var ButtonComponent = require('../../../../components/ButtonComponent');
var Auth = require('../../../../auth/Auth');
var API = require('../../../../api');
var Process = require('./process');
var List = require('./list');
var AppConstants = require('../../../../AppConstants');
var SystemResponse = require('../../../../components/SystemResponse');


var TransactingUnitMaintenance = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){
		return ({
			transacting_code: '',
			all_transacting: true,
			per_transacting: false,
			data: null
		});
	},
	componentDidMount: function(){
		this.loadMockData();
		$('#transactingUnitCode').mask('AA');
	},
	loadMockData: function(){
		var process_data = {
			code: 'BD',
			tradingUnitTag: 'NO',
			description: 'BPI FOREX STATION'
		};

		this.setState({data: process_data});
	},
	all_transacting:function(event){
		this.setState({ all_transacting : true });
		this.setState({ per_transacting : false });
	},
	per_transacting:function(event){
		this.setState({ per_transacting: true});
		this.setState({ all_transacting : false });
	},
	updateTransUnitCode: function(e){
		this.setState({transacting_code: e.target.value});
	},
	showProcessModal: function(process_mode, data){
		this.setState({ 	
			process_mode: process_mode,
			process_modal: 
				<div>
					<Process mode={process_mode} data={data} close={this.closeProcessModal}/>
					<div className="overlay" />
				</div>
		});
	},
	showListModal: function(){
		API.maintenance_defsyscontrols.transacting_unit_list(
            null,
            function(data){
                if(data.meta.code == 200 || data.meta.code == 0){
                    this.setState({ 	
                    	process_mode: 'list',
		 				process_modal: 
						<div>
							<List data={data.data} close={this.closeProcessModal}/>
							<div className="overlay" />
						</div>
					});
                }else{
                    this.setState({
                        process_mode: 'list',
                        process_modal: <SystemResponse title="Error" content={data.meta.errorMessage} close={this.closeProcessModal} />
                    });
                }
            }.bind(this),
            function(data){
                this.setState({   
                    process_mode: 'list',
                    process_modal: 
                        <SystemResponse title="Process" content={AppConstants.ERROR_CANNOT_CONNECT} close={this.closeProcessModal}/>
                });
            }.bind(this)
           );
	},
	perTransactingProcess: function(process_mode){
		console.log(this.state.transacting_code);
		var transCode = this.state.transacting_code;
		if(process_mode != 'add'){
			API.maintenance_defsyscontrols.transacting_unit_get(
				{
					tran_fi: transCode
				},
				function(data){
					console.log('success');
					console.log(data);
					if(data.meta.code == 200 || data.meta.code == 0){
						this.showProcessModal(process_mode, data.data[0]);
					}else{
						this.setState({
							process_mode: process_mode,
							process_modal: <SystemResponse
											title="Error"
											content={data.meta.errorMessage}
											close={this.closeProcessModal} />
						});
					}
				}.bind(this),
				function(data){
					console.log('error');
					console.log(data);
					this.setState({
						process_mode: 	process_mode,
						process_modal: <SystemResponse 
										title="Error" 
										content={AppConstants.ERROR_CANNOT_CONNECT} 
										close={this.closeProcessModal} />
					})
				}.bind(this)
				);
		}else{
			this.showProcessModal(process_mode, null);
		}
	},
	validation: function (process_mode) {
	  	var state = null;

		if(process_mode == 'list')
		{
		 	this.showListModal();
		}
		else if(this.state.transacting_code === "" && process_mode != 'add')
		{
		 	this.setState({ 	
		 		process_mode: process_mode,
				process_modal: <SystemResponse title="Process" content="Input Incomplete" close={this.closeProcessModal}/>
			});
		} 
		else
		{
			this.perTransactingProcess(process_mode);
		}
	  //add switch case for add edit delete

	  this.setState(state);
	},
	closeProcessModal: function () {
	  this.setState({process_mode: null});
	},
	Close:function(){
		this.context.router.push('menu');
	},
	render:function(){
		return(
			<div className='app-border'>
				{
					this.state.process_mode ?
						this.state.process_modal
						: ''
				}
				<AppBody>
						<div className='col-sm-12 app-body-inner'>
							<form className='form-group no-border-content'>
								<div className='row app-body-content'>
									<div className='row no-padding'>
										<div className='col-xs-12 col-sm-6 col-sm-offset-3 padding-content'>
											<div className='col-xs-6 no-padding'>
												<h5><label><input className="" type="radio" name='transaction' defaultChecked='checked' onClick={this.all_transacting} />
											 	All Transacting Units</label></h5>
											</div>
											 <div className='col-xs-6 no-padding'>
												<h5><label><input className="" type="radio" name='transaction' onClick={this.per_transacting} />
											 	Per Transacting Unit</label></h5>
											 </div>
										</div>
									</div>
									<div className='row no-padding'>
										<div className='col-xs-12 padding-content'>
											<div className='col-xs-3 col-xs-offset-3 align-right'>
												<h5>Transacting Unit Code:</h5>
											</div>
											<div className='col-xs-2 align-left'>
												<input id="transactingUnitCode" value={this.state.transacting_code} onChange={this.updateTransUnitCode} className="form-control" type="text" disabled={this.state.all_transacting} />
											</div>
										</div>
									</div>
								</div>
							</form>
						</div>
				</AppBody>
				<ViewFooter>
					<div className='row'>
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Add' whenClicked={this.validation.bind(this, 'add')} Disable={this.state.all_transacting} />
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Delete' whenClicked={this.validation.bind(this, 'delete')} Disable={this.state.all_transacting} />
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='List' whenClicked={this.validation.bind(this, 'list')} Disable={this.state.per_transacting} />
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.Close} />
					</div>
				</ViewFooter>
			</div>
			);
	}

});


module.exports = TransactingUnitMaintenance;
