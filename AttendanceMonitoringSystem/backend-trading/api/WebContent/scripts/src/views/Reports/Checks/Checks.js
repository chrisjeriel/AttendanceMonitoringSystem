var React = require('react');

 var AppBody = require('../../../components/AppBody');
 var ViewFooter = require('../../../components/ViewFooter');
var ButtonComponent = require('../../../components/ButtonComponent');
var Auth = require('../../../auth/Auth');

var Checks = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	render:function(){
		return(
			<div className='app-border'>
				<AppBody>
					<div className='col-sm-12 app-body-inner'>
						<div className="row">
							<label>CHECK TRANSACTIONS</label>
						</div>
						<div className="row">
							<input type="radio"/>
							<label>Travellers Check</label>
						</div>
					</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Process' whenClicked={this.Process} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.Close} />
				</ViewFooter>
			</div>
			);
	}

});

module.exports = Checks;