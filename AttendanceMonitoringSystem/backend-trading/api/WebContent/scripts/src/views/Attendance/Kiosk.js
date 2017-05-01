'use strict';

var React = require('react');
var ReactDOM = require('react-dom');
var API = require('../../api/caller');
var dateFormat = require('dateformat');


//From Material Ui
var MuiThemeProvider = require('material-ui/styles/MuiThemeProvider').default;
var RaisedButton = require('material-ui/RaisedButton').default;
var Table = require('material-ui/Table/Table').default;
var TableBody = require('material-ui/Table/TableBody').default;
var TableFooter = require('material-ui/Table/TableFooter').default;
var TableHeader = require('material-ui/Table/TableHeader').default;
var TableHeaderColumn = require('material-ui/Table/TableHeaderColumn').default;
var TableRow = require('material-ui/Table/TableRow').default;
var TableRowColumn = require('material-ui/Table/TableRowColumn').default;
var TextField = require('material-ui/TextField').default;
var List = require ('material-ui/List/List').default;
var ListItem = require ('material-ui/List/ListItem').default;
var Divider = require('material-ui/Divider').default;
var Avatar = require('material-ui/Avatar').default;
var FontIcon = require('material-ui/FontIcon').default;
var Paper = require('material-ui/Paper').default;
var SelectField = require('material-ui/SelectField').default;
var MenuItem = require('material-ui/MenuItem').default;
var Tabs = require('material-ui/Tabs').default;
var Tab = require('material-ui/Tabs').Tab;
var Slider = require('material-ui/Slider').default;

//Icons
var Person = require('material-ui/svg-icons/social/person').default;
var PermIdentity = require('material-ui/svg-icons/action/perm-identity').default;
var Gender = require('material-ui/svg-icons/notification/wc').default;
var CivilStatus = require('material-ui/svg-icons/action/loyalty').default;
var BloodType = require('material-ui/svg-icons/maps/local-pharmacy').default;

var Address = require('material-ui/svg-icons/maps/place').default;
var Phone = require('material-ui/svg-icons/maps/local-phone').default;

var materialColors = require('material-ui/styles/colors').default;

var injectTapEventPlugin = require('react-tap-event-plugin');

injectTapEventPlugin();

const styles = {
  headline: {
    fontSize: 24,
    paddingTop: 16,
    marginBottom: 12,
    fontWeight: 400,
  },
};


