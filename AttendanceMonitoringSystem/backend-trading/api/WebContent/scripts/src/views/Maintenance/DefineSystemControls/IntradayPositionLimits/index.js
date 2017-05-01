var React = require('react');

var ButtonComponent = require('../../../../components/ButtonComponent');
var ViewFooter = require('../../../../components/ViewFooter');
var TableComponent = require('../../../../components/TableComponent');
var TDcomponent = require('../../../../components/TDcomponent');
var THcomponent	=require('../../../../components/THcomponent');
var AppBody = require('../../../../components/AppBody');
var Auth = require('../../../../auth/Auth');
var SystemResponse = require('../../../../components/SystemResponse');
var Process = require('./process');
var API = require('../../../../api');
var AppConstants = require('../../../../AppConstants');
var Util = require('../../../../util');
var References = require('../../../../References');
// var store = require('../../../../../store');


var IntradayPositionLimits = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){
		return ({
			data: null,
			displayData: null,
			referenceTable: null,
			disable: this.props.viewType,
			process_mode: null,
			selected: 0
		});
	},
	componentDidMount: function(){
		this.updateViewType(this.props);
		this.LoadReferenceTable();
		this.LoadData();
	},
	LoadReferenceTable: function(){
		References.loadTables(
			'0131',
			function(){
				console.log("reference table loaded");
			}.bind(this)
		);

	},
	componentWillReceiveProps: function(nextProps){
		this.updateViewType(nextProps);
	},
	closeProcessModal: function(){
		this.setState({process_mode: null});
	},
	getTrdrDesc: function(trdrFi){
		var list= store.get('0131');

		if(list){
			for(var i = 0; i < list.length; i ++){
				if(list[i]['trdrFi'] == trdrFi){
					return list[i]['trdrDesc'];
				}
			}			
		}

		return null;
	},
	ModifyArray: function(array){
		var newArray = [];
		for(var i=0; i<array.length; i++){
			var trdrDesc = this.getTrdrDesc(array[i].TRDR_FI);
			var intrLimit = Util.decimalNumber(array[i].INTR_LMIT);
			newArray.push({
				TRDR_FI: trdrDesc,
				INTR_LMIT: intrLimit
			});
		}

		this.setState({displayData: newArray});
	},
	LoadData: function(){

		API.maintenance_defsyscontrols.intraday_limits_list(
			null,
			function(data){
				if(data.meta.code == 200 || data.meta.code == 0){
					this.setState({data: data.data});
					this.ModifyArray(data.data);
				}else{	
					this.setState({
						process_mode: 'list',
						process_modal: <SystemResponse content={AppConstants.ERROR_GETTING_LIST} close={this.closeProcessModal} />
					});
				}
			}.bind(this),
			function(data){
				this.setState({
					process_mode: 'list',
					process_modal: <SystemResponse content={AppConstants.ERROR_CANNOT_CONNECT} close={this.closeProcessModal} />
				});
			}.bind(this)
		);
	},
	updateViewType: function(props){
		if(props.params.viewType == "view"){
			this.setState({
				disable: true
			});
		}else{
			this.setState({
				disable: false
			});
		}
	},
	updateSelected: function(){
		var selected = $('tr.selected').index();

		this.setState({selected: selected});
	},
	showProcessModal: function(process_mode){
		var selected = $('tr.selected').index();

		this.setState({
			process_mode: process_mode,
			process_modal: <Process mode={process_mode} data={this.state.data[selected]} displayData={this.state.displayData[selected]} mode={process_mode} close={this.closeProcessModal} />
		});
	},
	Close:function(){
		this.context.router.push('menu');
	},
	Refresh: function(){
		// this.forceUpdate();
		location.reload();
	},
	render:function(){
		return(
			<div className='app-border'>
				<AppBody>
					{
						this.state.displayData != null ?
							<TableComponent
		                        checkBox={false}
		                        column={["Trading Unit", "Intraday Limit"]}
		                        data={this.state.displayData}
		                        visible={7}
		                        ref="table"
		                        onSelect={this.Details}
		                        onMove={this.updateSelected}
		                        />
		                    : null
					}
				</AppBody>
				<ViewFooter>

					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Top' whenClicked={this.Top} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Next' whenClicked={this.Next} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Bottom' whenClicked={this.Bottom} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Add' whenClicked={this.showProcessModal.bind(this, 'add')} Disable={this.state.disable} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Modify' whenClicked={this.showProcessModal.bind(this, 'modify')} Disable={this.state.disable} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Delete' whenClicked={this.showProcessModal.bind(this, 'delete')} Disable={this.state.disable} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Refresh' whenClicked={this.Refresh} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.Close} />
				</ViewFooter>
				{
					this.state.process_mode != null?
						this.state.process_modal
						: null
				}
			</div>
		);
	}

});



module.exports = IntradayPositionLimits;