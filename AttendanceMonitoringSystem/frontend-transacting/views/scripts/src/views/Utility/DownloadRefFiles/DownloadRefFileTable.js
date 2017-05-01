'use strict';

var React = require('react');
var TransactionContainer = require('../../../components/TransactionContainer');
var defaultData = require('../../../components/defaultData');
var TableComponent = require('../../../components/TableComponent');
var DateComponent = require('../../../components/DateComponent');
var TimeComponent = require('../../../components/TimeComponent');


var DownloadRefFileTable = React.createClass({

    getInitialState: function(){
        defaultData.storeDownloadRefFiles();

        var data = store.get("dlRefFiles", null);
        // var listener = new window.keypress.Listener();

        return({tableData: data});
   },
   render: function() {

       return(
            <div className="col-md-8 col-md-offset-2">
                <TransactionContainer title='DOWNLOAD REFERENCE FILES'>
                    <TableComponent
              //  keyListener={this.state.keyListener}
                        checkBox={true}
                        column={["TAG","STATUS","DATE","TIME","DESCRIPTION"]}
                        data={this.state.tableData}
                        ref="table" />
                </TransactionContainer>
            </div>
        );
   }
 });

module.exports = DownloadRefFileTable;
