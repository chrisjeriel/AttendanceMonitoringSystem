'use strict';
var React = require('react');

var AppHeader = require('../../../components/AppHeader');
var AppHeaderTitle = require('../../../components/AppHeaderTitle');
var AppBody = require('../../../components/AppBody');
var ViewFooter = require('../../../components/ViewFooter');
var Navigation = require('../../../components/NavigationMenu');
var ButtonComponent = require('../../../components/ButtonComponent');
var Auth = require('../../../auth/Auth');
var API = require('../../../api');
var TextInputComponent = require('../../../components/TextInputComponent');
var AmountInputComponent = require('../../../components/AmountInputComponent');
var SystemResponse = require('../../../components/SystemResponse');
var Util = require('../../../util');

var Constant = {
	ID_PURCH_TRANS_CHECKBOX: "purchTransTracking",
	ID_PURCH_CAL_DAYS: "purchCalDays",
	ID_PURCH_LIMIT: "purchLimit",
	ID_SALES_TRANS_CHECKBOX: "salesTransTracking",
	ID_SALES_CAL_DAYS: "salesCalDays",
	ID_SALES_LIMIT: "salesLimit",

	DATA_PURCH_INDC: "PTRCK_INDC",
	DATA_PURCH_DAYS: "PTRCK_DAYS",
	DATA_PURCH_AMNT: "PTRCK_AMNT",
	DATA_SALES_INDC: "STRCK_INDC",
	DATA_SALES_DAYS: "STRCK_DAYS",
	DATA_SALES_AMNT: "STRCK_AMNT"

};


