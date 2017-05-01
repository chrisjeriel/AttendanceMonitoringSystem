var React = require('react');

var AppBody = require('../../components/AppBody');
var AppHeader = require('../../components/AppHeader');
var AppHeaderTitle = require('../../components/AppHeaderTitle');
var ViewFooter = require('../../components/ViewFooter');
var Navigation = require('../../components/NavigationMenu');
var ButtonComponent = require('../../components/ButtonComponent');
var Auth = require('../../auth/Auth');
var THcomponent = require('../../components/THcomponent');
var TDcomponent = require('../../components/TDcomponent');
var Table = require('../../components/TableComponent');
var api = require('../../api');
var interbankFileDetails = require ('./DefineInterbankFile/details');

var DefineInterbankFile = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	Display: function(){
	    alert("YO");
	    var params = {"bankCode" : "HSBC MANIL"};
        var result = api.interbank.Display(params, function(data){
            console.log(data);
            if(data.meta.code == 200 || data.meta.code == 0){
                this.setState({
                    process_mode: "details",
                    process_modal: <InterbankFileDetails title="View Interbank Record" close={this.closeProcessModal} />
                });
            }
        });


	},
	render:function(){
		return(
			<div className='app-border'>
        <AppHeader/>
				<AppBody>
						<div className='col-sm-12 app-body-inner'>
							<form className='form-group no-border-content'>
								<div className='row app-body-content'>
									<div className='row'>
										<div className='col-xs-12 col-sm-6 col-sm-offset-3'>
											<div className='col-xs-12'>
												<label><h5>Please Enter Bank ID:</h5></label>
											</div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-6 col-sm-offset-3'>
											<div className='col-xs-4'>
												<label htmlFor="bankCode"><h5>Bank Code:</h5></label>
											</div>
											 <div className='col-xs-8'>
											 	<input type='text' className="form-control" id="bankCode"  />
											 </div>
										</div>
									</div>
								</div>
							</form>
						</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonName="Add" ButtonClass="btn btn-default" whenClicked={this.Add} Disable='true' />
					<ButtonComponent ButtonName="Modify" ButtonClass="btn btn-default" whenClicked={this.Modify} Disable='true' />
					<ButtonComponent ButtonName="Delete" ButtonClass="btn btn-default" whenClicked={this.Delete} Disable='true' />
					<ButtonComponent ButtonName="Display" ButtonClass="btn btn-default" whenClicked={this.Display} />
					<ButtonComponent ButtonName="Print" ButtonClass="btn btn-default" whenClicked={this.Print} />
					<ButtonComponent ButtonName="Close" ButtonClass="btn btn-default" whenClicked={this.Close} />
				</ViewFooter>
			</div>
		);
	}
});

var DefineInterbankFileList = React.createClass({
	render:function(){
		return(
			<div className='app-border'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>List of Interbank File</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<Table>
  					<thead>
  						<tr>
  							<THcomponent TitleClass='' TableTitle='Bank Code' />
  							<THcomponent TitleClass='' TableTitle='Counter Party'/>
  							<THcomponent TitleClass='' TableTitle='Bank Name'/>
  							<THcomponent TitleClass='' TableTitle='Address 1'/>
  							<THcomponent TitleClass='' TableTitle='Address 2'/>
  							<THcomponent TitleClass='' TableTitle='Uknown'/>
  						</tr>
  					</thead>
  					<tbody>
  						<tr>
  							<TDcomponent ContentClass='' TableContent='HSBC MNL'/>
  							<TDcomponent ContentClass='' TableContent='HSBC BANK MANILA'/>
  							<TDcomponent ContentClass='' TableContent='HSBC BANK MANILA'/>
  							<TDcomponent ContentClass='' TableContent='THE ENTERPRISE CENTER'/>
  							<TDcomponent ContentClass='' TableContent='AYALA AVE COR PASEO DE ROXAS'/>
  							<TDcomponent ContentClass='' TableContent='Uknown'/>
  						</tr>
  					</tbody>
    			</Table>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Top" whenClicked={this.Top} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Next" whenClicked={this.Next} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Bottom" whenClicked={this.Bottom} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Details" whenClicked={this.Details} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Refresh" whenClicked={this.Print} />
					<ButtonComponent  ButtonClass='btn btn-default' ButtonName="Close" whenClicked={this.Close} />
				</ViewFooter>
			</div>
		);
	}
});

var DefineInterbankFileDetails = React.createClass({
	render:function(){
		return(
			<div className='app-border'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>View Interbank Record</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
						<div className='col-sm-12 app-body-inner'>
							<form className='form-group no-border-content'>
								<div className='row app-body-content'>
									<div className='row'>
										<div className='col-xs-12 col-sm-10 col-sm-offset-1'>
											<div className='col-xs-4 align-right'>
												<label><h5>Bank Code:</h5></label>
												</div>
											 <div className='col-xs-8'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<hr />
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Counter Party:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Bank Name:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Address:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5'>

											</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Contact Person:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Receiving Account No:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Other Instructions:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
								</div>
							</form>
						</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Process" whenClicked={this.Process} Disable='false' />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Close" whenClicked={this.Close} />
				</ViewFooter>
			</div>
		);
	}
});

module.exports = DefineInterbankFile;
