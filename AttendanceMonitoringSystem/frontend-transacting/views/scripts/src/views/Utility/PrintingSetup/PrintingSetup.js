'use strict';

var React = require('react');
var PrintViewContainer = require('../../../components/PrintViewContainer');

var PrintingSetup = React.createClass({



render: function() {
    return(



    <PrintViewContainer title = 'PRINTING SETUP'>


    <br /><br /><br /><br /><br />

    <div className="row ">

      <div className=" move col-md-2">
        <label>Printer:</label>
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

module.exports = PrintingSetup;
