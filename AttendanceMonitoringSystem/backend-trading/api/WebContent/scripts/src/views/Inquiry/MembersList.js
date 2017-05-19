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
var API = require('../../api/caller');
var Paper = require('material-ui/Paper').default;

var Toolbar = require('material-ui/Toolbar').Toolbar;
var ToolbarGroup = require('material-ui/Toolbar').ToolbarGroup;
var ToolbarSeparator = require('material-ui/Toolbar').ToolbarSeparator;
var ToolbarTitle = require('material-ui/Toolbar').ToolbarTitle;
var DropDownMenu = require('material-ui/DropDownMenu').default;
var IconMenu = require('material-ui/IconMenu').default;
var IconButton = require('material-ui/IconButton').default;
var FontIcon = require('material-ui/FontIcon').default;
var MenuItem = require('material-ui/MenuItem').default;
var TextField = require('material-ui/TextField').default;
var NavigationExpandMoreIcon = require('material-ui/svg-icons/navigation/expand-more').default;
var ActionSearch = require('material-ui/svg-icons/action/search').default;


var MembersList = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){
		return ({
			tableData: [],
			showSearch: false
		});
	},

	componentDidMount: function() {
		console.log("Load Members List");
		var url = "/inquiry/getMembersList";
		var body = API.APICaller("GET", null, url);
		var tableData = [];
		if (body.meta.code == 200) {
			for (var i = 0; i < body.data.length; i++) {
	    		tableData.push({
	    			ID: body.data[i].id,
	    			ID_NUMBER: body.data[i].idNumber,
	    			LAST_NAME: body.data[i].lastName,
	    			FIRST_NAME: body.data[i].firstName,
	    			MIDDLE_NAME: body.data[i].middleName,
	    			SEX: body.data[i].sex,
	    			CIVIL_STATUS: body.data[i].civilStatus,
	    			BLOOD_TYPE: body.data[i].bloodType
	    		});
	    	}
	    	this.setState({tableData: tableData}, function() {
	    		console.log("Checker.");
	    		console.log("LENGTH IS " + this.state.tableData.length);
	    	}.bind(this));
		} else {
			alert("No Events in database.")
		}	
	},
	onChangeSearch: function(event, newValue) {
		console.log("Searching for: " + newValue);
		var searchResult = [];
		if (newValue.length > 0) {
			for (var i = 0; i < this.state.tableData.length; i++) {
				if (this.state.tableData[i].LAST_NAME.toUpperCase().search(newValue.toUpperCase()) > -1 || this.state.tableData[i].FIRST_NAME.toUpperCase().search(newValue.toUpperCase()) > -1 || this.state.tableData[i].MIDDLE_NAME.toUpperCase().search(newValue.toUpperCase()) > -1 
					|| this.state.tableData[i].SEX.toUpperCase().search(newValue.toUpperCase()) > -1 || this.state.tableData[i].CIVIL_STATUS.toUpperCase().search(newValue.toUpperCase()) > -1) {
					searchResult.push(this.state.tableData[i]);
				}
			}

			this.setState({showSearch: true, searchResult: searchResult});
		} else {
			this.setState({showSearch: false, searchResult: searchResult});
		}
		

	},
	render:function(){

		return(
			<MuiThemeProvider>
				<div className="row">
					<div className="col-md-12 margin-bot-1em">
						<Paper zDepth={2}>
							<div>
								<div>
									<Toolbar>
								        <ToolbarGroup className="pad-left-right-1em" firstChild={true}>
								          	<TextField
												className="align-left"
											    hintText={<ActionSearch />}
											    onChange={this.onChangeSearch}
									    	/> 
								        </ToolbarGroup>
								    </Toolbar>
							    </div>
							    <div>
									<Table height="500px"
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
									    		this.state.tableData.length > 0 && !this.state.showSearch ? 
										    		this.state.tableData.map(function(item, index) {
										    			return (
										    				<TableRow key={index}>
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
									    	{
									    		this.state.showSearch ?
									    		this.state.searchResult.map(function(item, index) {
										    			return (
										    				<TableRow key={index}>
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
								</div>
							</div>
				    	</Paper>
				    </div>
				    <div className="col-md-12 margin-bot-1em">
						<Paper zDepth={2}>
							<div className="row" style={{padding: "1em"}}>
								<div className="col-md-6 align-left">
									<h5>{this.state.showSearch ? this.state.searchResult.length + " results found." : ''}</h5>
								</div>
								<div className="col-md-6 align-right">
									<RaisedButton className="margin-right-5px" label="Add" primary={true} onTouchTap={this.onClickAdd}/>
									<RaisedButton className="margin-right-5px" label="Update" primary={true} onTouchTap={this.onClickUpdate}/>
									<RaisedButton className="margin-right-5px" label="Delete" secondary={true} onTouchTap={this.onClickDelete}/>
								</div>
							</div>
						</Paper>
					</div>
				</div>
			</MuiThemeProvider>
		);
	}

});

module.exports = MembersList;
