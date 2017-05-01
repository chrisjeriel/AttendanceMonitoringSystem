'use strict';

var React = require('react');
var TransactionContainer = require('../../../components/TransactionContainer');
var InquiryModal = require('./InquiryModal');
var HistoricalRecordTable = require('./HistoricalRecordTable');

var ClientsHistoricalRecords = React.createClass({
    getInitialState: function () {
        return {};
    },
    submitInquiry: function (data) {
        console.log(data)
        this.setState({input_data: data});
    },
    componentDidMount: function () {
        window.addEventListener('keyup', this.exitTable);
    },
    componentWillUnmount: function () {
        window.removeEventListener('keyup', this.exitTable);
    },
    exitTable: function (e) {
        var key = e.key.toLowerCase();

        if (key === 'escape') {
            this.setState({input_data: null});
        }
    },
    render: function () {
        return (
            <TransactionContainer>
                <InquiryModal onSubmit={this.submitInquiry}/>
                {
                    this.state.input_data ?
                        <HistoricalRecordTable input_data={this.state.input_data}/>
                        : ''
                }
            </TransactionContainer>
        );
    }
});

module.exports = ClientsHistoricalRecords;
