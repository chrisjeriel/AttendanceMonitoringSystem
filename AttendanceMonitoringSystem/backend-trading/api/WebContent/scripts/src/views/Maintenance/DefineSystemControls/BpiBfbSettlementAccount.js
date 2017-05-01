var React = require('react');
var Link = require('react-router').Link;
var AppHeader = require('../../../components/AppHeader');
var AppHeaderTitle = require('../../../components/AppHeaderTitle');
 var AppBody = require('../../../components/AppBody');
var ViewFooter = require('../../../components/ViewFooter');
var ButtonComponent = require('../../../components/ButtonComponent');
var Auth = require('../../../auth/Auth');

var BpiBfbSettlementAccount = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	ListButton:function(){


	},
	AllCurrencies:function(){
		
	},
	PerCurrency:function(){

	},
	render:function(){
		return(
		<div className='app-border'>
				<AppBody>
						<div className='col-sm-12 app-body-inner'>
							<form className='form-group no-border-content'>
								<div className='row app-body-content'>
									<div className='row no-padding'>
										<div className='col-xs-12 col-sm-4 col-sm-offset-4 padding-content'>
											<div className='col-xs-6 no-padding'>
												<label className='radio-inline'><input className="" type="radio" onclick={this.AllCurrencies} name='transaction' placeholder="" />
											 	All Currencies</label>
											</div>
											 <div className='col-xs-6 no-padding'>
												<label className='radio-inline'><input className="" type="radio" onclick={this.PerCurrency} name='transaction' placeholder="" />
											 	Per Currency</label>
											 </div>
										</div>
									</div>
									<div className='row no-padding'>
										<div className='col-xs-12 col-sm-6 col-sm-offset-3 padding-content'>
											<div className='col-xs-12 a-center'>
												<label>Currency:</label>
												<select>
													<option></option>
												</select>
												<input className="" type="text" placeholder="" />
											</div>
										</div>
									</div>
								</div>
							</form>
						</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Add" whenClicked={this.Add} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Modify" whenClicked={this.Modify} />	
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Delete" whenClicked={this.Delete} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="List" whenClicked={this.List} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.CloseButton} />
				</ViewFooter>
			</div>
			);
	}

});

var BpiBfbSettlementAccountList = React.createClass({

	render:function(){
		return(
			<div className='app-border'>
				<AppBody>
					<Table>
          					<thead>
          						<tr>
          							<THcomponent TitleClass='' TableTitle='Currency' />
          							<THcomponent TitleClass='' TableTitle='BPI Settlement Account'/>
          							<THcomponent TitleClass='' TableTitle='BFB Settlement Account'/>
          							
          						</tr>
          					</thead>
          					<tbody>
          						<tr>
          							<TDcomponent ContentClass='' TableContent='AUD'/>
          							<TDcomponent ContentClass='' TableContent='AUD - AUSTRALIAN DOLLAR'/>
          							<TDcomponent ContentClass='' TableContent='0014-1070-45'/>
          							<TDcomponent ContentClass='' TableContent=' - -'/>
          						</tr>          					
          					</tbody>
          				</Table>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Top" whenClicked={this.Top} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Next" whenClicked={this.Next} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Bottom" whenClicked={this.Bottom} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Details" whenClicked={this.Details} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Close" whenClicked={this.Close} />
				</ViewFooter>
			</div>
			);
	}

});

var CBGFXCurrencySettlementAccountsRecord = React.createClass({

	render:function(){
		return(
			<div className='app-border'>
				<AppBody>
					<div>
						&gt;&gt;&gt; LIST SETTLEMENT ACCOUNT(S) PER CURRENCY &lt;&lt;&lt;
					</div>
					<div className='col-sm-12 app-body-inner'>
						<form className="form-group no-border-content">
							<div className="row">
								<div className="col-sm-1">
									<label>CURRENCY: </label>
								</div>
								<div className="col-sm-3">
									<input type="text" className="form-control" value=""/>
								</div>
							</div>
							<br/>
							<div className="row">
								<div className="col-sm-2">
									<label>BPI Settlement Account: </label>
								</div>
								<div className="col-sm-3">
									<input type="text" className="form-control" value=""/>
								</div>
							</div>
							<div className="row">
								<div className="col-sm-2">
									<label>BFB Settlement Account: </label>
								</div>
								<div className="col-sm-3">
									<input type="text" className="form-control" value=""/>
								</div>
							</div>
						</form>
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

module.exports = BpiBfbSettlementAccount;