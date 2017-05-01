'use strict';

var React = require('react');
var ModalContainer = require('../../components/ModalContainer');
var SeparatorComponent = require('../../components/SeparatorComponent');


var AcceptanceSettlementModeCodes = React.createClass({
    render: function () {
        return (
            <ModalContainer title = "Acceptance/Settlement Mode Codes">
                <div className = 'table-scroll table-responsive table-fixed'>
                    <table className ="table  table-bordered table-hover">
                        <thead>
                            <tr>
                                <th><h5><b>
                                    ACCEPTANCE / SETTLEMENT
                                </b></h5></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><h5>BPI SAFX/CIV FX</h5></td>
                            </tr>
                            <tr>
                                <td><h5>BPI SAFX/BPI SAFX</h5></td>
                            </tr>
                            <tr>
                                <td><h5>CIV FX/CIV FX</h5></td>
                            </tr>
                            <tr>
                                <td><h5>CIV FX/BPI SAFX</h5></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </ModalContainer>
        );
    }
});

module.exports = AcceptanceSettlementModeCodes;
