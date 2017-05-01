var React = require('react');

 var AppBody = require('../../../../components/AppBody');
 var ViewFooter = require('../../../../components/ViewFooter');
var ButtonComponent = require('../../../../components/ButtonComponent');
var Auth = require('../../../../auth/Auth');

var TieredRates = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	render:function(){
		return(
			<div className='app-border'>
				<AppBody>
					<div className='col-sm-12 app-body-inner'>
						<div className="row">
							<div className="col-sm-2">
								<label>Select Transacting Unit</label>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<input type="radio"/>BPI/BFP Branches
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<input type="radio"/>BPI Direct
							</div>
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

var TieredRatesSpreads = React.createClass({

	render:function(){
		return(
			<div className='app-border'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>{this.props.params.mode} Spreads per Tier</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className='col-sm-12 app-body-inner'>
						<div className="row">
							<div className="col-sm-2">
								<label>Transacting Unit: </label>
							</div>
							<div className="col-sm-4">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Tier No.: </label>
							</div>
							<div className="col-sm-1">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
							</div>
							<div className="col-sm-2">
								<label>CURRENT</label>
							</div>
							<div className="col-sm-2">
								<label>NEW</label>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>TIER RANGE</label>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Amount From: </label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Amount To: </label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>SPREAD</label>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Buying: </label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Selling: </label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Last Tier</label>
							</div>
							<div className="col-sm-2">
								<input type="checkbox"/>USD Buying
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
							</div>
							<div className="col-sm-2">
								<input type="checkbox"/>USD Selling
							</div>
						</div>
					</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent  ButtonClass='btn btn-default' ButtonName='Process' whenClicked={this.Process} />
					<ButtonComponent  ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.Close} />
				</ViewFooter>
			</div>
			);
	}

});

module.exports = TieredRates;