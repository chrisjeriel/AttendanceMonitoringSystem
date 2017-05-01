var React = require('react');

var AppBody = require('../../../components/AppBody');
var AppHeader = require('../../../components/AppHeader');
var ViewFooter = require('../../../components/ViewFooter');
var ButtonComponent = require('../../../components/ButtonComponent');
var Auth = require('../../../auth/Auth');
var ConfirmationPrompt = require('../../../components/ConfirmationPrompt');
var SystemResponse = require('../../../components/SystemResponse');
var api = require('../../../api');

var DataEntry = React.createClass({
	contextTypes: {
        router: React.PropTypes.object
    },
    getInitialState: function(){
        return ({
            data:[],
            delete_mode: '',
            modify_mode: '',
            counterPartyVal: '', 
			contactPersonVal: '', 
			bankAddress1Val: '',
			bankAddress2Val: '',
			currencyVal: '', 
			transactionAmountVal: '', 
			exchangeRateVal: '', 
			equivalentAmountVal: '',
			valueDateVal: '', 
			receivingAccountVal: ''
        });
    },
    componentDidMount:function(){
        $("#currencyCode").mask("AAA");
        // $("#bpiCode").mask("000");
        // $("#casaCode").mask("00");
    },
    ConfirmYes: function(){
        switch(this.props.mode){
            case 'add':
                this.Add();
                break;
            case 'modify':
                this.Modify();
                break;
            case 'delete':
                this.Delete();
        }
    },
    ConfirmNo: function(){
        this.closeDialogBox();
        console.log("User changed mind");
    },
    Process:function(){
        var counterPartyVal = this.state.counterPartyVal;
        var contactPersonVal = this.state.contactPersonVal;
        var bankAddress1Val = this.state.bankAddress1Val;
        var bankAddress2Val = this.state.bankAddress2Val;
		var currencyVal = this.state.currencyVal;
        var transactionAmountVal = this.state.transactionAmountVal;
        var exchangeRateVal = this.state.exchangeRateVal;
        var equivalentAmountVal = this.state.equivalentAmountVal;
		var valueDateVal = this.state.valueDateVal;
        var receivingAccountVal = this.state.receivingAccountVal;

        if( counterPartyVal!= "" && 
			contactPersonVal != "" && 
			bankAddress1Val != "" && 
			bankAddress2Val != "" &&
			currencyVal != "" &&
			transactionAmountVal != "" && 
			exchangeRateVal != "" && 
			equivalentAmountVal != "" &&
			valueDateVal != "" && 
			receivingAccountVal != "")
        {
            this.setState({
                dialog_enable: true,
                dialog: <SystemResponse title="System Message" content="FFF1INBK successfully updated" close={this.closeDialogBox} />
            });
        }else{
            this.setState({
                dialog_enable: true,
                dialog: <SystemResponse title="Error" content="Input Incomplete" close={this.closeDialogBox} />
            });
        }
    },
	Clear:function(){
		this.setState({
			counterPartyVal: '', 
			contactPersonVal: '', 
			bankAddress1Val: '',
			bankAddress2Val: '',
			currencyVal: '', 
			transactionAmountVal: '', 
			exchangeRateVal: '', 
			equivalentAmountVal: '',
			valueDateVal: '', 
			receivingAccountVal: '',
			otherInstructionsVal: '',
			remarksVal: ''
		});
		
	},
    Add:function(){
        console.log(this.state.data);

        api.valid_currency.Add(this.state.data)
            .done(this.processSuccess)
            .fail(this.processFail);
    },
    Modify:function(){
        console.log(this.state.data);

        api.valid_currency.Modify(this.state.data)
            .done(this.processSuccess)
            .fail(this.processFail);
    },
    Delete:function(){
        console.log(this.state.data);

        api.valid_currency.Delete(this.state.data)
            .done(this.processSuccess)
            .fail(this.processFail);
    },
    processSuccess: function (res) {
        this.setState({
            dialog_enable: true,
            dialog: <ConfirmationPrompt title="Confirmation" content="Are you sure you want to ADD Record?" yes={this.closeDialogBox} no={this.closeDialogBox} />
        });
    },

    processFail: function (xhr, err) {
        this.setState({
            dialog_enable: true,
            dialog: <SystemResponse title="System Response" content="System Error" close={this.closeDialogBox} />
        });
    },
    closeDialogBox: function () {
        this.setState({dialog_enable: false});
    },
    updateCounterParty: function(e){
      var val = e.target.value;
      this.setState({counterPartyVal: val})
    },
    updateContactPerson: function(e){
      var val = e.target.value;
      this.setState({contactPersonVal: val})
    },
    updateBankAddress1: function(e){
      var val = e.target.value;
      this.setState({bankAddress1Val: val})
    },
    updateBankAddress2: function(e){
      var val = e.target.value;
      this.setState({bankAddress2Val: val})
    },
	updateCurrencyCode: function(e){
      var val = e.target.value;
      this.setState({currencyVal: val})
    },
	updateTransactionAmount: function(e){
      var val = e.target.value;
      this.setState({transactionAmountVal: val})
    },
	updateExchangeRate: function(e){
      var val = e.target.value;
      this.setState({exchangeRateVal: val})
    },
	updateEquivalentAmount: function(e){
      var val = e.target.value;
      this.setState({equivalentAmountVal: val})
    },
	updateValueDate: function(e){
      var val = e.target.value;
      this.setState({valueDateVal: val})
    },
	updateReceivingAccount: function(e){
      var val = e.target.value;
      this.setState({receivingAccountVal: val})
    },
	render:function(){
		return(
			<div className='app-border  process_modal'>
        <AppHeader/>
				<AppBody>
						<div className='col-sm-12 app-body-inner'>
							<form className='form-group no-border-content'>
								<div className='row app-body-content'>
									<div className='row'>
										<div className='col-xs-12 col-sm-10 col-sm-offset-1'>
											<div className='col-xs-4 align-right'>
												<label>Transaction Type:</label>
											</div>
											<div className='col-xs-8'>
    										<div className='col-xs-6'>
                          <label className='radio-inline'>
                            <input className="" type="radio" name='transaction' />Interbank Purchase
                          </label>
                        </div>
    										<div className='col-xs-6'>
                          <label className='radio-inline'>
                            <input className="" type="radio" name='transaction'  />Interbank Sale
                          </label>
                        </div>
                      </div>
										</div>
									</div>
                  <hr/>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Counter Party:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input id="counterParty" value={this.state.counterPartyVal} onChange={this.updateCounterParty} className="form-control" type="text" placeholder=""/>
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Contact Person:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input id="contactPerson" value={this.state.contactPersonVal} onChange={this.updateContactPerson} className="form-control" type="text" placeholder="" />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Bank Address:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input id="bankAddress1" value={this.state.bankAddress1Val} onChange={this.updateBankAddress1} className="form-control" type="text" placeholder="" />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5'>

											</div>
											 <div className='col-xs-7'>
											 	<input id="bankAddress2" value={this.state.bankAddress2Val} onChange={this.updateBankAddress2} className="form-control" type="text" placeholder="" />
											 </div>
										</div>
									</div>
                  <br/>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Currency:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input id="currencyCode" value={this.state.currencyVal} onChange={this.updateCurrencyCode} className="form-control" type="text" placeholder="" />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Transaction Amount:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input id="transactionAmount" value={this.state.transactionAmountVal} onChange={this.updateTransactionAmount} className="form-control" type="text" placeholder="" />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Exchange Rate:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input id="exchangeRate" value={this.state.exchangeRateVal} onChange={this.updateExchangeRate} className="form-control" type="text" placeholder="" />
											 </div>
										</div>
									</div>
                  <br/>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Equivalent Amount:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input id="equivalentAmount" value={this.state.equivalentAmountVal} onChange={this.updateEquivalentAmount} className="form-control" type="text" placeholder="" />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Value Date:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input id="valueDate" value={this.state.valueDateVal} onChange={this.updateValueDate} className="form-control" type="text" placeholder="" />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Receiving Account No.(PDDTS):</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input id="receivingAccount" value={this.state.receivingAccountVal} onChange={this.updateReceivingAccount} className="form-control" type="text" placeholder="" />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Other Instructions:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input id="otherInstructions" value={this.state.otherInstructionsVal} className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Remarks:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input id="remarks" value={this.state.remarksVal} className='form-control' type='text' />
											 </div>
										</div>
									</div>
								</div>
							</form>
						</div>
				</AppBody>
				<ViewFooter>
					<span className='margin-right-40'>
						<label>Reference No <input type='text' value={this.props.referenceNumber} disabled/></label>
					</span>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Process" whenClicked={this.Process} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Close" whenClicked={this.props.close} />
				</ViewFooter>
			{
				this.state.dialog_enable ?
					this.state.dialog
					: ''
			}
			</div>
		);
	}
});

module.exports = DataEntry;
