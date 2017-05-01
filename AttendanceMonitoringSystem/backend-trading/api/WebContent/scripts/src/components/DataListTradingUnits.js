var React = require('react');

var DataListTradingUnits = React.createClass({
	render:function(){
		return(
			<table className="table table-fixed table-hover table-bordered">
          <thead>
            <tr>
              <th className="col-xs-2">Trading Unit Code</th>
              <th className="col-xs-2">Transacting Unit Code</th>
              <th className="col-xs-4">Description</th>
              <th className="col-xs-2">Office Code</th>
              <th className="col-xs-2">Force Unload</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td className="col-xs-2">1</td>
              <td className="col-xs-2">FX</td>
              <td className="col-xs-4">BPI FOREX CORP.</td>
              <td className="col-xs-2">99-07-500</td>
              <td className="col-xs-2">N</td>
            </tr>
          </tbody>
        </table>

			);
	}
});
module.exports = DataListTradingUnits;
