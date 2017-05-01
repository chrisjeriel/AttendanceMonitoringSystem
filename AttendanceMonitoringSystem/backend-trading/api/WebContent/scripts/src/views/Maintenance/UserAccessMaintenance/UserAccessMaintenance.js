var React = require('react');
var DateComponent = require('../../../components/DateComponent');
var TimeComponent = require('../../../components/TimeComponent');
var ButtonComponent = require('../../../components/ButtonComponent');
var Table = require('../../../components/TableComponent');
var checkbox = require('../../../components/CheckboxComponent');
var THcomponent = require('../../../components/THcomponent');
var TDcomponent = require('../../../components/TDcomponent');


var UserAccessMaintenance = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	render: function() {
		return (
			<div className='app-border padding-content'>
				<div className='row'>
					<div className='col-xs-9'>
						<div className='row'>
							<div className='col-xs-8 col-xs-offset-1'>
								<div className='row'>
									<div className='col-xs-6'>
										<h5>Financial Institution</h5>
									</div>
									<div className='col-xs-6'>
										<select className='form-control'>
											<option>FXI - BPI FOREX</option>
										</select>
									</div>
								</div>
								<div className='row'>
									<div className='col-xs-6'>
										<h5>User Level</h5>
									</div>
									<div className='col-xs-6'>
										<select className='form-control'>
											<option>FOREX OFFICER</option>
										</select>
									</div>
								</div>
							</div>
							<div className='col-xs-2 userAccess'>
								<ButtonComponent ButtonClass='btn btn-default' ButtonName='Find' whenClicked={this.find} />
							</div>
						</div>
						<div className='row margin-top-left-20px'>
							<div className='col-xs-12 app-body-inner table-container'>
								<table className="table table-fixed table-hover table-bordered ">
									<thead>
		          						<tr>
		          							<THcomponent TitleClass='col-xs-1' TableTitle='Tag' />
		          							<THcomponent TitleClass='col-xs-11' TableTitle='Menu Item'/>
		          						</tr>
		          					</thead>
		          					<tbody>
		          						<tr>
		          							<TDcomponent ContentClass='col-xs-1' TableContent={<input type='checkbox' />} />
		          							<TDcomponent ContentClass='col-xs-11' TableContent='FX'/>
		          						</tr>  
		          						<tr>
		          							<TDcomponent ContentClass='col-xs-1' TableContent={<input type='checkbox' />} />
		          							<TDcomponent ContentClass='col-xs-11' TableContent='FX'/>
		          						</tr>
		          						<tr>
		          							<TDcomponent ContentClass='col-xs-1' TableContent={<input type='checkbox' />} />
		          							<TDcomponent ContentClass='col-xs-11' TableContent='FX'/>
		          						</tr>
		          						<tr>
		          							<TDcomponent ContentClass='col-xs-1' TableContent={<input type='checkbox' />} />
		          							<TDcomponent ContentClass='col-xs-11' TableContent='FX'/>
		          						</tr>
		          						<tr>
		          							<TDcomponent ContentClass='col-xs-1' TableContent={<input type='checkbox' />} />
		          							<TDcomponent ContentClass='col-xs-11' TableContent='FX'/>
		          						</tr>
		          						<tr>
		          							<TDcomponent ContentClass='col-xs-1' TableContent={<input type='checkbox' />} />
		          							<TDcomponent ContentClass='col-xs-11' TableContent='FX'/>
		          						</tr>
		          						<tr>
		          							<TDcomponent ContentClass='col-xs-1' TableContent={<input type='checkbox' />} />
		          							<TDcomponent ContentClass='col-xs-11' TableContent='FX'/>
		          						</tr>
		          						<tr>
		          							<TDcomponent ContentClass='col-xs-1' TableContent={<input type='checkbox' />} />
		          							<TDcomponent ContentClass='col-xs-11' TableContent='FX'/>
		          						</tr>
		          						<tr>
		          							<TDcomponent ContentClass='col-xs-1' TableContent={<input type='checkbox' />} />
		          							<TDcomponent ContentClass='col-xs-11' TableContent='FX'/>
		          						</tr>
		          						<tr>
		          							<TDcomponent ContentClass='col-xs-1' TableContent={<input type='checkbox' />} />
		          							<TDcomponent ContentClass='col-xs-11' TableContent='FX'/>
		          						</tr>
		          						<tr>
		          							<TDcomponent ContentClass='col-xs-1' TableContent={<input type='checkbox' />} />
		          							<TDcomponent ContentClass='col-xs-11' TableContent='FX'/>
		          						</tr>
		          						<tr>
		          							<TDcomponent ContentClass='col-xs-1' TableContent={<input type='checkbox' />} />
		          							<TDcomponent ContentClass='col-xs-11' TableContent='FX'/>
		          						</tr>
		          						<tr>
		          							<TDcomponent ContentClass='col-xs-1' TableContent={<input type='checkbox' />} />
		          							<TDcomponent ContentClass='col-xs-11' TableContent='FX'/>
		          						</tr>
		          						<tr>
		          							<TDcomponent ContentClass='col-xs-1' TableContent={<input type='checkbox' />} />
		          							<TDcomponent ContentClass='col-xs-11' TableContent='FX'/>
		          						</tr>
		          						<tr>
		          							<TDcomponent ContentClass='col-xs-1' TableContent={<input type='checkbox' />} />
		          							<TDcomponent ContentClass='col-xs-11' TableContent='FX'/>
		          						</tr>
		          						<tr>
		          							<TDcomponent ContentClass='col-xs-1' TableContent={<input type='checkbox' />} />
		          							<TDcomponent ContentClass='col-xs-11' TableContent='FX'/>
		          						</tr>        					
		          					</tbody>
								</table>
							</div>
						</div>
					</div>
					<div className='col-xs-3'>
						<div className="row">
							<div className='col-xs-12 align-right'>
								<h5>FXFRMACCS</h5>
								<h5>Form1</h5>
								<DateComponent />
								<TimeComponent />
							</div>
						</div>
						<div className='row'>
							<div className='col-xs-12'>
								<h5>Menu List</h5>
								<div className='radio'>
									<label><input type='radio' name='menu' />Trading Module</label>
								</div>
								<div className='radio'>
									<label><input type='radio' name='menu' />Transaction Module</label>
								</div>
							</div>
						</div>
						<div className='row userAccess'>
							<div className='col-xs-12 '>
								<ButtonComponent ButtonClass='btn btn-default' ButtonClass='btn btn-default' ButtonName='Tag All' whenClicked={this.TagAll} />
							</div>
							<div className='col-xs-12'>
								<ButtonComponent ButtonClass='btn btn-default' ButtonClass='btn btn-default' ButtonName='Untag All' whenClicked={this.UnTagAll} />
							</div>
							<div className='col-xs-12'>
								<ButtonComponent ButtonClass='btn btn-default' ButtonClass='btn btn-default' ButtonName='Add' whenClicked={this.Add} />
							</div>
							<div className='col-xs-12'>
								<ButtonComponent ButtonClass='btn btn-default' ButtonClass='btn btn-default' ButtonName='Modify' whenClicked={this.Modify} />
							</div>
							<div className='col-xs-12'>
								<ButtonComponent ButtonClass='btn btn-default' ButtonClass='btn btn-default' ButtonName='Delete' whenClicked={this.Delete} />
							</div>
							<div className='col-xs-12'>
								<ButtonComponent ButtonClass='btn btn-default' ButtonClass='btn btn-default' ButtonName='Refresh' whenClicked={this.Refresh} />
							</div>
							<div className='col-xs-12'>
								<ButtonComponent ButtonClass='btn btn-default' ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.Close} />
							</div>
						</div>
						<div className='row'>
							<div className='col-xs-12'>
								<h5>REMARKS</h5>
								<textarea className='textarea-design' />
							</div>
						</div>
					</div>
				</div>
			</div>
		)
	}

});


module.exports = UserAccessMaintenance;
