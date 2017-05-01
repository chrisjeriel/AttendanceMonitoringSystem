var React = require('react');

var ButtonComponent = require('../../../components/ButtonComponent');
var THcomponent = require('../../../components/THcomponent');
var TDcomponent = require('../../../components/TDcomponent');
var AppHeader = require('../../../components/AppHeader');
var AppHeaderTitle = require('../../../components/AppHeaderTitle');
var AppBody = require('../../../components/AppBody');
var ViewFooter = require('../../../components/ViewFooter');
var ButtonComponent = require('../../../components/ButtonComponent');
var Auth = require('../../../auth/Auth');
var Table = require('../../../components/TableComponent');
var API = require('../../../api');
var Details = require('./details');

var DefineInterbankFileList = React.createClass({
	contextTypes: {
		router: React.PropTypes.object,
	},
	getInitialState: function(){
		return ({
			process_mode: false
		});
	},
	getId: function(element) {
		console.log(element.rowIndex);
	},
	showProcessModal: function (process_mode) {
	  var state = null;
			console.log("showProcessModal:"+process_mode);
			if(process_mode == 'details')
			{
			 	state = { 	process_mode: true,
							process_modal: 
								<div>
									<Details mode={process_mode} close={this.closeProcessModal}/>
									<div className="overlay" />
								</div>
				};
			}
			else if(this.state.transacting_code === "")
			{
			 	state = { 	process_mode: true,
							process_modal: <SystemResponse title="Process" content="Input Incomplete" close={this.closeProcessModal}/>
				};
			} 
			else
			{
				var trading_data = this.state.process_data;
				state = { 	process_mode: true,
							process_modal: 
								<div>
									<Process mode={process_mode} data={this.state.data} close={this.closeProcessModal}/>
									<div className="overlay" />
								</div>
				};
			}
	  //add switch case for add edit delete

	  this.setState(state);
	},
	closeProcessModal: function () {
	  this.setState({process_mode: false});
	},
	render:function(){
		return(
			<div className='app-border process_modal'>
			{
				this.state.process_mode ?
					this.state.process_modal
					: ''
			}  
				<AppHeader>
					<AppHeaderTitle>
						<h5>List of Interbank File</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<Table>
  					<thead>
  						<tr onClick={this.getId}>
  							<THcomponent TitleClass='' TableTitle='Bank Code' />
  							<THcomponent TitleClass='' TableTitle='Counter Party'/>
  							<THcomponent TitleClass='' TableTitle='Bank Name'/>
  							<THcomponent TitleClass='' TableTitle='Address 1'/>
  							<THcomponent TitleClass='' TableTitle='Address 2'/>
  							<THcomponent TitleClass='' TableTitle='Uknown'/>
  						</tr>
  					</thead>
  					<tbody>
  						<tr onClick={this.getId}>
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
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Details" whenClicked={this.props.details} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Refresh" whenClicked={this.Print} />
					<ButtonComponent  ButtonClass='btn btn-default' ButtonName="Close" whenClicked={this.props.close} />
				</ViewFooter>
			</div>
		);
	}
});

module.exports = DefineInterbankFileList;
