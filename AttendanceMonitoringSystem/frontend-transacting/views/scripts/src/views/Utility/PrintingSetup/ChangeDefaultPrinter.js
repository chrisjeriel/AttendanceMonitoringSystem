'use strict';

var React = require('react');
var PrintViewContainer = require('../../../components/PrintViewContainer');

var ChangeDefaultPrinter = React.createClass({

render: function() {
    return(
      <PrintViewContainer title = 'PRINTING SETUP'>

      <div className=" cdprinter col-md-4">
        <h5>Change Default Printer</h5>
      </div>


    <br /><br /><br /><br /><br />

    <div className="row ">

      <div className=" move col-md-2">
        <h5>Printer: </h5>
      </div>

        <div className="col-md-8">
          <input className="form-control" type="text"
            placeholder="Press <enter> to display the list of available printers"  />
        </div>
        <br /><br /><br /><br /><br /><br /><br /><br /><br /><br />

      </div>

      <div className="movenote col-md-8">

        <h5><b>NOTE:</b> Please check first 'Printer and Faxes' for <br />the installed printer(s) before selecting one.<br />
        To open Printer and Faxes, click Start,<br />click Control Panel, and then double-click <br />Printers and Faxes.</h5>

      </div>

      </PrintViewContainer>



    )
  }
});

module.exports = ChangeDefaultPrinter;
