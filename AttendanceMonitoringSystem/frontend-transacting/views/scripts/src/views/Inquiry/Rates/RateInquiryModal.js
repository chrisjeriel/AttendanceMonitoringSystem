'use strict';

var React = require('react');
var ModalContainer = require('../../../components/ModalContainer');

var RateInquiryModal = React.createClass({
    render: function () {
        return (
            <ModalContainer className="rate_inquiry_modal" title={this.props.title}>
                <div className="row">
                    <div className="col-sm-offset-2 col-sm-2">
                        Rate Type:
                    </div>
                    <div className="col-sm-offset-1 col-sm-7">
                        {this.props.data.name || ''}
                    </div>
                </div>
                <br/>
                <div className="row">
                    <div className="col-sm-offset-2 col-sm-2">
                        Tran Unit:
                    </div>
                    <div className="col-sm-offset-1 col-sm-7">
                        {this.props.data.tran_unit || ''}
                    </div>
                </div>
                <br/>
                <div className="row">
                    <div className="col-sm-offset-2 col-sm-2">
                        Currency:
                    </div>
                    <div className="col-sm-offset-1 col-sm-7">
                        USD
                    </div>
                </div>
                <br/>
                <br/>
            </ModalContainer>
        );
    }
});

module.exports = RateInquiryModal;
