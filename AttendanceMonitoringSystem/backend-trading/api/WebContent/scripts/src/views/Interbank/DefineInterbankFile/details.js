var React = require('react');

var AppBody = require('../../../components/AppBody');
var AppHeader = require('../../../components/AppHeader');
var AppHeaderTitle = require('../../../components/AppHeaderTitle');
var ViewFooter = require('../../../components/ViewFooter');
var Navigation = require('../../../components/NavigationMenu');
var ButtonComponent = require('../../../components/ButtonComponent');
var Auth = require('../../../auth/Auth');
var THcomponent = require('../../../components/THcomponent');
var TDcomponent = require('../../../components/TDcomponent');
var Table = require('../../../components/TableComponent');
var ConfirmationPrompt = require('../../../components/ConfirmationPrompt');
var SystemResponse = require('../../../components/SystemResponse');

var DefineInterbankFileDetails = React.createClass({
	getInitialState: function(){
        return ({
            data:[],
            delete_mode: '',
            modify_mode: '',
            counterPartyVal: '', 
			bankNameVal: '',
			bankAddress1Val: '',
			bankAddress2Val: '',
			contactPersonVal: '', 
			receivingAccountVal: ''
        });
    },
	Process:function(){
        var counterPartyVal = this.state.counterPartyVal;
        var bankNameVal = this.state.bankNameVal;
        var bankAddress1Val = this.state.bankAddress1Val;
        var bankAddress2Val = this.state.bankAddress2Val;
		var contactPersonVal = this.state.contactPersonVal;
        var receivingAccountVal = this.state.receivingAccountVal;

        if( counterPartyVal != "" && 
			bankNameVal != "" &&
			bankAddress1Val != "" && 
			bankAddress2Val != "" &&
			contactPersonVal != "" && 
			receivingAccountVal != "")
        {
			this.setState({
				dialog_enable: true,
				dialog: <SystemResponse title="System Message" content="Success" close={this.closeDialogBox} />
			});
		}
		else
		{
			this.setState({
				dialog_enable: true,
				dialog: <SystemResponse title="Error" content="Input Incomplete" close={this.closeDialogBox} />
			});
		}
    },
	closeDialogBox: function () {
        this.setState({dialog_enable: false});
    },
	updateCounterParty: function(e){
      var val = e.target.value;
      this.setState({counterPartyVal: val})
    },
	updateBankName: function(e){
      var val = e.target.value;
      this.setState({bankNameVal: val})
    },
    updateBankAddress1: function(e){
      var val = e.target.value;
      this.setState({bankAddress1Val: val})
    },
    updateBankAddress2: function(e){
      var val = e.target.value;
      this.setState({bankAddress2Val: val})
    },
	updateContactPerson: function(e){
      var val = e.target.value;
      this.setState({contactPersonVal: val})
    },
	updateReceivingAccount: function(e){
      var val = e.target.value;
      this.setState({receivingAccountVal: val})
    },
	render:function(){
		return(
			<div className='app-border process_modal'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>View Interbank Record</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
						<div className='col-sm-12 app-body-inner'>
							<form className='form-group no-border-content'>
								<div className='row app-body-content'>
									<div className='row'>
										<div className='col-xs-12 col-sm-10 col-sm-offset-1'>
											<div className='col-xs-4 align-right'>
												<label><h5>Bank Code:</h5></label>
												</div>
											 <div className='col-xs-8'>
											 	<input className='form-control' type='text' value={this.props.bankCode} />
											 </div>
										</div>
									</div>
									<hr />
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Counter Party:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input id="counterParty" value={this.state.counterPartyVal} onChange={this.updateCounterParty} className="form-control" type="text" placeholder="" />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Bank Name:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input id="bankName" value={this.state.bankNameVal} onChange={this.updateBankName} className="form-control" type="text" placeholder="" />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Address:</h5></label>
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
												<label><h5>Receiving Account No:</h5></label>
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
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
								</div>
							</form>
						</div>
				</AppBody>
				<ViewFooter>
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

module.exports = DefineInterbankFileDetails;
