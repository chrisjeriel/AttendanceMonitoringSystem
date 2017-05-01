'use strict';

var React = require('react');

var TransactionContainer = require('../../../components/TransactionContainer');
var RateInquiryModal = require('./RateInquiryModal');
var RateTypeModal = require('./RateTypeModal');
var BuyingSellingRateModal = require('./BuyingSellingRateModal');

var RateInquiry = React.createClass({
    contextTypes: {
        router: React.PropTypes.object
    },

    getInitialState: function () {
        var hash_data = window.location.hash.split('?')[0].split('/');

        return {
            category: hash_data[4], // forex/btsu/tmu
            show_rate_type_modal: true,
            rate_type: {}
        }
    },

    componentWillReceiveProps: function () {
        this.setState(this.getInitialState());
    },

    componentDidMount: function () {
        window.addEventListener('keyup', this.componentKeyListener);
    },

    componentWillUnmount: function () {
        window.removeEventListener('keyup', this.componentKeyListener);
    },

    componentKeyListener: function (event) {
        var key = event.key.toLowerCase();

        if (key === 'f2') {
            this.setState({show_rate_type_modal: !this.state.show_rate_type_modal});
        }
        else if (key === 'enter') {
            this.proceed();
        }
    },

    setRateType: function (rate_type) {
        this.setState({
            rate_type: rate_type,
            show_rate_type_modal: false
        });
    },

    proceed: function () {
        //request data then show table
        if (this.state.rate_type) {
            this.setState({show_buying_selling_rate_modal: true});
        }
    },

    render: function() {
        return (
            <TransactionContainer>
                <RateInquiryModal data={this.state.rate_type} title={this.state.category.toUpperCase() + ' RATE INQUIRY'} />
                {
                    this.state.show_rate_type_modal ?
                        <RateTypeModal onSelect={this.setRateType}/>
                        : ''
                }
                {
                    this.state.show_buying_selling_rate_modal ?
                        <BuyingSellingRateModal data={this.state.rate_type} title={this.state.category.toUpperCase() + ' ' + this.state.rate_type.tran_unit + ' -OTC'} />
                        : ''
                }
            </TransactionContainer>
        );
    }
});

module.exports = RateInquiry;
