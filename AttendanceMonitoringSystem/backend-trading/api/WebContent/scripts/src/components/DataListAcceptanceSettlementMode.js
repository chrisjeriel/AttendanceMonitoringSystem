var React = require('react');

var DataListAcceptanceSettlementMode = React.createClass({
	render:function(){
		return(
			<table className="table table-fixed table-hover table-bordered">
          <thead>
            <tr>
              <th className="col-xs-2">Code</th>
              <th className="col-xs-2">Description</th>
              <th className="col-xs-4">Type</th>
              <th className="col-xs-2">Active Tag</th>
              <th className="col-xs-2">PHP Tag</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td className="col-xs-2">1</td>
              <td className="col-xs-2">CIV PHP</td>
              <td className="col-xs-4">1-CASH</td>
              <td className="col-xs-2">Y</td>
              <td className="col-xs-2">Y</td>
            </tr>
          </tbody>
        </table>

			);
	}
});
module.exports = DataListAcceptanceSettlementMode;