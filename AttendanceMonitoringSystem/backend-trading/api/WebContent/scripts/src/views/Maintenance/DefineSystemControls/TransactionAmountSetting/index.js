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
var Util = require('../../../../util');
var References = require('../../../../References');

var TransactionAmountSetting = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){
		return ({
			trade_code: '',
			process_mode: null,
			process_modal: null,
			currencies: [],
			selectOptions: null,
			mode: null,
			selectedIndex: 0,
			currencyDisabled: true
		});
	},
	componentDidMount: function(){
		this.LoadData();
	},
	ParseCurrencies: function(list){
		for(var i=0; i<list.length; i++){
			list[i].MIN_AMNT = Util.decimalNumber(list[i].MIN_AMNT);
			list[i].PABV_LIM = Util.decimalNumber(list[i].PABV_LIM);
			list[i].SABV_LIM = Util.decimalNumber(list[i].SABV_LIM);
		}

		this.setState({currencies: list});
	},
	LoadData: function(){

		References.loadTables(
			'0118',
			function(){
				console.log('Valid Currency table loaded');
				/**
				 Get table by store.get('0118');
				 **/
			}.bind(this)
		);

		API.maintenance_defsyscontrols.transaction_amount_all(
			null,
			function(data){
				if(data.meta.code == 200 || data.meta.code == 0){
					this.ParseCurrencies(data.data);
					this.DisplayOptions();
				}else{
					this.setState({
						process_mode: 'error',
						process_modal: <SystemResponse content={AppConstants.ERROR_GETTING_LIST} title="System Message" close={this.CloseModal} />
					});
				}
			}.bind(this),
			function(data){
				this.setState({
					process_mode: 'error',
					process_modal: <SystemResponse content={AppConstants.ERROR_CANNOT_CONNECT} title="System Message" close={this.CloseModal} />
				});
			}.bind(this)
		);
	},
	UpdateCurrDesc: function(e){
		if(e.target.selectedIndex >= 1){
			var currCode = this.state.currencies[e.target.selectedIndex -1].CURR_CODE;
		
			this.setState({
				transAmount: this.getCurrDesc(currCode),
				selectedIndex: e.target.selectedIndex
			});
		}else{
			this.setState({
				transAmount: "",
				selectedIndex: e.target.selectedIndex
			});
		}
	},
	DisplayOptions: function(){
		var options	= [];
		var currencies = this.state.currencies;

		for(var i=0; i < currencies.length; i++){
			options.push(<option value={currencies[i].CURR_CODE}>{currencies[i].CURR_CODE}</option>);
		}

		this.setState({
			selectOptions: options
		});	

	},
	getCurrDesc: function(currCode){
		var list= store.get('0118');

		if(list){
			for(var i = 0; i < list.length; i ++){
				if(list[i]['currCode'] == currCode){
					return list[i]['currDesc'];
				}
			}			
		}

		return null;
	},
	UpdatePerCurrency: function(){
		this.setState({
			mode: "per",
			currencyDisabled: false
		});
	},
	UpdateAllCurrencies: function(){
		this.setState({
			mode: "all",
			currencyDisabled: true
		});
	},
	ShowProcessModal: function(){
		var index = this.state.selectedIndex-1;
		var data ={
			trdrFi: this.state.currencies[index].TRDR_FI,
			currCode: this.state.currencies[index].CURR_CODE,
			minAmnt: this.state.currencies[index].MIN_AMNT,
			pabvLim: this.state.currencies[index].PABV_LIM,
			sabvLim: this.state.currencies[index].SABV_LIM
		}

		this.setState({
			 process_mode: "process",
			 process_modal: <Process data={data} close={this.CloseModal} />
		});
	},
	ShowListModal: function(){
		this.setState({
			 process_mode: "list",
			 process_modal: <List data={this.state.currencies} close={this.CloseModal} />
		});
	},
	Validation: function(){
		if(this.state.mode === "per"){
			if(this.state.selectedIndex == 0 ){
				this.setState({
					process_mode: 'error',
					process_modal: <SystemResponse content="Please choose from the currencies" title="System Message" close={this.CloseModal} />
				});
			}else{
				this.ShowProcessModal();
			}
		}else{
			this.ShowListModal();
		}
	},
	CloseModal: function(){
		this.setState({
			process_mode: null
		});
	},
	Close: function(){
		this.context.router.push('menu');
	},
	render: function(){

		return(
			this.state.selectOptions != null?
			<div className='app-border'>
				<AppBody>
						<div className='col-sm-12 app-body-inner'>
							<form className='form-group no-border-content'>
								<div className='row app-body-content'>
									<div className='row no-padding'>
										<div className='col-xs-12 col-sm-6 col-sm-offset-3 padding-content'>
											<div className='col-xs-6 no-padding'>
												<label><h5><input className="" type="radio" defaultChecked='checked' name='currency' onClick={this.UpdateAllCurrencies}/>
											 	All Currencies</h5></label>
											</div>
											 <div className='col-xs-6 no-padding'>
												<label><h5><input className="" type="radio" name='currency' onClick={this.UpdatePerCurrency} />
											 	Per Currency</h5></label>
											 </div>
										</div>              
									</div>
									<div className='row no-padding'>
										<div className='col-xs-12 col-sm-6 col-sm-offset-3 padding-content'>
											<div className='col-xs-3'>
												<h5>Currency:</h5>
											</div>
											<div className='col-xs-3'>
												
														<select 
															className="form-control" 
															id="currencies" 
															onChange={this.UpdateCurrDesc}
															disabled={this.state.currencyDisabled} >
															<option value="0"></option>
															{
																this.state.selectOptions
															}
														</select>
											</div>
											<div className="col-xs-6">
												<input value={this.state.transAmount} className="form-control" type="text" disabled={true} />
											</div>
										</div>
									</div>
								</div>
							</form>
						</div>
				</AppBody>
				<ViewFooter>
					<div className='row'>
						<ButtonComponent ButtonName='Process' ButtonClass='btn btn-default' whenClicked={this.Validation} Disable={this.state.per_trading} />
						<ButtonComponent ButtonName='Close' ButtonClass='btn btn-default' whenClicked={this.Close} />
					</div>
				</ViewFooter>
				{
					this.state.process_mode?
						this.state.process_modal
						: null
				}
			</div>
			: <div >Loading...</div>
			
			);
	}

});



module.exports = TransactionAmountSetting;
