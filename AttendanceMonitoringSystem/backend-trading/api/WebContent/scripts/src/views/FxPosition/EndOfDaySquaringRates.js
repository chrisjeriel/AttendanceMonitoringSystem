var React = require('react');

var AppBody = require('../../components/AppBody');
var AppHeader = require('../../components/AppHeader');
var AppHeaderTitle = require('../../components/AppHeaderTitle');
var ViewFooter = require('../../components/ViewFooter');
var ButtonComponent = require('../../components/ButtonComponent');
var Auth = require('../../auth/Auth');

var EndOfDaySquaringRate = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	render:function(){
		return(
			<div className='app-border'>
				<AppHeader formCode="FXFRMPRATE" form="Form1">
					<AppHeaderTitle>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className='col-sm-8 app-body-inner'>
						<div className="app-body-inner-content">
							<div className="row">
								<div className="col-sm-12">
									<h5><i>Please Select Trading Unit</i></h5>
								</div>
							</div>
							<div className="row">
								<div className="col-sm-12">
									<select className="form-control" id="tradUnit">
										<option value="">Branches Treasury Support</option>
									</select>
								</div>
							</div>
							<div className="row">
								<div className="col-sm-12">
									<label className="checkbox-inline">
										<input type="checkbox" /> Lock Rates
									</label>
								</div>
							</div>
						</div>
					</div>
					<div className="col-sm-3 app-body-side">
						<div className="row">
							<div className="col-sm-12">
								<div className="row">
									<div className="col-sm-12">
										<ButtonComponent ButtonClass='btn btn-default' ButtonName='View Rate Sheet' />
									</div>
								</div>
								<div className="row">
									<div className="col-sm-12">
										<ButtonComponent ButtonClass='btn btn-default' ButtonName='Unlock Rates' />
									</div>
								</div>
								<div className="row">
									<div className="col-sm-12">
										<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close Rate Sheet' />
									</div>
								</div>
							</div>
						</div>
					</div>
				</AppBody>
			</div>
		);
	}
});

module.exports = EndOfDaySquaringRate;
