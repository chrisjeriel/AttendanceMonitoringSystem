'use strict';

var React = require('react');

var ButtonComponent = require('../../../../../components/ButtonComponent');
var THcomponent = require('../../../../../components/THcomponent');
var TDcomponent = require('../../../../../components/TDcomponent');
var AppHeader = require('../../../../../components/AppHeader');
var AppHeaderTitle = require('../../../../../components/AppHeaderTitle');
var AppBody = require('../../../../../components/AppBody');
var ViewFooter = require('../../../../../components/ViewFooter');
var Auth = require('../../../../../auth/Auth');
var Table = require('../../../../../components/TableComponent');
var API = require('../../../../../api');
var SystemResponse = require('../../../../../components/SystemResponse');

var BtsuInitializationBidList = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){
		return ({

		});
	},
	componentDidMount:function(){

	},
	loadData:function(){


	},

	processSuccess: function (res) {
		//need to connect this to table
	},

	processFail: function (xhr, err) {
		alert('Err: ' + err);
	},
	Details:function(event){
		// this.context.router.push('menu/trading_maintenance_process/list');
		console.log('list details');
		console.log(this.state.data);
		this.setState({
			process_enabled: true,
			process_modal: <Process mode="details" data={this.state.data} close={this.CloseProcessModal} />
		});
	},
	Close:function(){
		// this.context.router.push('menu/trading_maintenance_menu');
	},
	CloseProcessModal: function(){
		this.setState({process_enabled: false});
	},
	render:function(){
		return(
			<div className='app-border process_modal'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>View List of Trading Units</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className='row'>
						<div className='col-sm-8'>
							<Table>
		          					<thead>
		          						<tr>
		          							<THcomponent TitleClass='' TableTitle='Currency' />
		          							<THcomponent TitleClass='' TableTitle='Bid'/>
		          							<THcomponent TitleClass='' TableTitle='Offer'/>
		          							<THcomponent TitleClass='' TableTitle=''/>
		          						</tr>
		          					</thead>
		          					<tbody>
		          						<tr>
		          							<TDcomponent ContentClass='' TableContent='ATS'/>
		          							<TDcomponent ContentClass='' TableContent='11.42'/>
		          							<TDcomponent ContentClass='' TableContent='BPI FOREX CORP.'/>
		          							<TDcomponent ContentClass='' TableContent={<input type="checkbox" name="" value="" />} />
		          						</tr>
		          					</tbody>
		          			</Table>
		          		</div>
	          		</div>
				</AppBody>
				<ViewFooter>
					<div className='row'>
						<ButtonComponent ButtonName='Top' ButtonClass='btn btn-default' whenClicked={this.Top} />
						<ButtonComponent ButtonName='Next' ButtonClass='btn btn-default' whenClicked={this.Next}  />
						<ButtonComponent ButtonName='Bottom' ButtonClass='btn btn-default' whenClicked={this.Bottom} />
						<ButtonComponent ButtonName='Details' ButtonClass='btn btn-default' whenClicked={this.Details} />
						<ButtonComponent ButtonName='Close' ButtonClass='btn btn-default' whenClicked={this.props.close} />
					</div>
				</ViewFooter>
				{
					this.state.process_enabled ?
						this.state.process_modal
						: ''
				}
			</div>
			);
	}

});

module.exports = BtsuInitializationBidList;
