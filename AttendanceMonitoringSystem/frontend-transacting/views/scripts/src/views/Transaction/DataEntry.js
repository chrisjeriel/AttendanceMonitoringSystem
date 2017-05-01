'use strict';

var React = require('react');
var TransactionContainer = require('../../components/TransactionContainer');
var SeparatorComponent = require('../../components/SeparatorComponent');
var BeneficiaryData = require('./BeneficiaryData');
var FirstOverride = require('./FirstOverride');
var ConfirmModal = require('../../components/ConfirmModal');
var BPIClientForm = require('./BPIClientForm');
var ListOfClients = require('./ListOfClients');
var TravellersChecksDE = require('./TravellersChecksDE');
var ViewFooter = require('../../components/ViewFooter');
var ErrorMessage = require('../../components/ErrorMessage');

var DataEntry = React.createClass({
    contextTypes: {
        router: React.PropTypes.object
    },
    getInitialState: function () {
        var hash_data = window.location.hash.split('?')[0].split('/');

        return {
            is_bpi_client: false,
            is_with_documents: false,
            transaction_type: hash_data[4],
            category: hash_data[3].replace('deal_', ''),
            confirm_message: '',
            confirm_yes: 'Yes',
            confirm_no: 'No',
            key_listeners: [{
                key: 'Esc',
                action: 'Exit'
            }]
        }
    },
    componentDidMount: function () {
        $(this.refs.managing_unit).mask('0000000');
        $(this.refs.booking_unit).mask('0000000');
        $(this.refs.contact_no).mask('00000000000');
        $(this.refs.tin).mask('000-000-000');
        $(this.refs.birth_date).mask('00/00/00');

        window.addEventListener('keyup', this.key_listener);
    },
    componentWillUnmount: function () {
        window.removeEventListener('keyup', this.key_listener);
    },
    key_listener: function (e) {
        var key = e.key.toLowerCase();

        if (key === 'escape') {
            this.context.router.push('/main');
        }
    },
    componentWillReceiveProps: function () {
        this.setState(this.getInitialState());
    },
    confirmBPIClient: function () {
        var self = this;

        this.setState({
            confirm_message: 'BPI Client?',
            onConfirm: self.onConfirmBPIClient
        });
    },
    onConfirmBPIClient: function (res) {
        this.setState({
            confirm_message: '',
            is_bpi_client: res,
            show_bpi_client_form: res
        });
    },
    confirmClientWithDocuments: function () {
        var self = this;

        this.setState({
            confirm_message: 'Client with Documents?',
            onConfirm: self.onConfirmClientWithDocuments
        });
    },
    onConfirmClientWithDocuments: function (res) {
        var self = this;
        if (res) {
            this.setState({
                beneficiary_last_name: self.state.client_last_name,
                beneficiary_first_name: self.state.client_first_name,
                beneficiary_middle_name: self.state.client_middle_name
            })
        }

        this.setState({confirm_message: ''});
    },
    updateClientsLastName: function (event) {
        this.setState({client_last_name: event.target.value});
    },
    updateClientsFirstName: function (event) {
        this.setState({client_first_name: event.target.value});
    },
    updateClientsMiddleName: function (event) {
        this.setState({client_middle_name: event.target.value});
    },
    updateBeneficiaryLastName: function (event) {
        this.setState({beneficiary_last_name: event.target.value});
    },
    updateBeneficiaryFirstName: function (event) {
        this.setState({beneficiary_first_name: event.target.value});
    },
    updateBeneficiaryMiddleName: function (event) {
        this.setState({beneficiary_middle_name: event.target.value});
    },
    onChangeTranAmntIn: function (event) {
        var tran_amnt_in = event.target.value,
            equiv_amnt_in;

        //~(-1) = 0
        if (~['aud', 'cad'].indexOf(tran_amnt_in)) {
            equiv_amnt_in = 'usd';
        }
        else if (~['eur', 'jpy', 'usd'].indexOf(tran_amnt_in)) {
            equiv_amnt_in = 'php';
        }

        this.setState({
            tran_amnt_in: tran_amnt_in,
            equiv_amnt_in: equiv_amnt_in
        })
    },
    requestDealRate: function () {
        var self = this;

        this.setState({
            confirm_message: 'System will now request for Deal Rate',
            onConfirm: self.onConfirmRequestDealRate
        });
    },
    onConfirmRequestDealRate: function (res) {
        //update deal rate and request rate if request_deal_rate

        this.setState({confirm_message: ''})
    },
    computeBasedOnRequestedRate: function () {
        var self = this;

        this.setState({
            confirm_message: 'System will now compute based on Requested rate',
            onConfirm: self.onConfirmComputeBasedOnRequestedRate
        });
    },
    onConfirmComputeBasedOnRequestedRate: function (res) {
        //update tc postage, equiv amnt, net if will_compute
        // if tc postage == 0, equiv amnt = net

        this.setState({confirm_message: ''})
    },
    confirmCorporateBeneficiary: function () {
        //show settlement modal first if btsu and tmu
        var self = this;

        this.setState({
            confirm_message: 'Corporate Beneficiary?',
            onConfirm: self.onConfirmCorporateBeneficiary
        });
        //?
    },
    onConfirmCorporateBeneficiary: function (res) {
        //?

        this.setState({confirm_message: ''})
    },
    saveBeneficiaryData: function (address1, address2, birth_date, tin) {
        this.setState({
            beneficiary_address1: address1,
            beneficiary_address2: address2,
            beneficiary_birthdate: birth_date,
            beneficiary_tin: tin,
            show_beneficiary_data: false
        });
    },
    saveBPIClientForm: function (acct_no, currency, name) {
        this.setState({
            bpi_client_form_acct_no: acct_no,
            bpi_client_currency: currency,
            bpi_client_name: name,
            show_bpi_client_form: false
        });
    },
    showTravellersChecksDE: function () {
        if (this.state.category === 'btsu') {
            this.setState({show_travellers_checks_de: true});
        }
    },
    closeTravellersChecksDE: function () {
        this.setState({show_travellers_checks_de: false});
    },
    saveTravellersChecksData: function () {
        // save data from travellers checks Data Entry
        this.closeTravellersChecksDE();
    },
    showBeneficiaryDataModal: function () {
        if (this.state.beneficiary_last_name && this.state.beneficiary_first_name && this.state.beneficiary_middle_name) {
            this.setState({show_beneficiary_data: true});
        }
    },
    closeBeneficiaryModal: function (e) {
        e.preventDefault();
        this.setState({show_beneficiary_data: false});
    },
    closeBPIClientForm: function (e) {
        e.preventDefault();
        this.setState({show_bpi_client_form: false});
    },
    closeFirstOfficerOverride: function (e) {
        if (e) {
            e.preventDefault();
        }
        this.setState({show_officer_override_modal: false});
    },
    confirmGenerateTransactionAdvice: function () {
        var self = this;
        this.closeFirstOfficerOverride();

        // check if amount is greater than 10milion then 2nd override

        //forex
        this.setState({
            confirm_message: 'The system will Generate Transaction Advice?',
            onConfirm: self.onConfirmGenerateTransactionAdvice
        });

        //btsu
        //show message PURCHASE transaction successfully PROCESSED

        //tmu
        // show message Requires Trdr Approval. Proceed to FNL UPDT - SPCL RATE.
    },
    onConfirmGenerateTransactionAdvice: function (res) {
        var self = this;

        this.setState({confirm_message: ''})

        if (res) {
            this.setState({
                confirm_message: 'Print Transaction Advice?',
                onConfirm: self.onConfirmPrintTransactionAdvice
            });
        }
    },
    onConfirmPrintTransactionAdvice: function (res) {
        this.setState({confirm_message: ''})

        if (res) {
            //print
            //show success message
            //show temporary reference number
            //show proceed to final update - cash accept/settle
        }
    },
    dataSubmit: function (e) {
        e.preventDefault();
        var self = this;

        this.setState({
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
    showListOfClients: function (e) {
        var key = e.key.toLowerCase();

        if (key === 'f7') {
            this.setState({show_list_of_clients: true});
        }
    },
    selectClient: function (data) {
        //set values of form fields based on selected data using set state
        console.log(data);
        this.setState({show_list_of_clients: false});
    },
    confirmDeductNetCharges: function () {
        var self = this,
            message;

        if (this.state.category === 'btsu') {
            message = 'Deduct Net of Charges for Acceptance';
        }
        else if (this.states.category === 'tmu') {
            message = 'Deduct Net of Charges for Settlement';

        }

        this.setState({
            confirm_message: message,
            onConfirm: self.onConfirmDeductNetCharges
        });
    },
    onConfirmDeductNetCharges: function (res) {
        // save res somewhere?

        this.setState({confirm_message: ''});
    },
    updateTranAmnt: function (event) {
        this.setState({tran_amnt: event.target.value});
    },
    render: function () {
        return (
            <TransactionContainer title={this.state.transaction_type.toUpperCase() + ' DATA ENTRY (Deal w/ ' + this.state.category.toUpperCase() + ')'}>
                {
                    this.state.error_message ?
                        <ErrorMessage message={this.state.error_message} />
                        : ''
                }
                {
                    this.state.show_beneficiary_data ?
                        <BeneficiaryData closeBeneficiaryModal={this.closeBeneficiaryModal}
                            saveBeneficiaryData={this.saveBeneficiaryData}
                            name={this.state.beneficiary_last_name + ', ' + this.state.beneficiary_first_name + ' ' + this.state.beneficiary_middle_name}/>
                        : ''
                }
                {
                    this.state.show_officer_override_modal ?
                        <FirstOverride closeFirstOfficerOverride={this.closeFirstOfficerOverride}
                            then={this.confirmGenerateTransactionAdvice}/>
                        : ''
                }
                {
                    this.state.confirm_message ?
                        <ConfirmModal message={this.state.confirm_message} onConfirm={this.state.onConfirm} yes={this.state.confirm_yes} no={this.state.confirm_no}/>
                        : ''
                }
                {
                    this.state.show_bpi_client_form ?
                        <BPIClientForm close={this.closeBPIClientForm} save={this.saveBPIClientForm}/>
                        : ''
                }
                {
                    this.state.show_list_of_clients ?
                        <ListOfClients selectClient={this.selectClient}/>
                        : ''
                }
                {
                    this.state.show_travellers_checks_de ?
                        <TravellersChecksDE tran_amnt={this.state.tran_amnt} close={this.closeTravellersChecksDE} save={this.saveTravellersChecksData} />
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
                                ref='corp'
                                onBlur={this.confirmBPIClient} />
                        </div>
                        <div className="col-md-2">
                            <label>Managing Unit:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="Managing Unit No."
                                maxLength='7'
                                ref='managing_unit' />
                        </div>
                        <div className="col-md-2">
                            <label>Booking Unit:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="Booking Unit No."
                                maxLength='7'
                                ref='booking_unit' />
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
                                ref='last_name'
                                value={this.state.client_last_name}
                                onChange={this.updateClientsLastName}
                                onKeyUp={this.showListOfClients} />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="First Name"
                                maxLength='20'
                                ref='first_name'
                                value={this.state.client_first_name}
                                onChange={this.updateClientsFirstName}
                                onKeyUp={this.showListOfClients} />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="Middle Name"
                                maxLength='10'
                                ref='middle_name'
                                value={this.state.client_middle_name}
                                onChange={this.updateClientsMiddleName}
                                onKeyUp={this.showListOfClients} />
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
                                maxLength='60'
                                ref='address1'/>
                        </div>
                        <div className="col-md-5">
                            <input className="form-control1 col-md-5"
                                type="text"
                                placeholder="Address 2"
                                maxLength='60'
                                ref='address2' />
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
                                ref='contact_no' />
                        </div>
                        <div className="col-md-2">
                            <label>Birthdate:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="MM/DD/YY"
                                maxLength='9'
                                ref='birth_date' />
                        </div>
                        <div className="col-md-2">
                            <label>TIN #:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="TIN No."
                                maxLength='11'
                                ref='tin'
                                onBlur={this.confirmClientWithDocuments} />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Tran Amnt in
                            <select ref='tran_amnt_in' onChange={this.onChangeTranAmntIn}>
                                <option value=''>From</option>
                                <option value='aud'>AUD</option>
                                <option value='cad'>CAD</option>
                                <option value='eur'>EUR</option>
                                <option value='jpy'>JPY</option>
                                <option value='usd'>USD</option>
                            </select>
                            :
                            </label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                ref='tran_amnt'
                                onBlur={this.requestDealRate}
                                onChange={this.updateTranAmnt} />
                        </div>
                        <div className="col-md-2">
                            <label>TC Postage:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                ref='tc_postage'/>
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Deal Rate:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                onBlur={this.showTravellersChecksDE}
                                ref='deal_rate' />
                        </div>
                        <div className="col-md-2">
                            <label>Request Rate:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='request_rate'
                                onBlur={this.computeBasedOnRequestedRate} />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Equiv Amnt in {(this.state.equiv_amnt_in || 'YYY').toUpperCase()}:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                ref='equiv_amnt' />
                        </div>
                        <div className="col-md-2">
                            <label>Net:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                ref='net' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Acceptance:</label>
                        </div>
                        <div className="col-md-4">
                            <select ref='acceptance' onChange={this.confirmDeductNetCharges}>
                                <option value=''></option>
                                <option value='test'>test</option>
                                {
                                    //get acceptance mode codes from backend
                                }
                            </select>
                        </div>
                        <div className="col-md-2">
                            <label>Reference:</label>
                        </div>
                        <div className="col-md-4">
                            <select ref='acceptance_reference'>
                                <option value=''></option>
                                {
                                    //get references based on acceptance
                                }
                            </select>
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
                                ref='acceptance_doc_stamp' />
                        </div>
                        <div className="col-md-2">
                            <label>Commission:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='acceptance_commission' />
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
                                ref='remitter_last_name'
                                value={this.state.client_last_name} />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="First Name"
                                maxLength='20'
                                ref='remitter_first_name'
                                value={this.state.client_first_name} />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="Middle Name"
                                maxLength='10'
                                ref='remitter_middle_name'
                                value={this.state.client_middle_name} />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Settlement:</label>
                        </div>
                        <div className="col-md-4">
                            <select ref='settlement'>
                                <option value=''></option>
                                {
                                    //get settlement mode codes from backend
                                }
                            </select>
                        </div>
                        <div className="col-md-2">
                            <label>Reference:</label>
                        </div>
                        <div className="col-md-4">
                            <select ref='settlement_reference' onChange={this.confirmCorporateBeneficiary}>
                                <option value=''></option>
                                <option value='1'>1</option>
                                {
                                    //get references based on settlement
                                }
                            </select>
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
                                ref='settlemnt_doc_stamp' />
                        </div>
                        <div className="col-md-2">
                            <label>Commission:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='settlement_commission' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Beneficiary's Name:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="Last Name"
                                maxLength='20'
                                ref='beneficiary_last_name'
                                onChange={this.updateBeneficiaryLastName}
                                value={this.state.beneficiary_last_name} />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="First Name"
                                maxLength='20'
                                ref='beneficiary_first_name'
                                onChange={this.updateBeneficiaryFirstName}
                                value={this.state.beneficiary_first_name} />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="Middle Name"
                                maxLength='10'
                                ref='beneficiary_middle_name'
                                onChange={this.updateBeneficiaryMiddleName}
                                onBlur={this.showBeneficiaryDataModal}
                                value={this.state.beneficiary_middle_name} />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Invisible Codes:</label>
                        </div>
                        <div className="col-md-4">
                            <select ref='invisible_codes' onChange={this.onChangeInvisibleCodes}>
                                <option value=''></option>
                                {
                                    //get invisible codes
                                }
                            </select>
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
                                ref='special_mesage' />
                        </div>
                    </div>
                    <br/>
                    <div className="row"><SeparatorComponent></SeparatorComponent></div>
                    <div className="row">
                        <div className="col-md-offset-3 col-md-2">
                            <label>Reference No.:</label>
                        </div>
                        <div className="col-md-4">
                            {this.state.ref_no || ''}
                        </div>
                    </div>
                    <button type='submit' hidden></button>
                </form>
                <ViewFooter message={this.state.footer_message} key_listeners={this.state.key_listeners} />
            </TransactionContainer>
        );
    }
});

module.exports = DataEntry;
