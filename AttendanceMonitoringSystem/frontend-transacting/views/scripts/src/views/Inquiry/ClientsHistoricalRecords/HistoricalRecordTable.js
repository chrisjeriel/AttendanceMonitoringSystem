'use strict';

var React = require('react');
var Link = require('react-router').Link;
var TransactionContainer = require('../../../components/TransactionContainer');


var HistoricalRecordTable = React.createClass({
    contextTypes: {
        router: React.PropTypes.object
    },
    getInitialState: function () {
        var hash_data = window.location.hash.split('?')[0].split('/');

        return {
            transaction_type: hash_data[4]
        }
    },
    componentWillReceiveProps: function () {
        this.setState(this.getInitialState());
    },
    componentDidMount: function () {
        console.log('componentDidMount', this.props.input_data);
        // request the data here
        // input_data.inquiry_field and input_data.value
    },
    showDetails: function (data) {
        console.log(data);
        this.context.router.push('/main/inquiry/client_historical_records/' + this.state.transaction_type + '/' + data);
    },
    render: function() {
        return (
            <TransactionContainer className="chr_table" title={'CLIENT ' + this.state.transaction_type.toUpperCase() + ' HISTORICAL RECORD'}>
                <div className = 'table-scroll table-responsive table-fixed'>
                    <table className ="table  table-bordered table-hover">
                        <thead>
                            <tr>
                                <th><h5><b>LAST NAME</b></h5></th>
                                <th><h5><b>FIRST NAME</b></h5></th>
                                <th><h5><b>MIDDLE NAME</b></h5></th>
                                <th><h5><b>Accum Am</b></h5></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr onClick={this.showDetails.bind(this, 'insert_row_id_here')}>
                                <td><h5>CRUZ</h5></td>
                                <td><h5>EDITA</h5></td>
                                <td><h5>SANTOS</h5></td>
                                <td><h5> </h5></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </TransactionContainer>
        );
    }
});

module.exports = HistoricalRecordTable;
