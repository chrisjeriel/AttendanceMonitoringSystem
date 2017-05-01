'use strict';

var React = require('react');

var TransactionContainer = require('../../../components/TransactionContainer');
var TextViewComponent = require('../../../components/TextViewComponent');

var SeparatorComponent = require('../../../components/SeparatorComponent');
var TimeComponent = require('../../../components/TimeComponent');
var DateComponent = require('../../../components/DateComponent');
var RefNoInputModal = require('../../../components/RefNoInputModal');

var Inquiry = React.createClass({
    contextTypes: {
        router: React.PropTypes.object
    },
    getInitialState: function () {
        var hash_data = window.location.hash.split('?')[0].split('/');

        return {
            show_ref_no_modal: true,
            transaction_type: hash_data[3], // purchase/sale
            category: this.props.params.category, // forex/btsu/tmu
            inquiry: this.props.params.inquiry // today/error
        }
    },
    componentWillReceiveProps: function () {
        this.setState(this.getInitialState());
    },
    submitRefNo: function (ref_no) {
        if (ref_no) {
            this.context.router.push('/main/inquiry/' + this.state.transaction_type + '/' + this.state.category + '/' + this.state.inquiry + '/' + ref_no);
        }

        this.setState({show_ref_no_modal: false});
    },
    render: function() {
        var title = this.state.category.toUpperCase() + ' ' + this.state.transaction_type.toUpperCase() + (this.state.inquiry === 'today' ? ' Today\'s Transactions' : ' Error Corrected Transactions');
        return (
            <TransactionContainer title={title + ' Inquiry'}>
                {
                    this.state.show_ref_no_modal ?
                        <RefNoInputModal submitRefNo={this.submitRefNo} title={title} />
                        : ''
                }
                <div className = 'table-scroll table-responsive table-fixed'>
                    <table className ="table  table-bordered table-hover">
                        <thead>
                            <tr>
                                <th><h5><b>REF NUMBER</b></h5></th>
                                <th><h5><b>CLIENT NAME</b></h5></th>
                                <th><h5><b>FROM</b></h5></th>
                                <th><h5><b>TO</b></h5></th>
                                <th><h5><b>TRAN AMOUNT</b></h5></th>
                                <th><h5><b>GRANT R</b></h5></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><h5>1P020000165</h5></td>
                                <td><h5>ABC CORP.</h5></td>
                                <td><h5>USD</h5></td>
                                <td><h5>PHP</h5></td>
                                <td><h5>650.00</h5></td>
                                <td><h5>56.0</h5></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </TransactionContainer>
        );
    }
});

module.exports = Inquiry;
