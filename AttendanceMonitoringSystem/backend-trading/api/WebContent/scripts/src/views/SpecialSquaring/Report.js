var React = require('react');

var AppBody = require('../../components/AppBody');
var AppHeader = require('../../components/AppHeader');
var AppHeaderTitle = require('../../components/AppHeaderTitle');
var ViewFooter = require('../../components/ViewFooter');
var Navigation = require('../../components/NavigationMenu');
var Auth = require('../../auth/Auth');
var ButtonComponent = require('../../components/ButtonComponent');



var Report = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	render:function(){
		return(
			<div className='app-border'>
				<AppHeader formCode="FMFRMBTSURP" form="Form1">
				</AppHeader>
				<AppBody>
					<div className='col-sm-12 app-body-inner'>
						<form className='form-group'>
							<div className='row app-body-content'>
								<div className='row'>
									<div className="col-xs-12">
										 <div className='col-xs-6 align-right'>
										 	<label><h5>Deal with:</h5></label>
										 </div>
										 <div className='col-xs-6 align-left'>
										 	<div className='radio'>
										 		<label><input type='radio' name='DealWith'/>Spot Desk1</label>
										 	</div>
										 	<div className='radio'>
										 		<label><input type='radio' name='DealWith'/>Spot Desk2</label>
										 	</div>
										 </div>
									</div>
								</div>
							</div>
							<div className='row'>
								<div className="col-xs-12 padding-content">
									 <div className='col-xs-6 align-right'>
									 	<label><h5>Transaction Type:</h5></label>
									 </div>
									 <div className='col-xs-6 align-left'>
									 	<div className='radio'>
									 		<label><input type='radio' name='DealWith'/>Purchase</label>
									 	</div>
									 	<div className='radio'>
									 		<label><input type='radio' name='DealWith'/>Sale</label>
									 	</div>
									 </div>
								</div>
							</div>
						</form>
					</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Process" whenClicked={this.Process} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Close" whenClicked={this.Close} />
				</ViewFooter>
			</div>
		);
	}
});

module.exports = Report;
