'use strict';

var React = require('react');

var ButtonComponent = require('../../components/ButtonComponent');
var THcomponent = require('../../components/THcomponent');
var TDcomponent = require('../../components/TDcomponent');
var AppHeader = require('../../components/AppHeader');
var AppHeaderTitle = require('../../components/AppHeaderTitle');
var AppBody = require('../../components/AppBody');
var ViewFooter = require('../../components/ViewFooter');
var Auth = require('../../auth/Auth');
var TableComponent = require('../../components/TableComponent');
var API = require('../../api');
var SystemResponse = require('../../components/SystemResponse');
var _ = require('lodash');


var AttendanceList = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){
		return ({
			tableData : []
		});
	},
	Details: function() {
		console.log("Details");
	},

	componentDidMount:function(){
		var self = this;
		API.sys_ref.sysref_get(
            {
            	tCode: "Members"
            },
            function(data){
            	var tableData = [];

            	for (var i = 0; i < data.data.length; i++) {
            		tableData.push({
            			ID: data.data[i].id,
            			ID_NUMBER: data.data[i].idNumber,
            			LAST_NAME: data.data[i].lastName,
            			FIRST_NAME: data.data[i].firstName,
            			MIDDLE_NAME: data.data[i].middleName,
            			SEX: data.data[i].sex,
            			CIVIL_STATUS: data.data[i].civilStatus,
            			BLOOD_TYPE: data.data[i].bloodType
            		})
            	}

            	self.setState({tableData: tableData});
            }.bind(this),
            function(data){
                cosnole.log(data);
            }.bind(this)
       	);

       	console.log("LENGTH IS " + this.state.tableData.length);
	},
	loadData:function(){

	},

	Close:function(){
		this.context.router.push('menu');
	},

	render:function(){
		return(
			<div>
				<div className='app-border'>
					<AppHeader formCode=" " form=" ">
						<AppHeaderTitle>
							<h5>List of Attendance</h5>
						</AppHeaderTitle>
					</AppHeader>
					<AppBody>
						{
							this.state.tableData.length > 0 ?
							<TableComponent
	                                checkBox={false}
	                                column={["No.", "ID Number", "Last Name", "First Name", "Middle Name", "Sex", "Civil Status", "Blood Type"]}
	                                data={this.state.tableData}
	                                visible={this.state.tableData.length}
	                                ref="table"
	                                onSelect={this.Details}
	                                 />
							: ''						
						}
					</AppBody>
					<ViewFooter>
						<div className='row'>
							<ButtonComponent ButtonName='Top' ButtonClass='btn btn-default' whenClicked={this.Top} />
							<ButtonComponent ButtonName='Next' ButtonClass='btn btn-default' whenClicked={this.Next}  />
							<ButtonComponent ButtonName='Bottom' ButtonClass='btn btn-default' whenClicked={this.Bottom} />
							<ButtonComponent ButtonName='Details' ButtonClass='btn btn-default' whenClicked={this.props.Details} />
							<ButtonComponent ButtonName='Close' ButtonClass='btn btn-default' whenClicked={this.Close} />
						</div>
					</ViewFooter>
				</div>
			</div>
			);
	}

});

module.exports = AttendanceList;
