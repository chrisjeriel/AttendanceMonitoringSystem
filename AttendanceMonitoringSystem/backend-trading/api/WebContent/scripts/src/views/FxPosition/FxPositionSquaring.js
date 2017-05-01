var React = require('react');

 var AppBody = require('../../components/AppBody');
 var ViewFooter = require('../../components/ViewFooter');
var ButtonComponent = require('../../components/ButtonComponent');
var Auth = require('../../auth/Auth');

var FxPositionSquaring = React.createClass({
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
								<label>Unload Type: </label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Reference No.: </label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Transaction Type: </label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Bank Code: </label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Book: </label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Transaction Currency: </label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Counter Currency: </label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Transaction Amount: </label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Squaring Rate: </label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<input type="checkbox"/>Refresh FX Position
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

module.exports = FxPositionSquaring;
