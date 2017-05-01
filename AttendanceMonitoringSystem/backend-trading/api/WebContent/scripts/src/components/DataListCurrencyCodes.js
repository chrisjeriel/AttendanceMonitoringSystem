var React = require('react');

var DataListCurrencyCodes = React.createClass({
	render:function(){
		return(
			<table className="table table-fixed table-hover table-bordered">
          <thead>
            <tr>
              <th className="col-xs-2">Currency Code</th>
              <th className="col-xs-6">Description</th>
              <th className="col-xs-2">BPI Code</th>
              <th className="col-xs-2">CASA Code</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td className="col-xs-2">AUD</td>
              <td className="col-xs-6">AUSTRALIAN DOLLAR</td>
              <td className="col-xs-2">007</td>
              <td className="col-xs-2">20</td>
            </tr>
            <tr>
              <td className="col-xs-2">BHD</td>
              <td className="col-xs-6">BAHRAIN DINAR</td>
              <td className="col-xs-2">000</td>
              <td className="col-xs-2">-</td>
            </tr>
            <tr>
              <td className="col-xs-2">BND</td>
              <td className="col-xs-6">BRUNEI DOLLAR</td>
              <td className="col-xs-2">022</td>
              <td className="col-xs-2">30</td>
            </tr>
            <tr>
              <td className="col-xs-2">CAD</td>
              <td className="col-xs-6">CANADIAN DOLLAR</td>
              <td className="col-xs-2">011</td>
              <td className="col-xs-2">05</td>
            </tr>
            <tr>
              <td className="col-xs-2">CHF</td>
              <td className="col-xs-6">SWISS FRANC</td>
              <td className="col-xs-2">003</td>
              <td className="col-xs-2">01</td>
            </tr>
            <tr>
              <td className="col-xs-2">CNY</td>
              <td className="col-xs-6">CHINESE YUAN</td>
              <td className="col-xs-2">000</td>
              <td className="col-xs-2">-</td>
            </tr>
            <tr>
              <td className="col-xs-2">DKK</td>
              <td className="col-xs-6">DANISH KRONER</td>
              <td className="col-xs-2">020</td>
              <td className="col-xs-2">28</td>
            </tr>
            <tr>
              <td className="col-xs-2">EUR</td>
              <td className="col-xs-6">EUROPEAN UNION EURO</td>
              <td className="col-xs-2">070</td>
              <td className="col-xs-2">14</td>
            </tr>
            <tr>
              <td className="col-xs-2">GBP</td>
              <td className="col-xs-6">POUND STERLING</td>
              <td className="col-xs-2">005</td>
              <td className="col-xs-2">04</td>
            </tr>
            <tr>
              <td className="col-xs-2">HKD</td>
              <td className="col-xs-6">HONG KONG DOLLAR</td>
              <td className="col-xs-2">006</td>
              <td className="col-xs-2">06</td>
            </tr>
            <tr>
              <td className="col-xs-2">IDR</td>
              <td className="col-xs-6">INDONESIAN RUPIAH</td>
              <td className="col-xs-2">018</td>
              <td className="col-xs-2">26</td>
            </tr>
            <tr>
              <td className="col-xs-2">JPY</td>
              <td className="col-xs-6">JAPANESE YEN</td>
              <td className="col-xs-2">024</td>
              <td className="col-xs-2">03</td>
            </tr>
            <tr>
              <td className="col-xs-2">KRW</td>
              <td className="col-xs-6">KOREAN WON</td>
              <td className="col-xs-2">000</td>
              <td className="col-xs-2">-</td>
            </tr>
            <tr>
              <td className="col-xs-2">MYR</td>
              <td className="col-xs-6">MALAYSIAN RINGGIT</td>
              <td className="col-xs-2">016</td>
              <td className="col-xs-2">24</td>
            </tr>
            <tr>
              <td className="col-xs-2">NZD</td>
              <td className="col-xs-6">NEW ZEALAND DOLLAR</td>
              <td className="col-xs-2">013</td>
              <td className="col-xs-2">21</td>
            </tr>
            <tr>
              <td className="col-xs-2">PHP</td>
              <td className="col-xs-6">PHILIPPINES PESO</td>
              <td className="col-xs-2">001</td>
              <td className="col-xs-2">-</td>
            </tr>
            <tr>
              <td className="col-xs-2">SAR</td>
              <td className="col-xs-6">SAUDI ARABIAN RIYAL</td>
              <td className="col-xs-2">000</td>
              <td className="col-xs-2">-</td>
            </tr>
          </tbody>
        </table>

			);
	}
});
module.exports = DataListCurrencyCodes;