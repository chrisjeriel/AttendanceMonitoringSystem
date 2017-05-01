'use strict';

var React = require('react');
var TransactionContainer = require('../../../components/TransactionContainer');
var ModalContainer = require('../../../components/ModalContainer');


var InvisibleCodes = React.createClass({
    getInitialState: function () {
        var hash_data = window.location.hash.split('?')[0].split('/');

        return {category: hash_data[4]}
    },
    componentWillReceiveProps: function () {
        this.setState(this.getInitialState());
    },
    render: function() {
        return (
            <TransactionContainer>
                <ModalContainer className="z-index-0" title={this.state.category.toUpperCase()}>
                    <div className = 'table-scroll table-responsive table-fixed'>
                        <table className ="table  table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th><h5><b>CODE</b></h5></th>
                                    <th><h5><b>DESCRIPTION</b></h5></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td><h5>120201000</h5></td>
                                    <td><h5> LAND-BASED COMPENSATION</h5></td>
                                </tr>
                                <tr>
                                    <td><h5>120201000</h5></td>
                                    <td><h5>SEA-BASED COMPENSATION INCOME </h5></td>
                                </tr>
                                <tr>
                                    <td><h5>120201000</h5></td>
                                    <td><h5> FX AQUISITION FROM BANKS FOREX CORPORATION</h5></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </ModalContainer>
            </TransactionContainer>
        );
    }
});

module.exports = InvisibleCodes;
