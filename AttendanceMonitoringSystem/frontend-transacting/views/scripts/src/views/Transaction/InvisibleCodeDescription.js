'use strict';

var React = require('react');
var TransactionContainer = require('../../components/TransactionContainer');
var SeparatorComponent = require('../../components/SeparatorComponent');
var TableComponent = require('../../components/TableComponent');
var defaultData = require('../../components/defaultData');


var InvisibleCodeDescription = React.createClass({
    getInitialState: function () {
        defaultData.storeInviCodes();
        var data = store.get("inviCodes", null);
        // var listener = new window.keypress.Listener();

        return({tableData: data});
    },
    render: function () {
        return(
            <div className="col-md-8 col-md-offset-2">
                <TransactionContainer title='Invisible Codes'>
                    <TableComponent
              //  keyListener={this.state.keyListener}
                        checkBox={true}
                        column={["Code - Description"]}
                        data={this.state.tableData}
                        ref="table" />
                </TransactionContainer>
            </div>
        );
    }
});


module.exports = InvisibleCodeDescription;
