'use strict';
var React = require('react');

var AppBody = require('../../../components/AppBody');
var AppHeader = require('../../../components/AppHeader');
var AppHeaderTitle = require('../../../components/AppHeaderTitle');
var ViewFooter = require('../../../components/ViewFooter');
var ButtonComponent = require('../../../components/ButtonComponent');
var Auth = require('../../../auth/Auth');
var api = require('../../../api');



var CurrencyPairAcceptanceSettlementCombination = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	render:function(){
		return(
			<div className='app-border'>
				<AppBody>
					<Table>
          					<thead>
          						<tr>
          							<THcomponent TitleClass='' TableTitle='Record CTR' />
          							<THcomponent TitleClass='' TableTitle='Trading Unit'/>
          							<THcomponent TitleClass='' TableTitle='Transacting Unit'/>
          							<THcomponent TitleClass='' TableTitle='Txn Type'/>
          							<THcomponent TitleClass='' TableTitle='Curr_From'/>
          							<THcomponent TitleClass='' TableTitle='Curr_To'/>
          							<THcomponent TitleClass='' TableTitle='Acceptance Mode' />
          						</tr>
          					</thead>
          					<tbody>
          						<tr>
          							<TDcomponent ContentClass='' TableContent='1'/>
          							<TDcomponent ContentClass='' TableContent='BPI BTSU'/>
          							<TDcomponent ContentClass='' TableContent='BPI BRANCHES'/>
          							<TDcomponent ContentClass='' TableContent='P'/>
          							<TDcomponent ContentClass='' TableContent='AUD'/>
          							<TDcomponent ContentClass='' TableContent='PHP'/>
          							<TDcomponent ContentClass='' TableTitle='CIV FX' />
          						</tr>
          					</tbody>
          			</Table>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Top" whenClicked={this.Top} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Next" whenClicked={this.Next} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Bottom" whenClicked={this.Bottom} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Details" whenClicked={this.Details} />
					<Link to='/'><ButtonComponent myText="Close" whenClicked={this.Close} /></Link>
				</ViewFooter>
			</div>
			);
	}

});

var CurrencyPairAcceptanceSettlementMode = React.createClass({

	render:function(){
		return(
			<div className='app-border'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>
							Select List to View / Delete
							<br/>
							BPI BTSU
						</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className='col-sm-12 app-body-inner'>
						<div className="row">
							<div className="col-sm-2">
								<input type="radio" name="option" className="" value=""/>Overall<br/>
								<input type="radio" name="option" className="" value=""/>Detailed
							</div>
							<div className="col-sm-2">
								By:
								<select className="form-control">
									<option name="1">1</option>
								</select>
							</div>
							<div className="col-sm-3">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<br/>
						<div className="row">
							<div className="col-sm-2">
								<label>Transacting Unit: </label>
							</div>
							<div className="col-sm-2">
								<select className="form-control">
									<option name="bp">BP</option>
								</select>
							</div>
							<div className="col-sm-4">
								<input type="text" className="form-control"></input>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Currency From: </label>
							</div>
							<div className="col-sm-2">
								<select className="form-control">
									<option name=""></option>
								</select>
							</div>
							<div className="col-sm-1">
								<label>To: </label>
							</div>
							<div className="col-sm-2">
								<select className="form-control">
									<option name=""></option>
								</select>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Acceptance Mode: </label>
							</div>
							<div className="col-sm-2">
								<select className="form-control">
									<option name=""></option>
								</select>
							</div>
							<div className="col-sm-4">
								<input type="text" className="form-control"></input>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Settlement Mode</label>
							</div>
							<div className="col-sm-2">
								<select className="form-control">
									<option name=""></option>
								</select>
							</div>
							<div className="col-sm-4">
								<input type="text" className="form-control"></input>
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


module.exports = CurrencyPairAcceptanceSettlementMode;