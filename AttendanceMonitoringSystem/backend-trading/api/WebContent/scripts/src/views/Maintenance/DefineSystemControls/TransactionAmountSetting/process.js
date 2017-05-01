var React = require('react');

var AppBody = require('../../../../components/AppBody');
var ViewFooter = require('../../../../components/ViewFooter');
var ButtonComponent = require('../../../../components/ButtonComponent');
var Auth = require('../../../../auth/Auth');
var AmountInputComponent = require('../../../../components/AmountInputComponent');
var API = require('../../../../api');
var SystemResponse = require('../../../../components/SystemResponse');
var AppConstants = require('../../../../AppConstants');

var TransactionAmountSettingProcess = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function() {
		return({
			currCode: null,
			minAmnt: null,
			pabvLim: null,
			sabvLim: null
		});	
	},
	componentDidMount:function(){
		this.setState({
			currCode: this.props.data.currCode,
			minAmnt: this.props.data.minAmnt,
			pabvLim: this.props.data.pabvLim,
			sabvLim: this.props.data.sabvLim
		});
	},
	Close:function(){
	    this.context.router.replace('/menu');
	},
	UpdateCurrCode: function(e,numVal){
		this.setState({currCode: numVal});
	},
	UpdateMinAmnt: function(e,numVal){
		this.setState({minAmnt: numVal});
	},
	UpdatePabvLim: function(e,numVal){
		this.setState({pabvLim: numVal});
	},
	UpdateSabvLim: function(e,numVal){
		this.setState({sabvLim: numVal});
	},
	Validation: function(){
		var minAmnt = Number(this.state.minAmnt);
		var pabvLim = Number(this.state.pabvLim);
		var sabvLim = Number(this.state.sabvLim);
		console.log("validation");
		console.log(minAmnt);
		console.log(pabvLim);
		console.log(sabvLim);

		if(minAmnt === 0 || minAmnt == null){
			this.setState({
				modal: <SystemResponse close={this.CloseModal} title="Error Message" content="Minimum transaction amount cannot be Zero" />
			})
		}else if(pabvLim === 0 || pabvLim == null){
			this.setState({
				modal: <SystemResponse close={this.CloseModal} title="Error Message" content="Amount for Purchase Above Limit cannot be Zero" />
			});
		}
		else if(sabvLim === 0 || sabvLim == null){
			this.setState({
				modal: <SystemResponse close={this.CloseModal} title="Error Message" content="Amount for Sale Above Limit cannot be Zero" />
			});
		}else{
			API.maintenance_defsyscontrols.transaction_amount_put(
				{
					currCode: this.props.data.currCode,
					trdrFi: this.props.data.trdrFi,
					minAmnt: minAmnt,
					pabvLim: pabvLim,
					sabvLim: sabvLim
				},
				function(data){
					if(data.meta.code == 0 || data.meta.code == 200){
						this.setState({
							modal: <SystemResponse close={this.CloseModalReload} content={data.meta.errorMessage.trim()} title="Success" />
						});
					}else{
						this.setState({
							modal: <SystemResponse close={this.CloseModal} content={data.meta.errorMessage.trim()} title="Error" />
						})
					}
				}.bind(this),
				function(data){
					console.error(data);
					this.setState({
						modal: <SystemResponse close={this.CloseModal} content={AppConstants.ERROR_CANNOT_CONNECT} title="Error" />
					});
				}.bind(this)
				);
		}

	},
	CloseModalReload: function(){
		this.setState({modal: null});
		location.reload();
	},
	CloseModal: function(){
		this.setState({
			modal: false
		});
	},
	render:function(){
		return(
			<div>
			<div className='app-border process_modal'>
				<AppBody>
					<div className='col-xs-12 col-xs app-body-inner'>
						<div className='col-xs-10 col-xs-offset-1 padding-content'>
							<div className="row padding-top">
								<div className="col-xs-6">
									<label>Currency: </label>
								</div>
								<div className="col-xs-6">
									<input value={this.props.data.currCode} disabled={true} onChange={this.UpdateCurrCode} className="form-control text-right" type="text" placeholder="" />
								</div>
							</div>
							<div className="row padding-top">
								<div className="col-xs-6">
									<label>Minimum Transaction Amount: </label>
								</div>
								<div className="col-xs-6">
									{
										this.state.minAmnt!=null?
										<AmountInputComponent 
											defVal={this.state.minAmnt}
											onChange={this.UpdateMinAmnt}
											placeholder="0"
											editMode={true}
											/>
										: null
									}
								</div>
							</div>
							<div className="row padding-top">
								<div className="col-xs-6">
									<label>Amount of Purchase Above the Limit: </label>
								</div>
								<div className="col-xs-6">
									{
									this.state.pabvLim!=null?
										<AmountInputComponent 
											defVal={this.state.pabvLim}
											onChange={this.UpdatePabvLim}
											placeholder="0"
											editMode={true}
											/>
									: null
									}	
								</div>
							</div>
							<div className="row padding-top">
								<div className="col-xs-6">
									<label>Amount for Sale Above the Limit: </label>
								</div>
								<div className="col-xs-6">
								{
									this.state.sabvLim!=null?
										<AmountInputComponent 
											defVal={this.state.sabvLim}
											onChange={this.UpdateSabvLim}
											placeholder="0"
											editMode={true}
											/>
									: null
								}
								</div>
							</div>
						</div>
					</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Process' whenClicked={this.Validation} />
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

module.exports = TransactionAmountSettingProcess;
