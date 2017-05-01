'use strict';

var React = require('react');
var defaultData = require('../../../components/defaultData');
var TableComponent = require('../../../components/TableComponent');
var TransactionContainer = require('../../../components/TransactionContainer');
var ModalContainer = require('../../../components/ModalContainer');

var AcceptedTC = React.createClass({
    getInitialState: function(){
        defaultData.storeInquiryAcceptedTC();
        var data = store.get("inAcceptTC", null);
        // var listener = new window.keypress.Listener();
        return({tableData: data});
    },

    render: function() {
        return(
            <TransactionContainer>
                <ModalContainer className="tc_checks_modal" title='TC Checks'>
                    <TableComponent
                        //  keyListener={this.state.keyListener}
                        checkBox={true}
                        column={["Ref. No.", "Curr", "Serial No.", "Check Amount", "Total Amount"]}
                        data={this.state.tableData}
                        ref="table"/>
                </ModalContainer>
            </TransactionContainer>
        );
    }
  });


module.exports = AcceptedTC;
