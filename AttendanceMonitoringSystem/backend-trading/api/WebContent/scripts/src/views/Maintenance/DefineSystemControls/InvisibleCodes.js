var React = require('react');


var AppBody = require('../../../components/AppBody');
var ViewFooter = require('../../../components/ViewFooter');
var ButtonComponent = require('../../../components/ButtonComponent');
var Auth = require('../../../auth/Auth');

var InvisibleCodes = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	render:function(){
		return(
			<div className='app-border'>
				<AppBody>
					<div className='col-sm-12 app-body-inner'>
						<div className="row">
							<div className="col-sm-3">
								<input type="radio" value=""/>
								<label>All Invisible Codes</label>
							</div>
							<div className="col-sm-3">
								<input type="radio" value=""/>
								<label>Per Invisible Code</label>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Invisible Code: </label>
							</div>
							<div className="col-sm-3">
								<input type="text" className="form-control" value=""/>
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

var CBGFXInvisibleCodeFileMaintenanceBase = React.createClass({

	render:function(){
		return(
			<div className='app-border'>
				<AppHeader>
					<AppHeaderTitle>
						Invisible Code File Maintenance
						<br/>
						BPI BTSU
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className="row">
						<div className="col-sm-9">
							&gt;&gt;&gt; {this.props.params.mode} MODE &lt;&lt;&lt;
						</div>
					</div>
					<div className='col-sm-12 app-body-inner'>
						<div className="row">
							<div className="col-sm-2">
								<label>Invisible Code: </label>
							</div>
							<div className="col-sm-1">
								<input type="text" className="form-control" value=""/>
							</div>
							<div className="col-sm-2">
								<label>Transaction Code: </label>
							</div>
							<div className="col-sm-1">
								<input type="text" className="form-control" value=""/>
							</div>
							<div className="col-sm-2">
								<label>Form No.: </label>
							</div>
							<div className="col-sm-1">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Description: </label>
							</div>
							<div className="col-sm-7">
								<input type="text" className="form-control" value=""/>
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

module.exports = InvisibleCodes;