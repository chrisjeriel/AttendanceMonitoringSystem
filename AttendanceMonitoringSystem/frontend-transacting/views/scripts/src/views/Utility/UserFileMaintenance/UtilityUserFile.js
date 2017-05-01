var React = require('react');

var ModalContainer = require('../../../components/ModalContainer');

var SeparatorComponent = require('../../../components/SeparatorComponent');

var UtilityUserFile = React.createClass({



render: function() {
    return(
<ModalContainer title = "USER FILE MAINTENANCE">

<div className = "row">
<div className="col-md-offset-1 col-md-3">
  <label>OFFICERS CODE:</label>
</div>

<div className="col-md-6">
  <input className="form-control"
    type="text"
    placeholder="USER ID"
    maxLength='8'
    ref='officeCode'
    onChange={this.updateOfficeCode} />
</div>
</div>

<br />

<div className = "row">
<div className="col-md-offset-1 col-md-3">
  <label>USER ID:</label>
</div>

<div className="col-md-6">
  <input className="form-control"
    type="password"
    placeholder="PASSWORD"
    maxLength='8'
    ref='officeCode'
    onChange={this.updateOfficeCode} />
</div>
</div>







</ModalContainer>



    )
  }
});

module.exports = UtilityUserFile
;
