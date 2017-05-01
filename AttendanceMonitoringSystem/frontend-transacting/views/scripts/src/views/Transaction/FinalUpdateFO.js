'use strict';

var React = require('react');
var Link = require('react-router').Link;
var TransactionContainer = require('../../components/TransactionContainer');
var RefNoInputModal = require ('../../components/RefNoInputModal');

var FinalUpdateCAS = React.createClass({
    contextTypes: {
        router: React.PropTypes.object
    },
    getInitialState: function () {
        var hash_data = window.location.hash.split('?')[0].split('/');

        return {
            show_ref_no_modal: true,
            transaction_type: hash_data[4],
            category: hash_data[3].replace('deal_', '')
        }
    },
    componentWillReceiveProps: function () {
        this.setState(this.getInitialState());
    },
    submitRefNo: function (ref_no) {
        if (ref_no) {
            this.context.router.push('/main/transaction/deal_' + this.state.category + '/' + this.state.transaction_type + '/final_update_fo/' + ref_no);
        }

        this.setState({show_ref_no_modal: false});
    },
    onClickRow: function (row_id) {
        this.context.router.push('/main/transaction/deal_' + this.state.category + '/' + this.state.transaction_type + '/final_update_fo/' + row_id);
    },
    render: function () {
        return (
            <TransactionContainer title={this.state.category.toUpperCase() + ' ' + this.state.transaction_type.toUpperCase() + ' FINAL UPDATE on FOREX Override'}>
                {
                    this.state.show_ref_no_modal ?
                        <RefNoInputModal submitRefNo={this.submitRefNo} title={this.state.category.toUpperCase() + ' ' + this.state.transaction_type.toUpperCase() + " FINAL UPDATE on Cash FOREX Override"}/>
                        : ''
                }
                <div className = 'table-scroll table-responsive table-fixed'>
                    <table className ="table  table-bordered table-hover">
                        <thead>
                            <tr>
                                <th><h5><b>REF NUMBER</b></h5></th>
                                <th><h5><b>STATUS</b></h5></th>
                                <th><h5><b>FROM</b></h5></th>
                                <th><h5><b>TO</b></h5></th>
                                <th><h5><b>TRAN AMOUNT</b></h5></th>
                                <th><h5><b>GRANT RATE</b></h5></th>
                                <th><h5><b>LAST N</b></h5></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr onClick={this.onClickRow.bind(this, 'insert_row_id_here')}>
                                <td><h5>BP1P3723720000315</h5></td>
                                <td><h5> </h5></td>
                                <td><h5>AUD</h5></td>
                                <td><h5>USD</h5></td>
                                <td><h5>500.00</h5></td>
                                <td><h5>0.7574</h5></td>
                                <td><h5>REYES</h5></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </TransactionContainer>
        );
    }
});

module.exports = FinalUpdateCAS;
