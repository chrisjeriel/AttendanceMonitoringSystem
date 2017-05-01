var React = require('react');

var DataListCutOffTimeTradingForRegularSquaring = React.createClass({
	render:function(){
		return(
			<table className="table table-fixed table-hover table-bordered">
          <thead>
            <tr>
              <th className="col-xs-8">Trading Unit</th>
              <th className="col-xs-4">Cutt-Off Time</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td className="col-xs-8">BRANCHES TREASURY SUPPORT UNIT</td>
              <td className="col-xs-4">05:30 P.M.</td>
            </tr>
          </tbody>
        </table>

			);
	}
});
module.exports = DataListCutOffTimeTradingForRegularSquaring;