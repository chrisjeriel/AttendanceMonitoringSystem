'use strict';

var React = require('react');
var ConfirmModal = require('../../../components/ConfirmModal');
var TransactionContainer = require('../../../components/TransactionContainer');

var CancelledTransactions = React.createClass({
    contextTypes: {
        router: React.PropTypes.object
    },
    getInitialState: function () {
        var hash_data = window.location.hash.split('?')[0].split('/'),
            category = hash_data[4],
            transaction_type = hash_data[5],
            self = this;

        return {
            category: category, //btsu/forex/tmu
            transaction_type: transaction_type, //purchase/sale
            confirm_message: 'View Screen Layout for ' + category.toUpperCase() + ' ERROR CORRECTED ' + transaction_type.toUpperCase() + ' Transactions, Continue?',
            onConfirm: self.confirmContinueToScreen
        }
    },
    confirmContinueToScreen: function (res) {
        if (!res) {
            this.showPrinterMessage()
            return;
        }

        this.setState({confirm_message: ''});
    },
    showPrinterMessage: function () {
        var self = this;

        this.setState({
            confirm_message: 'Proceed to Printing of ' + this.state.category.toUpperCase() + ' ERROR CORRECTED ' + this.state.transaction_type.toUpperCase() + ' Transactions.',
            onConfirm: self.confirmProceedtoPrinting
        });
    },
    confirmProceedtoPrinting: function (res) {
        this.setState({confirm_message: ''});

        if (res) {
            //print
            alert('Printing ' + this.state.category.toUpperCase() + ' ERROR CORRECTED ' + this.state.transaction_type.toUpperCase() + ' Transactions for the Day Successful');
        }

        this.context.router.push('/main');
    },
    componentWillReceiveProps: function () {
        this.setState(this.getInitialState());
    },
    componentDidMount: function () {
        window.addEventListener('keyup', this.exitListener);
    },
    exitListener: function (e) {
        var key = e.key.toLowerCase();

        if (key === 'escape') {
            this.showPrinterMessage();
        }
    },
    componentWillUnmount: function () {
        window.removeEventListener('keyup', this.exitListener);
    },
    render: function () {
        var category = this.state.category.toUpperCase(),
            transaction_type = this.state.transaction_type.toUpperCase();

        if (this.state.confirm_message) {
            return (
                <TransactionContainer title={category + ' ERROR CORRECTED ' + transaction_type + ' TRANSACTIONS FOR THE DAY'}>
                    <ConfirmModal message={this.state.confirm_message} onConfirm={this.state.onConfirm} />
                </TransactionContainer>
            );
        }

        return(
            <TransactionContainer title={category + ' ERROR CORRECTED ' + transaction_type + ' TRANSACTIONS FOR THE DAY'}>
                <div className="row text-center">
                    <div className="col-md-2 col-md-offset-10">
                        CBG FX SYSTEM <br/>
                        ERROR CORRECTED {transaction_type} TRA <br/>
                        DEALT WITH {category} <br/>
                        BUENDIA CENTER BRANCH <br/>
                        October 15, 2002
                    </div>
                </div>
                <br/>
                <div className="dashedHeader">
                    <table className="table table-noborder">
                        <tbody>
                            <tr>
                                <td className="quarter">
                                    TRAN REF No. <br/>
                                    ACPT > CURR <br/>
                                    SETL >
                                </td>
                                <td className="quarter">
                                    PEND REF No. <br/>
                                    MODE
                                </td>
                                <td className="quarter">
                                    CLIENT NAME <br/>
                                    <span className="indented">
                                        DOC STAMP
                                    </span>
                                </td>
                                <td className="text-center quarter">
                                    <br/>
                                    COMMISION
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div>
                    <table className="table table-condensed table-noborder">
                        <tbody>
                            <tr>
                                <td className="quarter">
                                    2P020000138
                                </td>
                                <td className="quarter">
                                    BP2P3723720000101
                                </td>
                                <td className="quarter">
                                    CRUZ, EDITH SANTOS
                                </td>
                                <td className="quarter">

                                </td>
                            </tr>
                            <tr>
                                <td className="quarter">
                                    <span className="indented">AUD</span>
                                </td>
                                <td className="quarter">
                                    CIV FX
                                </td>
                                <td className="quarter">
                                    <span className="indented-2">0.00</span>
                                </td>
                                <td className="text-center quarter">
                                    0.00
                                </td>
                            </tr>
                            <tr>
                                <td className="quarter">
                                    <span className="indented">USD</span>
                                </td>
                                <td className="quarter">
                                    CIV FX
                                </td>
                                <td className="quarter">
                                    <span className="indented-2">0.00</span>
                                </td>
                                <td className="text-center quarter">
                                    0.00
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </TransactionContainer>
        );
    }
});

module.exports = CancelledTransactions;
