'use strict';

var React = require('react');
var TransactionContainer = require('../../../components/TransactionContainer');
var ConfirmModal = require('../../../components/ConfirmModal');

var AcceptedTC = React.createClass({
    contextTypes: {
        router: React.PropTypes.object
    },
    getInitialState: function () {
        var hash_data = window.location.hash.split('?')[0].split('/'),
            category = hash_data[4],
            self = this;

        return {
            category: category, //btsu/forex/tmu
            confirm_message: 'View Screen Layout for ' + category.toUpperCase() + ' Accepted Traveller\'s Check for the Day, Continue?',
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
            confirm_message: 'Proceed to Printing of ' + this.state.category.toUpperCase() + ' TRAVELLER\'S CHECKS FOR THE DAY',
            onConfirm: self.confirmProceedtoPrinting
        });
    },
    confirmProceedtoPrinting: function (res) {
        this.setState({confirm_message: ''});

        if (res) {
            //print
            alert('Printing of ' + this.state.category.toUpperCase() + ' Traveller\'s Checks for the Day Successful');
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
        var category = this.state.category.toUpperCase();

        if (this.state.confirm_message) {
            return (
                <TransactionContainer title={category + " ACCEPTED TRAVELLER'S CHECKS FOR THE DAY"}>
                    <ConfirmModal message={this.state.confirm_message} onConfirm={this.state.onConfirm} />
                </TransactionContainer>
            );
        }

        return(
            <TransactionContainer title={category + " ACCEPTED TRAVELLER'S CHECKS FOR THE DAY"}>
                <div className='row'>
                    <div className='col-md-6 col-md-offset-3 text-center'>
                        CBG FX SYSTEM <br/>
                        LIST OF ACCEPTED TRAVELLER'S CHECKS FOR THE DAY <br/>
                        DEALT WITH {category} <br/>
                        BUENDIA CENTER BRANCH <br/>
                        October 15, 2002
                    </div>
                    <div className='col-md-1'>
                        PAGE: <br/>
                        TIME: 11:
                    </div>
                </div>
                <br/>
                <div className='row'>
                    <div className='col-xs-10 col-xs-offset-1'>
                        <div className='row'>
                            <div className='col-xs-2 col-xs-offset-1 dashedHeader text-center'>
                                Reference No.
                            </div>
                            <div className='col-xs-2 col-xs-offset-1 dashedHeader'>
                                TC Serial No.
                            </div>
                            <div className='col-xs-1 col-xs-offset-1 dashedHeader text-center'>
                                Curr.
                            </div>
                            <div className='col-xs-2 col-xs-offset-1 text-right dashedHeader'>
                                Amount
                            </div>
                        </div>
                        <div className='row'>
                            <div className='col-xs-2 col-xs-offset-1'>
                                2P020000006
                            </div>
                            <div className='col-xs-2 col-xs-offset-1'>
                                111
                            </div>
                            <div className='col-xs-1 col-xs-offset-1 text-center'>
                                USD
                            </div>
                            <div className='col-xs-2 col-xs-offset-1 text-right'>
                                180.60
                            </div>
                        </div>
                        <div className='row'>
                            <div className='col-xs-2 col-xs-offset-1'>
                                2P020000135
                            </div>
                            <div className='col-xs-2 col-xs-offset-1'>
                                222
                            </div>
                            <div className='col-xs-1 col-xs-offset-1 text-center'>
                                USD
                            </div>
                            <div className='col-xs-2 col-xs-offset-1 text-right'>
                                190.00
                            </div>
                        </div>
                        <div className='row'>
                            <div className='col-xs-2 col-xs-offset-1'>
                                2P020000136
                            </div>
                            <div className='col-xs-2 col-xs-offset-1'>
                                333
                            </div>
                            <div className='col-xs-1 col-xs-offset-1 text-center'>
                                USD
                            </div>
                            <div className='col-xs-2 col-xs-offset-1 text-right'>
                                191.00
                            </div>
                        </div>
                        <div className='row'>
                            <div className='col-xs-2 col-xs-offset-1'>
                                2P020000137
                            </div>
                            <div className='col-xs-2 col-xs-offset-1'>
                                555
                            </div>
                            <div className='col-xs-1 col-xs-offset-1 text-center'>
                                USD
                            </div>
                            <div className='col-xs-2 col-xs-offset-1 text-right'>
                                200.00
                            </div>
                        </div>
                    </div>
                </div>
            </TransactionContainer>
        );
    }
});

module.exports = AcceptedTC;
