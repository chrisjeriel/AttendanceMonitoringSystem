'use strict';

var React = require('react');
var TransactionContainer = require('../../../components/TransactionContainer');
var TextViewComponent = require('../../../components/TextViewComponent');
var SeparatorComponent = require('../../../components/SeparatorComponent');
var ConfirmModal = require('../../../components/ConfirmModal');
var OtherDetails = require('../../../components/OtherDetails');
var SystemMessage = require('../../../components/SystemMessage');

var InquiryDataEntry = React.createClass({
    contextTypes: {
        router: React.PropTypes.object
    },
    getInitialState: function () {
        var hash_data = window.location.hash.split('?')[0].split('/');

        return {
            transaction_type: hash_data[3], // purchase/sale
            category: this.props.params.category, // forex/btsu/tmu
            inquiry: this.props.params.inquiry, // today/error
            ref_no: this.props.params.ref_no
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
    render: function () {
        var title = this.state.category.toUpperCase() + ' ' + this.state.transaction_type.toUpperCase() + (this.state.inquiry === 'today' ? ' Today\'s Transactions' : ' Error Corrected Transactions') + ' Inquiry';

        return (
            <TransactionContainer title={title}>
                {
                    this.state.show_other_details ?
                        <OtherDetails close={this.close_other_details}/>
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
                                maxLength='1' />
                        </div>
                        <div className="col-md-2">
                            <label>Managing Unit:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="Managing Unit No."
                                maxLength='7' />
                        </div>
                        <div className="col-md-2">
                            <label>Booking Unit:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="Booking Unit No."
                                maxLength='7' />
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
                                maxLength='20' />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="First Name"
                                maxLength='20' />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="Middle Name"
                                maxLength='10' />
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
                                maxLength='1' />
                        </div>
                        <div className="col-md-5">
                            <input className="form-control1 col-md-5"
                                type="text"
                                placeholder="Address 2"
                                maxLength='7' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Contact No:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="Contact No." />
                        </div>
                        <div className="col-md-2">
                            <label>Birthdate:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="MM/DD/YY"
                                maxLength='9' />
                        </div>
                        <div className="col-md-2">
                            <label>TIN #:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="TIN No."
                                maxLength='11' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Tran Amnt in:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text" />
                        </div>
                        <div className="col-md-2">
                            <label>:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text" />
                        </div>
                        <div className="col-md-2">
                            <label>TC Postage:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text" />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label><mark className = "bgcolor"><b>RATES-></b></mark>Deal:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00" />
                        </div>
                        <div className="col-md-2">
                            <label>Request Rate:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00" />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Equiv Amnt in:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text" />
                        </div>
                        <div className="col-md-2">
                            <label>:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text" />
                        </div>
                        <div className="col-md-2">
                            <label>Net:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text" />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Acceptance:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00" />
                        </div>
                        <div className="col-md-2">
                            <label>Reference:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00" />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Doc Stamp:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00" />
                        </div>
                        <div className="col-md-2">
                            <label>Commission:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00" />
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
                                maxLength='20' />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="First Name"
                                maxLength='20' />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="Middle Name"
                                maxLength='10' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Settlement:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00" />
                        </div>
                        <div className="col-md-2">
                            <label>Reference:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00" />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Doc Stamp:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00" />
                        </div>
                        <div className="col-md-2">
                            <label>Commission:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00" />
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
                                maxLength='20' />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="First Name"
                                maxLength='20' />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="Middle Name"
                                maxLength='10' />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Invisible Codes:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00" />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Special Message:</label>
                        </div>
                        <div className="col-md-10">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00" />
                        </div>
                    </div>
                    <div className="row"><SeparatorComponent></SeparatorComponent></div>
                    <div className="row refcenter">
                        <div className="col-md-2">
                            <label>Reference No.:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text" />
                        </div>
                    </div>
                    <div className="row"><SeparatorComponent></SeparatorComponent></div>
                    <div className="row">
                        <button type="button" onClick={this.context.router.goBack} className="btn btn-default col-sm-offset-1 col-sm-2">
                            Exit
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

module.exports = InquiryDataEntry;
