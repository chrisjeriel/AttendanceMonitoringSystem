var React = require('react');
var Link = require('react-router').Link;

var ButtonComponent = require('../../../../components/ButtonComponent');
var ViewFooter = require('../../../../components/ViewFooter');
var THcomponent = require('../../../../components/THcomponent');
var TDcomponent = require('../../../../components/TDcomponent');
var AppBody = require('../../../../components/AppBody');
var Auth = require('../../../../auth/Auth');
var TableComponent = require('../../../../components/TableComponent');
var Auth = require('../../../../auth/Auth');
var API = require('../../../../api');
var Process = require('./process');
var AppConstants = require('../../../../AppConstants');
var SystemResponse = require('../../../../components/SystemResponse');


var AcceptanceSettlementMode = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){
		return({
				data: null,
				mode_code: '',
				description: '',
				type: '',
				activeTag: '',
				phpTag: '',
				selected: 0
			});

	},
	componentDidMount:function(){
		this.loadTableData();
	},

	loadTableData:function(){
		
		API.maintenance_defsyscontrols.acceptance_settlement_list(
			null,
			function(data){
				if(data.meta.code == 200 || data.meta.code == 0){
					this.setState({data: data.data});
				}else{
					this.setState({
						data: [],
						process_mode: 'list',
						process_modal: <SystemResponse title="Error" content={AppConstants.ERROR_GETTING_LIST} close={this.closeProcessModal} />,
						table_component: <div text-align="center">NO DATA FOUND</div>
					});
				}
			}.bind(this),
			function(data){
				this.setState({
						data: [],
						process_mode: 'list', 	
						process_modal: 
						<SystemResponse title="Process" content={AppConstants.ERROR_CANNOT_CONNECT} close={this.closeProcessModal}/>,
						table_component: <div text-align="center">NO DATA FOUND</div>
				});
					
			}.bind(this)
		);
	},
	updateSelected: function(){
		var selected = $('tr.selected').index();

		this.setState({selected: selected});
	},
	Details: function(){
        // var selected = $('tr.selected').find('td:nth-child(4)').text();
  //       var selected = $('tr.selected').index();

		// this.setState({selected: selected});
		this.setState({
			process_mode: 'details',
			process_modal: <Process mode='details' data={this.state.data[this.state.selected]} close={this.closeProcessModal} />
		});
	},
	showProcessModal: function (process_mode) {
	  	var state = null;

		if(AppConstants.MOCK_DATA){
			var data = {
				MODE_CODE: this.state.mode_code,
				MODE_DESC: this.state.description,
				MCRO_TAG: this.state.type,
				ACTV_TAG: this.state.activeTag,
				PHP_TAG: this.state.phpTag
			}	
		}else{
			data = this.state.data[this.state.selected];
		}

		state = { process_mode: process_mode,
				process_modal: <Process mode={process_mode} data={data} close={this.closeProcessModal}/>
		};

		//add switch case for add edit delete

	  	this.setState(state);
	},
	closeProcessModal: function () {
	 	this.setState({process_mode: null});
	},
	Close:function(){
		this.context.router.push('menu');
	},
	render:function(){

		return(
			<div className='app-border'>
				{
						this.state.process_mode ?
							<div>
								{this.state.process_modal}
								<div className='overlay'></div>
							</div>
							: ''
				}
				<AppBody>
					{
						this.state.data != null ?
							<TableComponent
                                checkBox={false}
                                column={["PHP Tag", "Type", "Active Tag", "Code", "Description"]}
                                data={this.state.data}
                                visible={7}
                                ref="table"
                                onSelect={this.Details}
                                onMove={this.updateSelected}
                                />
                            : <div  > LOADING DATA... </div>
					}
					

				</AppBody>
				<ViewFooter>
					<div className='row'>
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Top' whenClicked={this.Top} />
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Next' whenClicked={this.Next} />
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Bottom' whenClicked={this.Bottom} />
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Details' whenClicked={this.showProcessModal.bind(this,'details')} />
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Add' whenClicked={this.showProcessModal.bind(this, 'add')} />
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Modify' whenClicked={this.showProcessModal.bind(this, 'modify')} />
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.Close} />
					</div>
				</ViewFooter>
			</div>
			);
	}

});


module.exports = AcceptanceSettlementMode;
