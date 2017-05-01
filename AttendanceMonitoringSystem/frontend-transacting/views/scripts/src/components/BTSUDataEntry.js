'use strict';

var React = require('react');
var TransactionContainer = require('../components/TransactionContainer');
var TextViewComponent = require('../components/TextViewComponent');
var SeparatorComponent = require('./SeparatorComponent');
var Auth = require('../auth/Auth');


var BTSUDataEntry = React.createClass({
    render: function() {
        return(
            <TransactionContainer title='PURCHASE DATA ENTRY (Deal w/ BTSU)'>
                <form>
                    <div className="row">
                        <div className="col-md-2">
                            <label>CORP [Y/N]?:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="Y/N"
                                maxLength='1'
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-2">
                            <label>Managing Unit:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="Managing Unit No."
                                maxLength='7'
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-2">
                            <label>Booking Unit:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="Booking Unit No."
                                maxLength='7'
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
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
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="First Name"
                                maxLength='20'
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="Middle Name"
                                maxLength='10'
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
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
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-5">
                            <input className="form-control1 col-md-5"
                                type="text"
                                placeholder="Address 2"
                                maxLength='7'
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
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
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-2">
                            <label>Birthdate:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="MM/DD/YY"
                                maxLength='9'
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-2">
                            <label>TIN #:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                placeholder="TIN No."
                                maxLength='11'
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Tran Amnt in:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-2">
                            <label>:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-2">
                            <label>TC Postage:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
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
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-2">
                              <label>Request Rate:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-2">
                            <label>Equiv Amnt in:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-2">
                            <label>:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-2">
                            <label>Net:</label>
                        </div>
                        <div className="col-md-2">
                            <input className="form-control1"
                                type="text"
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
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
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-2">
                            <label>Reference:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
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
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-2">
                            <label>Commission:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
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
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="First Name"
                                maxLength='20'
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="Middle Name"
                                maxLength='10'
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
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
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-2">
                            <label>Reference:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
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
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-2">
                            <label>Commission:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                placeholder="0.00"
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
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
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="First Name"
                                maxLength='20'
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                        <div className="col-md-3">
                            <input className="form-control1"
                                type="text"
                                placeholder="Middle Name"
                                maxLength='10'
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
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
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
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
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                    </div>
                    <div className="row">
                        <SeparatorComponent></SeparatorComponent>
                    </div>
                    <div className="row refcenter">
                        <div className="col-md-2">
                            <label>Reference No.:</label>
                        </div>
                        <div className="col-md-4">
                            <input className="form-control1"
                                type="text"
                                ref='officeCode'
                                onChange={this.updateOfficeCode} />
                        </div>
                    </div>
                </form>
            </TransactionContainer>
        );
    }
});

module.exports = BTSUDataEntry;
