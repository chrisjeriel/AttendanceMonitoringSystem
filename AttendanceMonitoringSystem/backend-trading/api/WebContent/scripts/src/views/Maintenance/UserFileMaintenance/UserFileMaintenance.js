var React = require('react');

 var AppBody = require('../../../components/AppBody');
 var ViewFooter = require('../../../components/ViewFooter');
var ButtonComponent = require('../../../components/ButtonComponent');
var Auth = require('../../../auth/Auth');

var UserFileMaintenance = React.createClass({
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
								<label>Financial Institution</label>
							</div>
							<div className="col-sm-3">
								<select className="form-control">
									<option name="">BPI BTSU</option>
								</select>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Office Code</label>
							</div>
							<div className="col-sm-3">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>User ID</label>
							</div>
							<div className="col-sm-1">
								<input type="text" className="form-control" value=""/>
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

var UserFileMaintenanceProcess = React.createClass({

	render:function(){
		return(
			<div className='app-border'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>{this.props.params.mode} User Record</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className="row">
						<div className="col-sm-1">
							<label>Financial Institution</label>
						</div>
						<div className="col-sm-1">
							<input type="text" className="form-control" value=""/>
						</div>
						<div className="col-sm-4">
							<input type="text" className="form-control" value=""/>
						</div>
					</div>
					<div className="row">
						<div className="col-sm-1">
							<label>Office Code</label>
						</div>
						<div className="col-sm-2">
							<input type="text" className="form-control" value=""/>
						</div>
					</div>
					<div className="row">
						<div className="col-sm-1">
							<label>Branch Name</label>
						</div>
						<div className="col-sm-5">
							<input type="text" className="form-control" value=""/>
						</div>
					</div>
					<div className='col-sm-12 app-body-inner'>
						<div className="row">
							<div className="col-sm-1">
								<label>User ID</label>
							</div>
							<div className="col-sm-1">
								<input type="text" className="form-control" value=""/>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>USER NAME</label>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Last Name</label>
							</div>	
						</div>
						<div className="row">
							<div className="col-sm-5">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>First Name</label>
							</div>	
						</div>
						<div className="row">
							<div className="col-sm-5">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Middle Name</label>
							</div>	
						</div>
						<div className="row">
							<div className="col-sm-5">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>User Level</label>
							</div>	
						</div>
						<div className="row">
							<div className="col-sm-4">
								<select>
									<option name="">BTSU TRADER</option>
								</select>
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


module.exports = UserFileMaintenance;