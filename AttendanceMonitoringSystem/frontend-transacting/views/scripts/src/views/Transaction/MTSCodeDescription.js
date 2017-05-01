'use strict';

var React = require('react');
var ModalContainer = require('../../components/ModalContainer');
var SeparatorComponent = require('../../components/SeparatorComponent');


var MTSCodeDescription = React.createClass({
    render: function () {
        return (
            <ModalContainer title = "MTS Codes">
                <div className = 'table-scroll table-responsive table-fixed'>
                    <table className ="table  table-bordered table-hover">
                        <thead>
                            <tr>
                                <th><h5><b>Code  - Description</b></h5></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr><td><h5>Z999 - ACCEPTANCE CIV FX</h5></td></tr>
                        </tbody>
                    </table>
                </div>
            </ModalContainer>
        );
    }
});

module.exports = MTSCodeDescription;
