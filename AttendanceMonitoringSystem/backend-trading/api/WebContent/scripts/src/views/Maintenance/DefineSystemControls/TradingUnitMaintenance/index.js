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

var TradingUnitMaintenance = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){
		return ({
			trade_code: '',
			all_trading: true,
			per_trading: false,
			modal_open: false
		});
	},
	componentDidMount: function(){
		this.loadMockData();

		$('#tradeCode').mask('000');
	},
	loadMockData:function(){
	  var data = [
		  {
			trade_code: '1',
            tran_unit_code: 'BT',
            description: 'BRANCHES TREASURY SUPPORT UNIT',
            office_code: '99-02-049',
            force_unloading: 'N'
          },
		  {
			trade_code: '2',
            tran_unit_code: 'BT',
            description: 'BPI FOREX CORP',
            office_code: '99-02-046',
            force_unloading: 'Y'
          }
        ] ;

	  this.setState({process_data: data});
	},
	all_trading:function(event){
		this.setState({ all_trading : true });
		this.setState({ per_trading : false });
	},
	per_trading:function(event){
		this.setState({per_trading: true});
		this.setState({ all_trading : false });
	},
	updateTradingUnitCode: function(e){
		var val = e.target.value;
		this.setState({trade_code: val});
	},
	processSuccess: function (res) {
	  //need to connect this to table
	},
	processFail: function (xhr, err) {
	  alert('Err: ' + err);
	},
	closeProcessModal: function () {
        this.setState({process_mode: null});
    },
    perTradingProcess: function(process_mode){
    	var tradeCode = this.state.trade_code;

    	if(process_mode != 'add'){
    		API.maintenance_defsyscontrols.trading_unit_get(
	    		{
	    			trdr_fi: tradeCode
	    		},
	    		function(data){
	    			if(data.meta.code == 200 || data.meta.code == 0){
	    				this.showProcessModal(process_mode, data.data[0]);
	    			}else{
						this.setState({
							process_mode: process_mode,
	    					process_modal: <SystemResponse title="Error" content={data.meta.errorMessage} close={this.closeProcessModal} />
	    				});
	    			}
	    		}.bind(this),
	    		function(data){
	    			this.setState({
							process_mode: process_mode, 	
							process_modal: 
							<SystemResponse title="Process" content={AppConstants.ERROR_CANNOT_CONNECT} close={this.closeProcessModal}/>
					});
	    		}.bind(this)
	    	);
    	}else{
    		this.showProcessModal(process_mode, null);
    	}
    },
    showProcessModal: function(process_mode,data){
		this.setState({
			process_mode: process_mode,
			process_modal: 
			<div>
				<Process mode={process_mode} data={data} close={this.closeProcessModal}/>
				<div className="overlay"></div>
			</div>		
		});
    },
    showListModal: function(){
    	API.maintenance_defsyscontrols.trading_unit_list(
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
	validation: function (process_mode) {
		// var state = null;
		var trading_data = this.state.process_data;
		// console.log("showProcessModal:"+ this.state.trade_code);

		if(process_mode == 'list')
		{
			this.showListModal();
		}	
		else if(this.state.trade_code === "" && process_mode != 'add') //check trading unit code input
		{
		 	this.setState({ 	process_mode: process_mode,
		 				process_modal: 
						<SystemResponse title="Process" content="Input Incomplete" close={this.closeProcessModal}/>
			});	
		}
		else 	// PER TRADING UNIT PROCESS
		{
			this.perTradingProcess(process_mode);
		}
		//add switch case for add edit delete
		// this.setState(state);
	},
	Close:function(){
		this.context.router.push('menu');
	},
	render:function(){

		return(
			<div className='app-border'>
				{		
					this.state.process_mode != null ?
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
												<label><h5><input className="" type="radio" defaultChecked='checked' name='type' onClick={this.all_trading} />
											 	All Trading Units</h5></label>
											</div>
											 <div className='col-xs-6 no-padding'>
												<label><h5><input className="" type="radio" name='type' onClick={this.per_trading} />
											 	Per Trading Unit</h5></label>
											 </div>
										</div>
									</div>
									<div className='row no-padding'>
										<div className='col-xs-12 col-sm-6 col-sm-offset-3 padding-content'>
											<div className='col-xs-6'>
												<h5>Trading Unit Code:</h5>
											</div>
											<div className='col-xs-6'>
												<input id="tradeCode" onChange={this.updateTradingUnitCode} className="form-control" type="text" disabled={this.state.all_trading} />
											</div>
										</div>
									</div>
								</div>
							</form>
						</div>
				</AppBody>
				<ViewFooter>
					<div className='row'>
						<ButtonComponent ButtonName='Add' ButtonClass='btn btn-default' whenClicked={this.validation.bind(this, 'add')} Disable={this.state.all_trading}/>
						<ButtonComponent ButtonName='Modify' ButtonClass='btn btn-default' whenClicked={this.validation.bind(this, 'modify')} Disable={this.state.all_trading} />
						<ButtonComponent ButtonName='Delete' ButtonClass='btn btn-default' whenClicked={this.validation.bind(this, 'delete')} Disable={this.state.all_trading} />
						<ButtonComponent ButtonName='List' ButtonClass='btn btn-default' whenClicked={this.validation.bind(this, 'list')} Disable={this.state.per_trading} />
						<ButtonComponent ButtonName='Close' ButtonClass='btn btn-default' whenClicked={this.Close} />
					</div>
				</ViewFooter>
			</div>
			);
	}

});



module.exports = TradingUnitMaintenance;
