'use strict';

var React = require('react');

var ButtonComponent = require('../../../../components/ButtonComponent');
var AppBody = require('../../../../components/AppBody');
var ViewFooter = require('../../../../components/ViewFooter');
var API = require('../../../../api');
var SystemResponse = require('../../../../components/SystemResponse');
var ConfirmationPrompt = require('../../../../components/ConfirmationPrompt');
var AppConstants = require('../../../../AppConstants');
var Util = require('../../../../util');

var IntradayLimitProcess = React.createClass({
	getInitialState: function(){
		var intrLimit=null;
		var trdrFi=null;
		if(this.props.mode != 'add'){
			intrLimit = Util.removeLeadingZeros(this.props.data.INTR_LMIT);
			trdrFi = this.props.data.TRDR_FI;
		}
		return({
			options: null,
			trdrFi: trdrFi,
			intrLimit: intrLimit,
			modal: null,
			tranUnitDisable: false,
			intrDisable: false
		});
	},
	componentDidMount: function(){
		this.OptionControl();

		if(this.props.mode == 'modify'){
			this.setState({tranUnitDisable: true});
		}else if(this.props.mode == 'delete'){
			this.setState({tranUnitDisable: true,intrDisable: true});
		}
	},
	OptionControl: function(){
		var tradingUnit = store.get('0131'); // 0131 - Reference Table
		var options = [];
		for(var i = 0; i < tradingUnit.length; i++){ 
			options.push(<option value={tradingUnit[i].trdrFi}>{tradingUnit[i].trdrFi} - {tradingUnit[i].trdrDesc}</option>);
		}
		this.setState({
			options: options
		});
	},
	updateTradingUnit: function(e){
		this.setState({
			trdrFi: e.target.value
		});
	},
	updateIntradayLimit: function(e){
		this.setState({
			intrLimit: e.target.value
		});
	},
	showConfirmationPrompt: function(){
		this.setState({
			modal: <ConfirmationPrompt 
						title="Confirmation" 
						content="Are you sure want to Save Changes?"
						yes={this.Process}
						no={this.closeModal} /> 
		});
	},
	Process: function(){
		var data = {
			trdrFi: this.state.trdrFi,
			intrLimit: this.state.intrLimit
		}

		switch(this.props.mode){
			case 'add':
				this.Add(data);
			break;
			case 'modify':
				this.Modify(data);
			break;
			case 'delete':
				this.Delete(data);
			break;
		}
	},
	Add: function(data){

		API.maintenance_defsyscontrols.intraday_limits_add(
			data,
			function(data){
				if(data.meta.code == 200 || data.meta.code == 0){
					this.setState({
						modal: <SystemResponse title="System Message" content={data.meta.errorMessage} close={this.closeModalReload} />
					});
				}else{
					this.setState({
						modal: <SystemResponse title="System Message" content={data.meta.errorMessage} close={this.closeModal} />
					})
				}
			}.bind(this),
			function(data){
				this.setState({
					modal: <SystemResponse title="System Message" content={AppConstants.ERROR_CANNOT_CONNECT} close={this.closeModal} />
				});
			}.bind(this)
			);
	},
	Modify: function(data){
		console.log(data);
		API.maintenance_defsyscontrols.intraday_limits_modify(
			data,
			function(data){
				if(data.meta.code == 200 || data.meta.code == 0){
					this.setState({
						modal: <SystemResponse title="System Message" content={data.meta.errorMessage} close={this.closeModalReload} />
					});
				}else{
					this.setState({
						modal: <SystemResponse title="System Message" content={data.meta.errorMessage} close={this.closeModal} />
					})
				}
			}.bind(this),
			function(data){
				this.setState({
					modal: <SystemResponse title="System Message" content={AppConstants.ERROR_CANNOT_CONNECT} close={this.closeModal} />
				});
			}.bind(this)
			);
	},
	Delete: function(data){
		console.log("delete");
		console.log(data);

		API.maintenance_defsyscontrols.intraday_limits_del(
			data,
			function(data){
				if(data.meta.code == 200 || data.meta.code == 0){
					this.setState({
						modal: <SystemResponse title="System Message" content={data.meta.errorMessage} close={this.closeModalReload} />
					});
				}else{
					this.setState({
						modal: <SystemResponse title="System Message" content={data.meta.errorMessage} close={this.closeModal} />
					})
				}
			}.bind(this),
			function(data){
				this.setState({
					modal: <SystemResponse title="System Message" content={AppConstants.ERROR_CANNOT_CONNECT} close={this.closeModal} />
				});
			}.bind(this)
			);
	},
	closeModalReload: function(){
		this.setState({modal: null});
		location.reload();
	},
	closeModal: function(){
		this.setState({modal: null});
	},
	render:function(){
		return(
			<div>
			<div className='app-border process_modal'>
				<AppBody>
					<div className='col-sm-12 app-body-inner'>
						<div className="row">
							<div className="col-sm-5">
								<label>Trading Unit: </label>
							</div>
							<div className="col-sm-7">
								<select value={this.state.trdrFi} onChange={this.updateTradingUnit} className="form-control" disabled={this.state.tranUnitDisable}>
									{	
										this.state.options != null?
											this.state.options
											: null
									}
								</select>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-5">
								<label>Intraday Limit in USD: </label>
							</div> 
							<div className="col-sm-7">
								<input id="intrLimit" type="text" value={this.state.intrLimit} onChange={this.updateIntradayLimit} className="form-control" disabled={this.state.intrDisable} />
							</div>
						</div>
					</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Process' whenClicked={this.showConfirmationPrompt} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.props.close} />
				</ViewFooter>
			</div>
			{
				this.state.modal?
					this.state.modal
					: null
			}
			</div>
			);
	}

});

module.exports = IntradayLimitProcess;