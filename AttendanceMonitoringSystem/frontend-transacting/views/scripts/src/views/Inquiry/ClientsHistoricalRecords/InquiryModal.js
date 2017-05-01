'use strict';

var React = require('react');
var ModalContainer = require('../../../components/ModalContainer');

var InquiryModal = React.createClass({
    getInitialState: function () {
        var hash_data = window.location.hash.split('?')[0].split('/');

        return {
            transaction_type: hash_data[4]
        }
    },
    componentWillReceiveProps: function () {
        this.setState(this.getInitialState());
    },
    selectOption: function (e) {
        this.setState({
            inquiry_field: e.target.value //first_name, last_name, middle_name, full_name
        });
    },
    submitForm: function (e) {
        e.preventDefault();
        var inquiry_field = this.state.inquiry_field,
            value;

        if (inquiry_field) {
            value = this.refs[inquiry_field].value;
        }

        if (value) {
            this.props.onSubmit({
                inquiry_field: inquiry_field,
                value: value
            });
        }
    },
    render: function() {
        return(
            <ModalContainer className="chr_inquiry" title={'INQUIRY ON CLIENT ' + this.state.transaction_type.toUpperCase() + ' HISTORICAL RECORD'}>
                <form onSubmit={this.submitForm}>
                    <div className = "row">
                        <div className="col-md-offset-1 col-md-1">
                            <input type="radio"
                                className="chr_radio"
                                name="chr_radio"
                                value="last_name"
                                id="chr_radio1"
                                onChange={this.selectOption} />
                        </div>
                        <div className="col-md-3">
                            <label><h5>LAST NAME:</h5></label>
                        </div>
                        <div className="col-md-6">
                            <input className="form-control"
                                type="text"
                                placeholder="LAST NAME"
                                ref="last_name"
                                maxLength='20' />
                        </div>
                    </div>
                    <div className = "row">
                        <div className="col-md-offset-1 col-md-1">
                            <input type="radio"
                                className="chr_radio"
                                name="chr_radio"
                                value="first_name"
                                id="chr_radio2"
                                onChange={this.selectOption} />
                        </div>
                        <div className="col-md-3">
                            <label><h5>FIRST NAME:</h5></label>
                        </div>
                        <div className="col-md-6">
                            <input className="form-control"
                                type="text"
                                placeholder="FIRST NAME"
                                ref="first_name"
                                maxLength='20' />
                        </div>
                    </div>
                    <div className = "row">
                        <div className="col-md-offset-1 col-md-1">
                            <input type="radio"
                                className="chr_radio"
                                name="chr_radio"
                                value="middle_name"
                                id="chr_radio3"
                                onChange={this.selectOption} />
                        </div>
                        <div className="col-md-3">
                            <label><h5>MIDDLE NAME:</h5></label>
                        </div>
                        <div className="col-md-6">
                            <input className="form-control"
                                type="text"
                                placeholder="MIDDLE NAME"
                                ref="middle_name"
                                maxLength='20' />
                        </div>
                    </div>
                    <div className = "row">
                        <div className="col-md-offset-1 col-md-1">
                            <input type="radio"
                                className="chr_radio"
                                name="chr_radio"
                                value="full_name"
                                id="chr_radio4"
                                onChange={this.selectOption} />
                        </div>
                        <div className="col-md-3">
                            <label><h5>FULL NAME:</h5></label>
                        </div>
                        <div className="col-md-6">
                            <input className="form-control"
                                type="text"
                                placeholder="FULL NAME"
                                ref="full_name"
                                maxLength='100' />
                        </div>
                    </div>
                    <button type="submit" hidden></button>
                </form>
                <br />
                <br />
                <br />
                <br />
            </ModalContainer>
        );
    }
});

module.exports = InquiryModal;
