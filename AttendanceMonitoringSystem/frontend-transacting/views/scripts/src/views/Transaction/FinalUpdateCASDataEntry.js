'use strict';

var React = require('react');
var TransactionContainer = require('../../components/TransactionContainer');
var TextViewComponent = require('../../components/TextViewComponent');
var SeparatorComponent = require('../../components/SeparatorComponent');
var TellerValidation = require('./TellerValidation');
var FirstOverride = require('./FirstOverride');
var ConfirmModal = require('../../components/ConfirmModal');
var OtherDetails = require('../../components/OtherDetails');
var SystemMessage = require('../../components/SystemMessage');

var FinalUpdateCASDataEntry = React.createClass({
    contextTypes: {
        router: React.PropTypes.object
    },
    getInitialState: function () {
        var hash_data = window.location.hash.split('?')[0].split('/');

        return {
            transaction_type: hash_data[4],
            category: hash_data[3].replace('deal_', '')
        }
    },
    componentWillReceiveProps: function () {
        this.setState(this.getInitialState());
    },
    showOtherDetails: function (e) {
        e.preventDefault();
        //open modal for other details. still missing screen.:(

        this.setState({show_other_details: true});
    },
    close_other_details: function () {
        this.setState({show_other_details: false});
    },
    dataSubmit: function (e) {
        e.preventDefault();
        var self = this;
        // show teller validation
        this.setState({show_teller_validation: true});
    },
    validateTeller: function (acceptance_validation, settlement_validation) {
        //send request, if success show officer override, close teller validation
        var self = this;

        this.setState({
            show_teller_validation: false,
            confirm_message: 'Proceed to Officer Override?',
            onConfirm: self.onConfirmProceedToOfficerOverride
        });
    },
    onConfirmProceedToOfficerOverride: function (res) {
        this.setState({
            confirm_message: '',
            show_officer_override_modal: res
        });
    },
    closeFirstOfficerOverride: function (e) {
        if (e) {
            e.preventDefault();
        }
        this.setState({show_officer_override_modal: false});
    },
    showSuccessfullyProcessed: function () {
        var self = this;

        self.closeFirstOfficerOverride();


        // show modal with message
        this.setState({system_message: 'Final Update successfully PROCESSED.'})
        setTimeout(function () {
            self.setState({system_message: 'Reference No. for this Transaction is 1P020000425'});
        }, 2000);

        setTimeout(function () {
            // delete successfully updated transaction from the list of transactions for final update
            self.setState({system_message: ''});
            self.context.router.goBack();
        }, 4000);
    },
    render: function () {
        return (
            <TransactionContainer title={this.state.category.toUpperCase() + ' ' + this.state.transaction_type.toUpperCase() + ' FINAL UPDATE on Cash Acceptance/Settlement'}>
                {
                    this.state.show_officer_override_modal ?
                        <FirstOverride closeFirstOfficerOverride={this.closeFirstOfficerOverride}
                            then={this.showSuccessfullyProcessed}/>
                        : ''
                }
                {
                    this.state.show_teller_validation ?
                        <TellerValidation validateTeller={this.validateTeller} />
                        : ''
                }
                {
                    this.state.confirm_message ?
                        <ConfirmModal message={this.state.confirm_message} onConfirm={this.state.onConfirm} />
                        : ''
                }
                {
                    this.state.show_other_details ?
                        <OtherDetails close={this.close_other_details}/>
                        : ''

                }
                {
                    this.state.system_message ?
                    <SystemMessage message={this.state.system_message}/>
                    : ''
                }
                <form onSubmit={this.dataSubmit}>
                    <div className="row">
                        <div className="col-md-2">
                            <label>CORP [Y/N]?:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="Y/N"
                                maxLength='1'
                                ref='officeCode' />
                        </div>
                        <div className="col-md-2">
                            <label>Managing Unit:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="Managing Unit No."
                                maxLength='7'
                                ref='officeCode' />
                        </div>
                        <div className="col-md-2">
                            <label>Booking Unit:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="Booking Unit No."
                                maxLength='7'
                                ref='officeCode' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Client Name:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="Last Name"
                                maxLength='20'
                                ref='officeCode' />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="First Name"
                                maxLength='20'
                                ref='officeCode' />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="Middle Name"
                                maxLength='10'
                                ref='officeCode' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Address:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="Address 1"
                                maxLength='1'
                                ref='officeCode' />
                        </div>
                        <div className="col-md-5">
                            <input className="form-control1 col-md-5"
                                type="text"
                                placeholder="Address 2"
                                maxLength='7'
                                ref='officeCode' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Contact No:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="Contact No."
                                ref='officeCode' />
                        </div>
                        <div className="col-md-2">
                            <label>Birthdate:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="MM/DD/YY"
                                maxLength='9'
                                ref='officeCode' />
                        </div>
                        <div className="col-md-2">
                            <label>TIN #:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="TIN No."
                                maxLength='11'
                                ref='officeCode' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Tran Amnt in:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                ref='officeCode' />
                        </div>
                        <div className="col-md-2">
                            <label>:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                ref='officeCode' />
                        </div>
                        <div className="col-md-2">
                            <label>TC Postage:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                ref='officeCode' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label><mark className = "bgcolor"><b>RATES-></b></mark>Deal:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='officeCode' />
                        </div>
                        <div className="col-md-2">
                            <label>Request Rate:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='officeCode' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Equiv Amnt in:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                ref='officeCode' />
                        </div>
                        <div className="col-md-2">
                            <label>:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                ref='officeCode' />
                        </div>
                        <div className="col-md-2">
                            <label>Net:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                ref='officeCode' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Acceptance:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='officeCode' />
                        </div>
                        <div className="col-md-2">
                            <label>Reference:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='officeCode' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Doc Stamp:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='officeCode' />
                        </div>
                        <div className="col-md-2">
                            <label>Commission:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='officeCode' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Remitters Name:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="Last Name"
                                maxLength='20'
                                ref='officeCode' />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="First Name"
                                maxLength='20'
                                ref='officeCode' />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="Middle Name"
                                maxLength='10'
                                ref='officeCode' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Settlement:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='officeCode' />
                        </div>
                        <div className="col-md-2">
                            <label>Reference:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='officeCode' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Doc Stamp:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='officeCode' />
                        </div>
                        <div className="col-md-2">
                            <label>Commission:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='officeCode' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Beneficiarys Name:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="Last Name"
                                maxLength='20'
                                ref='officeCode' />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="First Name"
                                maxLength='20'
                                ref='officeCode' />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="Middle Name"
                                maxLength='10'
                                ref='officeCode' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Invisible Codes:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='officeCode' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Special Message:</label>
                        </div>
                        <div className="col-md-10">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='officeCode' />
                        </div>
                    </div>
                    <br/>
                    <div className="row"><SeparatorComponent></SeparatorComponent></div>
                    <div className="row">
                        <div className="col-md-offset-3 col-md-2">
                            <label>Reference No.:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                ref='officeCode' />
                        </div>
                    </div>
                    <br/>
                    <div className="row"><SeparatorComponent></SeparatorComponent></div>
                    <div className="row">
                        <button type="button" onClick={this.context.router.goBack} className="btn btn-default col-sm-offset-1 col-sm-2">
                            Exit
                        </button>
                        <button type="submit" className="btn btn-default col-sm-offset-1 col-sm-2">
                            Process
                        </button>
                        <button type="button" onClick={this.showOtherDetails} className="btn btn-default col-sm-offset-1 col-sm-2">
                            Other Details
                        </button>
                    </div>
                </form>
            </TransactionContainer>
        );
    }
});

module.exports = FinalUpdateCASDataEntry;
