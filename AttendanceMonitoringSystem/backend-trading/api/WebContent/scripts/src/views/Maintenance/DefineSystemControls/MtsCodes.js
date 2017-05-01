var React = require('react');

var AppBody = require('../../../components/AppBody');
var ViewFooter = require('../../../components/ViewFooter');
var ButtonComponent = require('../../../components/ButtonComponent');
var Auth = require('../../../auth/Auth');

var MtsCodes = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	render:function(){
		return(
			<div className='app-border'>
				<AppBody>
					<div className="row">
						<div className="col-sm-2">
							<input type="radio" value=""/>
							<label>All MTS Codes</label>
						</div>
						<div className="col-sm-2">
							<input type="radio" value=""/>
							<label>Per MTS Code</label>
						</div>
					</div>
					<div className='col-sm-12 app-body-inner'>
						<div className="row">
							<div className="col-sm-2">
								<input type="radio" value=""/>
								<label>Acceptance</label>
							</div>
							<div className="col-sm-2">
								<input type="radio" value=""/>
								<label>Settlement</label>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Mode: </label>
							</div>
							<div className="col-sm-1">
								<select>
									<option name=""></option>
								</select>
							</div>
							<div className="col-sm-4">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>MTS Code: </label>
							</div>
							<div className="col-sm-2">
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


var CBGFXMTSCodeFileMaintenanceBase = React.createClass({

	render:function(){
		return(
			<div className='app-border'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>MTS Code File Maintenance</h5>
						<h5>BPI BTSU</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className="row">
						<div className="col-sm-6">
							<label>&gt;&gt;&gt; {this.props.params.mode} MODE &lt;&lt;&lt;</label>
						</div>
					</div>
					<div className='col-sm-12 app-body-inner'>
						<div className="row">
							<div className="col-sm-2">
								<label>Mode Type: </label>
							</div>
							<div className="col-sm-4">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Mode Code: </label>
							</div>
							<div className="col-sm-4">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>MTS Code: </label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Description: </label>
							</div>
							<div className="col-sm-4">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-4">
								Press PROCESS button to ADD this record
							</div>
						</div>
					</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonName='Process' whenClicked={this.Process} />
					<ButtonComponent ButtonName='Close' whenClicked={this.Close} />
				</ViewFooter>
			</div>
			);
	}

});

module.exports = MtsCodes;