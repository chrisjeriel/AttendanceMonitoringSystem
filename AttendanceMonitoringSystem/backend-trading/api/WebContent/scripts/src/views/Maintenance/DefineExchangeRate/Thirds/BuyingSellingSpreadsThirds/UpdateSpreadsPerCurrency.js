var React = require('react');

 var AppBody = require('../../../../../components/AppBody');
 var ViewFooter = require('../../../../../components/ViewFooter');
var ButtonComponent = require('../../../../../components/ButtonComponent');
var Auth = require('../../../../../auth/Auth');
var AppHeader = require('../../../../../components/AppHeader');

var UpdateSpreadsPerCurrency = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	render:function(){
		return(
			<div className='app-border'>
				<AppHeader formCode="FXFRMEXRT03" form="Form2">
				</AppHeader>
				<AppBody>
					<div className='col-sm-12 app-body-inner'>
						<div className="row">
							<div className='col-xs-6 align-right'>
								<h6><strong><i>Rate Spreads for</i></strong></h6>
							</div>
							<div className='col-xs-6 align-left'>
								<div className="row">
									<div className='col-xs-4'>
										<select className="form-control col-xs-3">
											<option name="">EUR</option>
										</select>
									</div>
								</div>
							</div>	
						</div>
						<hr />
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
							<div className="col-sm-2 align-right">
								<label>Currency Type: </label>
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
							</div>
							<div className="col-sm-4">
								<a href="#">Click here to Change Currency Type</a>
							</div>
						</div>
						<div className="row">
							<div>
								<h6><strong><i>Currency vs PHP</i></strong></h6>
							</div>
						</div>
						<hr />
						<div className="row">
							<div className="col-sm-2 align-right">
								<label>Notes Buying: </label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2 align-right">
								<label>DD-TT Buying: </label>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2 align-right">
								<label>Selling: </label>
							</div>
						</div>
						<div className="row">
							<div>
								<h6><strong><i>Currency vs USD</i></strong></h6>
							</div>
						</div>
						<hr />
						<div className="row">
							<div className="col-sm-2 align-right">
								<label>FCDU Buying: </label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2 align-right">
								<label>FCDU Selling: </label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
					</div>
				</AppBody>
				<ViewFooter>
					<div className="align-right">
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Accept' whenClicked={this.Accept} /> &nbsp;
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.Close} />
					</div>
				</ViewFooter>
			</div>
			);
	}

});

module.exports = UpdateSpreadsPerCurrency;