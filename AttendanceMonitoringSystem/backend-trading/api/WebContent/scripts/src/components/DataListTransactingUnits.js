var React = require('react');

var DataListTransactingUnits = React.createClass({
	render:function(){
		return(
			<table className="table table-fixed table-hover table-bordered">
          <thead>
            <tr>
              <th className="col-xs-3">Trading Unit Code</th>
              <th className="col-xs-6">Description</th>
              <th className="col-xs-3">Trading Unit Tag</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td className="col-xs-3">BD</td>
              <td className="col-xs-6">BPI DIRECT SAVINGS BANK</td>
              <td className="col-xs-3">NO</td>
            </tr>
          </tbody>
        </table>

			);
	}
});
module.exports = DataListTransactingUnits;