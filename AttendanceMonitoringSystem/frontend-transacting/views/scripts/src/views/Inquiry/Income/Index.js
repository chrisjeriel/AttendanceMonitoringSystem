'use strict';

var React = require('react');
var TransactionContainer = require('../../../components/TransactionContainer');
var ModalContainer = require('../../../components/ModalContainer');


var IncomeInquiry = React.createClass({
    getInitialState: function () {
        var hash_data = window.location.hash.split('?')[0].split('/');

        return {
            category: hash_data[4] // forex/btsu/tmu
        }
    },

    componentWillReceiveProps: function () {
        this.setState(this.getInitialState());
    },

    render: function () {
        return (
            <TransactionContainer>
                <ModalContainer className="income_inquiry_modal" title={this.state.category.toUpperCase() + ' INCOME FOR THE DAY'}>
                    <table className="table table-hover">
                        <thead>
                            <tr>
                                <th>
                                    REGULAR AMOUNT
                                </th>
                                <th>
                                    FCD AMOUNT
                                </th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td className="text-right">12313212</td>
                                <td className="text-right">12312312</td>
                            </tr>
                        </tbody>
                    </table>
                </ModalContainer>
            </TransactionContainer>
        );
    }
});

module.exports = IncomeInquiry;
