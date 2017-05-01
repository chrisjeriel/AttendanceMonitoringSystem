var React = require('react');

var TransactionContainer = require('../../../components/TransactionContainer');

var SeparatorComponent = require('../../../components/SeparatorComponent');

var TableComponent = require('../../../components/TableComponent');

var defaultData = require('../../../components/defaultData');

var UtilityUFMInquiry = React.createClass({

  getInitialState: function(){

     defaultData.storeUtilityInquiry();

     var data = store.get("utilityInquiry", null);
    // var listener = new window.keypress.Listener();

     return({
       tableData: data
     });
   },
   render: function() {

       return(
         <div className="col-md-8 col-md-offset-2">
         <TransactionContainer title='INQUIRY ON USERS PROFILE'>
           <TableComponent
              //  keyListener={this.state.keyListener}
               checkBox={true}
               column={["USER ID","USER NAME","DESIGNATION","LOGON STAT"]}
               data={this.state.tableData}
               ref="table"
               />
         </TransactionContainer>
         </div>
       )
   }
  });

module.exports = UtilityUFMInquiry
;
