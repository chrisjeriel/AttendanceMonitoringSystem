'use strict';

var React = require('react');
var defaultData = require('../../../components/defaultData');
var TableComponent = require('../../../components/TableComponent');
var TransactionContainer = require('../../../components/TransactionContainer');
var ModalContainer = require('../../../components/ModalContainer');


var InquiryIssuedTC = React.createClass({
    getInitialState: function(){
        defaultData.storeInquiryIssuedTC();

        var data = store.get("inIssuedtTC", null);
        // var listener = new window.keypress.Listener();

       return({tableData: data});
    },
    render: function() {
        return(
            <TransactionContainer>
                <ModalContainer className="mc_modal" title='Managers Checks'>
                    <TableComponent
                    //  keyListener={this.state.keyListener}
                        checkBox={true}
                        column={["Reference No.", "MC Serial No.", "PHP Amount", "Last Name"]}
                        data={this.state.tableData}
                        ref="table"/>
                </ModalContainer>
            </TransactionContainer>
        );
    }
});

module.exports = InquiryIssuedTC;