var TransactionMonitoring = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function () {
		return (
			{
				purchase:'',
				sale:'',
				purchaseCheckBox:false,
				saleCheckBox:false
			}
		);
	},
	componentDidMount: function(){
		$('#'+Constant.ID_PURCH_CAL_DAYS).mask('000');
		$('#'+Constant.ID_SALES_CAL_DAYS).mask('000');

		// this.PurchaseCheck();
		this.LoadData();
	},
	LoadData: function(){
		API.maintenance_defsyscontrols.transaction_monitoring(null,
				function(data){
					console.log('success');
					if(data.meta.code==200){
						this.processSuccess(data.data[0], 'get');
					}else{
						this.setState({dialog_enable: true,
							dialog_content: "Error getting data"
						});
					}
				}.bind(this),	
				function(data){
					console.log('fail');
					this.setState({dialog_enable: true,
						dialog_content: "Cannot connect to the middleware"
					});
				}.bind(this)
			);
	},
	Process: function (e) {
		var content = '';

		var calPurchase = this.state.salesCalDays;
		var calSale = this.state.purchCalDays;
		var limitPurchase = this.state.purchLimit;
		var limitSale = this.state.salesLimit;

		console.log("cp:["+calPurchase+"]cs:["+calSale+"]lp:["+limitPurchase+"]ls:["+limitSale+"]");

		console.log("isempty: " + Util.strIsEmpty(calPurchase));

		if(this.state.purchaseCheckBox){
			if(calPurchase == "" || limitPurchase == ""){
				content = "Input Incomplete";
			}
		}else if(this.state.saleCheckBox){
			if(calSale == "" || limitSale == ""){
				content = "Input Incomplete";
			}
		}else{
			content = 'please check one';
		}


		if(content != ''){
			this.setState({	dialog_enable: true,
				dialog_content: content
			 });
		}else{
			var data = {
				purchase: {
					track: $('#transTrackingPurchase').prop('checked'),
					calendar_days: $('#calDaysPurchase').val(),
					limit_per_client: $('#limitPerClientPurchase').val()
				},
				sale: {
					track: $('#transTrackingSale').prop('checked'),
					calendar_days: $('#calDaysSale').val(),
					limit_per_client: $('#limitPerClientSale').val()
				}
			};

			e.preventDefault();

			// API.transaction_monitoring.process(data)
			// 	.done(this.processSuccess)
			// 	.fail(this.processFail);
		}

	},

	processSuccess: function (data, action) {
		console.log("processSuccess: " + action); // get or process
		if(action == 'get'){
			var purchDays = data.PTRCK_DAYS;
			var purchAmnt = data.PTRCK_AMNT;
			var salesDays = data.STRCK_DAYS;
			var salesAmnt = data.STRCK_AMNT;

			this.setState({
				purchCalDays: purchDays,
				purchLimit: purchAmnt,
				salesCalDays: salesDays,
				salesLimit: salesAmnt
			});
			// console.log(purchDays);
		}else if(action == 'process'){
			this.setState({	dialog_enable: true,
							dialog_content: '[] TRANSACTION SUCCESSFULLY UPDATED' });	
		}
	},
	processFail: function (xhr, err) {
		console.log(err);
		this.setState({	dialog_enable: true,
						dialog_content: 'System Error' });
	},
	closeDialogBox: function () {
	 	this.setState({dialog_enable: false});
	},
	PurchaseCheck : function(){
		if(this.state.purchaseCheckBox==false){
			this.setState({	purchase : '',
							sale: 'true',
							purchaseCheckBox:true,
							saleCheckBox:false});
		}else{
			this.setState({	purchase : '',
							sale: '',
							purchaseCheckBox:false,
							saleCheckBox:true
							});
		}
	},
	SaleCheck: function(){
		if(this.state.saleCheckBox==false){
			this.setState({	purchase : 'true',
							sale: '',
							purchaseCheckBox:false,
							saleCheckBox:true});
		}else{
			this.setState({	purchase : '',
							sale: '',
							saleCheckBox:false,
							purchaseCheckBox: true
							});
		}
	},
	UpdateFormInput: function(e, value){
		// console.log(value);
		switch(e.target.id){
			case Constant.ID_PURCH_CAL_DAYS:
				this.setState({purchCalDays: value});
			break;
			case Constant.ID_PURCH_LIMIT:
				this.setState({purchLimit: value});
			break;
			case Constant.ID_SALES_CAL_DAYS:
				this.setState({salesCalDays: value});
			break;
			case Constant.ID_SALES_LIMIT:
				this.setState({salesLimit: value})
			break;
		}
	},
	Close: function () {
		this.context.router.push('menu');
	},
	render:function(){
		return(
			<div className='app-border'>
				<AppBody>
					<div className='col-sm-12 app-body-inner'>
						<form className='form-group'>
							<div className='row app-body-content'>
								<div className='row padding-content'>
									<h3><em>PURCHASE</em></h3>
								</div>
								<div className='row'>
									<div className="col-xs-8 col-xs-offset-2">
										<label className='checkbox-inline'><h5>
										<input 	id={Constant.ID_PURCH_TRANS_CHECKBOX} 
												checked={this.state.purchaseCheckBox} 
												onClick={this.PurchaseCheck} 
												className="" 
												type="checkbox" />
										 Transaction Tracking</h5></label>
									</div>
								</div>
								<div className='row'>
									<div className="col-xs-8 col-xs-offset-2">
										<div className='col-xs-6'>
											<h5>No. of Calendar Days:</h5>
										</div>
										<div className='col-xs-6'>
											<input 	id={Constant.ID_PURCH_CAL_DAYS}
													value={this.state.purchCalDays}
													onChange={this.UpdateFormInput}
													className="form-control text-right" 
													type="text"
													placeholder="0" 
													disabled={this.state.purchase}/>
										</div>
									</div>
								</div>
								<div className='row'>
									<div className="col-xs-8 col-xs-offset-2">
										<div className='col-xs-6'>
											<h5>Amount Limit per Client(in USD):</h5>
										</div>
										<div className='col-xs-6'>
											{/* <input id="limitPerClientPurchase" className="form-control text-right" type="text"
												placeholder="0.00" disabled={this.state.purchase} /> */}
											<AmountInputComponent 
													idName={Constant.ID_PURCH_LIMIT}
													value={this.state.purchLimit}
													onChange={this.UpdateFormInput}
													mask="000,000,000.00" 
													placeholder="0.00" 
													editMode={!this.state.purchase}/>
										</div>
									</div>
								</div>
							</div>
							<div className='row'>
								<div className='row padding-content'>
									<h3><em>SALE</em></h3>
								</div>
								<div className='row'>
									<div className="col-xs-8 col-xs-offset-2">
										 <label className='checkbox-inline'><h5>
										 <input 	id={Constant.ID_SALES_TRANS_CHECKBOX} 
										 			checked={this.state.saleCheckBox} 
										 			onClick={this.SaleCheck} 
										 			className="" 
										 			type="checkbox" />
										 Transaction Tracking</h5></label>
									</div>
								</div>
								<div className='row'>
									<div className="col-xs-8 col-xs-offset-2">
										<div className='col-xs-6'>
											<h5>No. of Calendar Days:</h5>
										</div>
										<div className='col-xs-6'>
											<input 	id={Constant.ID_SALES_CAL_DAYS} 
													value={this.state.salesCalDays}
													onChange={this.UpdateFormInput}
													type="text"
											  		placeholder="0" 
													className="form-control text-right" 
											  		disabled={this.state.sale} />
										</div>
									</div>
								</div>
								<div className='row'>
									<div className="col-xs-8 col-xs-offset-2">
										<div className='col-xs-6'>
											<h5>Amount Limit per Client(in USD):</h5>
										</div>
										<div className='col-xs-6'>
												<AmountInputComponent 
													idName={Constant.ID_SALES_LIMIT} 
													value={this.state.salesLimit}
													onChange={this.UpdateFormInput}
													mask="000,000,000.00" 
													placeholder="0.00" 
													editMode={!this.state.sale}/>
										</div>
									</div>
								</div>
							</div>
						</form>
					</div>
				</AppBody>
				<ViewFooter>
					<div className='row'>
						<ButtonComponent ButtonName="Process" ButtonClass='btn btn-default' whenClicked={this.Process} />
						<ButtonComponent ButtonName="Close" ButtonClass='btn btn-default' whenClicked={this.Close} />
					</div>
				</ViewFooter>
				{
					this.state.dialog_enable ?
						<SystemResponse title="System Response" content={this.state.dialog_content} close={this.closeDialogBox} />
					: null
				}
			</div>
			);
	}

});

module.exports = TransactionMonitoring;
