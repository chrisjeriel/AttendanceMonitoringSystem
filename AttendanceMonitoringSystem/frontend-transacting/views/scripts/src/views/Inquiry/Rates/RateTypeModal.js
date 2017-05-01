'use strict';

var React = require('react');
var ModalContainerTransparent = require('../../../components/ModalContainerTransparent');
var _ = require('lodash');

var RateTypeModal = React.createClass({
    getInitialState: function () {
        return {
            data: [
                {
                    id: 1,
                    name: 'USD / PHP',
                    tran_unit: 'BPI/BFB Branch'
                },
                {
                    id: 4,
                    name: '3RDS VS USD / PHP',
                    tran_unit: 'BPI/BFB Branch'
                },
                {
                    id: 6,
                    name: 'USD BID/OFFER/REFR RATES',
                    tran_unit: 'BPI/BFB Branch'
                }
            ]
        }
    },
    selectRateType: function (rate_type) {
        this.props.onSelect(rate_type);
    },
    render: function () {
        return (
            <ModalContainerTransparent title="Rate Type" className="rate_type_modal">
                <table className="table table-hover">
                    <tbody>
                        {
                            _(this.state.data).map(function (item) {
                                return (
                                    <tr key={item.id} onClick={this.selectRateType.bind(this, item)}>
                                        <td>
                                            {item.id}- ({item.name}) {item.tran_unit}
                                        </td>
                                    </tr>
                                );
                            }.bind(this)).value()
                        }
                    </tbody>
                </table>
            </ModalContainerTransparent>
        );
    }
});

module.exports = RateTypeModal;
