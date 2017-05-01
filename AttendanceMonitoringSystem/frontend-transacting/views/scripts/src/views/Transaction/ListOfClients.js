'use strict';

var React = require('react');
var TransactionContainer = require('../../components/TransactionContainer');
var TextViewComponent = require('../../components/TextViewComponent');
var SeparatorComponent = require('../../components/SeparatorComponent');


var ListOfClients = React.createClass({
    render: function() {
        return (
            <TransactionContainer className='list_of_clients' title='List of Clients'>
                <div className = 'table-scroll table-responsive'>
                    <table className ="table table-fixed table-bordered table-hover">
                        <thead>
                            <tr>
                                <th><h5><b>LAST</b></h5></th>
                                <th><h5><b>FIRST</b></h5></th>
                                <th><h5><b>Mname</b></h5></th>
                                <th><h5><b>Accum Amount</b></h5></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr onClick={this.props.selectClient.bind(null, {last: 'reyes', first: 'ed', middle: 'vargas'})}>
                                <td><h5>REYES</h5></td>
                                <td><h5>ED</h5></td>
                                <td><h5>VARGAS</h5></td>
                                <td><h5> </h5></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </TransactionContainer>
        );
    }
});

module.exports = ListOfClients;
