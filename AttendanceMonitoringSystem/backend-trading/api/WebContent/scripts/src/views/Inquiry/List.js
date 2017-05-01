'use strict';

var React = require('react');
var ReactDOM = require('react-dom');
var MuiThemeProvider = require('material-ui/styles/MuiThemeProvider').default;
var RaisedButton = require('material-ui/RaisedButton').default;
var Table = require('material-ui/Table/Table').default;
var TableBody = require('material-ui/Table/TableBody').default;
var TableFooter = require('material-ui/Table/TableFooter').default;
var TableHeader = require('material-ui/Table/TableHeader').default;
var TableHeaderColumn = require('material-ui/Table/TableHeaderColumn').default;
var TableRow = require('material-ui/Table/TableRow').default;
var TableRowColumn = require('material-ui/Table/TableRowColumn').default;
var API = require('../../api');


var MembersList = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){
		return ({
			tableData: []
		});
	},

	componentDidMount: function() {
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

            	console.log(tableData);
            }.bind(this),
            function(data){
                cosnole.log(data);
            }.bind(this)
       	);

       	console.log("LENGTH IS " + this.state.tableData.length);
	},

	render:function(){

		return(
			<MuiThemeProvider>
				<Table height="400px"
				selectable={true}>
				    <TableHeader displaySelectAll={false}>
				      <TableRow>
				        <TableHeaderColumn>ID</TableHeaderColumn>
				        <TableHeaderColumn>ID Number</TableHeaderColumn>
				        <TableHeaderColumn>Last Name</TableHeaderColumn>
				        <TableHeaderColumn>First Name</TableHeaderColumn>
				        <TableHeaderColumn>Middle Name</TableHeaderColumn>
				        <TableHeaderColumn>Sex</TableHeaderColumn>
				        <TableHeaderColumn>Civil Status</TableHeaderColumn>
				        <TableHeaderColumn>Blood Type</TableHeaderColumn>
				      </TableRow>
				    </TableHeader>
				    <TableBody showRowHover={true} stripedRows={true}>
				    	{
				    		this.state.tableData.length > 0 ? 
					    		this.state.tableData.map(function(item, index) {
					    			return (
					    				<TableRow>
									        <TableRowColumn>{item.ID}</TableRowColumn>
											<TableRowColumn>{item.ID_NUMBER}</TableRowColumn>
											<TableRowColumn>{item.LAST_NAME}</TableRowColumn>
											<TableRowColumn>{item.FIRST_NAME}</TableRowColumn>
											<TableRowColumn>{item.MIDDLE_NAME}</TableRowColumn>
											<TableRowColumn>{item.SEX}</TableRowColumn>
											<TableRowColumn>{item.CIVIL_STATUS}</TableRowColumn>
											<TableRowColumn>{item.BLOOD_TYPE}</TableRowColumn>
									    </TableRow>
					    			)
					    		})
				    		:
				    		'No data found.'
				    	}
				    </TableBody>
				</Table>
			</MuiThemeProvider>
		);
	}

});

module.exports = MembersList;
