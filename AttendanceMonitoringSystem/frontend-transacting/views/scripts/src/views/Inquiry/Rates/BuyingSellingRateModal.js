'use strict';

var React = require('react');
var ModalContainer = require('../../../components/ModalContainer');

var BuyingSellingRateModal = React.createClass({
    render: function () {
        return (
            <ModalContainer className="buying_selling_rate_modal" title={this.props.title}>
                <table className="table table-hover">
                    <thead>
                        <tr>
                            <th>
                                BUYING RATE
                            </th>
                            <th>
                                SELLING RATE
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
        )
    }
});

module.exports = BuyingSellingRateModal;