var AttendanceKiosk = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){
		// var items = [];

		// items.push(<MenuItem value={1} key={1} primaryText={"Group Worship [5:15 PM - 8:00 PM]"} />);
		// items.push(<MenuItem value={2} key={2} primaryText={"Bible Study [9:00 PM - 10:00 PM]"} />);

		var url = "/attendance/getSessionsList";
		var params = null;
		var body = API.APICaller("GET", params, url);
		var schedOpts = [];
		if (body.meta.code == 200) {
			for(var i = 0; i < body.data.length; i++) {
				var start = dateFormat(new Date(body.data[i].start), "hh:MM TT");
				var end = dateFormat(new Date(body.data[i].end), "hh:MM TT");
				schedOpts.push(<MenuItem value={body.data[i].sessionId} key={i} primaryText={body.data[i].title + " [" + start + " - " + end + "]"} />);
			}
			console.log(schedOpts);
		} else {
			alert("No Events in database.")
		}	

		return ({
			items: schedOpts,
			value: 0,
			tableData: []
		});
	},
	componentDidMount: function() {
		
	},
	handleChange: function (event, index, value) {
		// console.log(event);
		// console.log(index);
		console.log(value);
	    this.setState({value: value});
	    this.loadAttendanceTable(value);
	},
	loadAttendanceTable: function(sessionId) {
		console.log("Load attendance table : " + sessionId);
		var url = "/attendance/getAttendanceList?sessionId=" + sessionId;
		var params = { sessionId: sessionId };
		var body = API.APICaller("GET", null, url);
		var schedOpts = [];
		if (body.meta.code == 200) {
			this.setState({tableData: body.data});
		} else {
			alert("No Events in database.")
		}	

	},
	onChangeIdNumber: function(event, newValue) {
		this.setState({idNumber: newValue});
	},
	handleActive: function(tab) {
		alert("A tab with this route property " + tab.props['data-route'] + " was activated.");
	},
	render:function(){

		return(
			<MuiThemeProvider>
				<div className="row">
					<div className="row margin-bot-1em">
						<div className="col-md-12">
							<Paper zDepth={2}>
								<div className="row" style={{padding: "1em"}}>
									<div className="col-md-12 align-left">
										<span><h1>Kiosk #1</h1></span>
									</div>
								</div>
							</Paper>
						</div>
					</div>
					<div className="row">
						<div className="col-md-3">
							<Paper zDepth={2}>
								<div style={{padding: "1em"}}>
									<SelectField autoWidth={true} className="align-left" floatingLabelText="Active Session" value={this.state.value} onChange={this.handleChange}>
								        {this.state.items}
								    </SelectField>
									<TextField
										  className="align-center"
									      floatingLabelText="ID Number"
									      fullWidth={true}
									      value={this.state.idNumber}
									      onChange={this.onChangeIdNumber}
								    /> <br />
{/*								    <TextField
									      floatingLabelText="Last Name"
									      fullWidth={true}
								    /> <br />
								    <TextField
									      floatingLabelText="First Name"
									      fullWidth={true}
								    /> <br />
								    <TextField
									      floatingLabelText="Middle Name"
									      fullWidth={true}
								    />*/}
							    </div>
						    </Paper>
					    </div>
					    <div className="col-md-9">
					    	<Paper zDepth={2}>
								<div style={{padding: "1em"}}>
									<Tabs>
									    <Tab label="Profile" >
									    	<div className="row searchTable">
												<br/>
											</div>
									    	<div className="row align-center">
									    		<Avatar
										          icon={<PermIdentity />}
										          size={200}
										          color={"#64b5f6"}
							          			  backgroundColor={"#1a237e"}
										          style={{margin: 5}}
										        />
									    	</div>
									    	<div className="row">
									    		<div className="col-md-6">
												    <List>
												      <ListItem primaryText="Sarsonas, Christopher Jeriel Alcala" leftIcon={<PermIdentity />} />
												      <ListItem primaryText="650-A Apple Street, Brgy. Commonwealth, Quezon City" leftIcon={<Address />} />
												      <ListItem primaryText="0935-572-5950" leftIcon={<Phone />} />
												    </List>
												</div>
												<div className="col-md-6">
												    <List>
												      <ListItem primaryText="Male" leftIcon={<Gender />} />
												      <ListItem primaryText="Single" leftIcon={<CivilStatus />} />
												    </List>
												</div>
									    	</div>
									    </Tab>
										<Tab label="Attendance List" >
									    	<Table style={{ tableLayout: 'auto' }} height="400px" selectable={false}>
											    <TableHeader displaySelectAll={false}>
											      <TableRow>
											        <TableHeaderColumn>#</TableHeaderColumn>
											        <TableHeaderColumn>Name</TableHeaderColumn>
											        <TableHeaderColumn>Time In</TableHeaderColumn>
											        <TableHeaderColumn>Time Out</TableHeaderColumn>
											      </TableRow>
											    </TableHeader>
											    <TableBody showRowHover={true} stripedRows={true}>
								    				{
											    		this.state.tableData.length > 0 ? 
												    		this.state.tableData.map(function(item, index) {
												    			return (
												    				<TableRow key={index}>
																        <TableRowColumn>{index + 1}</TableRowColumn>
																		<TableRowColumn>{item.fullName}</TableRowColumn>
																		<TableRowColumn>{item.timeIn}</TableRowColumn>
																		<TableRowColumn>{item.timeOut}</TableRowColumn>
																    </TableRow>
												    			)
												    		})
											    		:
											    		'No data found.'
											    	}
											    </TableBody>
											</Table>
									    </Tab>
									</Tabs>
							    </div>
							</Paper>
					    </div>
				    </div>
			    </div>
			</MuiThemeProvider>
		);
	}

});

module.exports = AttendanceKiosk;
