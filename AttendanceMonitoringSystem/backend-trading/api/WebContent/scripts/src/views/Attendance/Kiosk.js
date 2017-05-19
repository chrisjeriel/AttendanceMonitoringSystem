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
var Snackbar = require('material-ui/Snackbar').default;

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
		var url = "/attendance/getSessionsList";
		var params = null;
		var body = API.APICaller("GET", params, url);
		var schedOpts = [];
		if (body.meta.code == 200) {
			if (body.data.length > 0) {
				for(var i = 0; i < body.data.length; i++) {
					var start = dateFormat(new Date(body.data[i].start), "hh:MM TT");
					var end = dateFormat(new Date(body.data[i].end), "hh:MM TT");
					schedOpts.push(<MenuItem value={body.data[i].sessionId} key={i} primaryText={body.data[i].title + " [" + start + " - " + end + "]"} />);
				}
				console.log(schedOpts);
			} else {
				alert("No Events in database.");
			}
			
		} else {
			alert("Error retrieving from database.");
		}	

		return ({
			items: schedOpts,
			value: 0,
			tableData: [],
			autoHideDuration: 4000,
			openSnackBar: false,
			inDisabled: true,
			outDisabled: false,
			snackBarMessage: '',
			timeType: "in",
			showMemberData: false
		});	
	},
	componentDidMount: function() {
		
	},
	handleChange: function (event, index, value) {
		console.log(event);
		// console.log(index);
		console.log(value);
	    this.setState({value: value, selectedOpt: event.target.innerHTML, openSnackBar: false});
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
	onClickIn: function(event) {
		this.setState({inDisabled: true, outDisabled: false, timeType: "in", idNumber: ''});
	},
	onClickOut: function(event) {
		this.setState({inDisabled: false, outDisabled: true, timeType: "out", idNumber: ''});
	},
	onChangeIdNumber: function(event, newValue) {
		this.setState({idNumber: newValue});
		this.setState({memberData: null, showMemberData: false, openSnackBar: false});
		var self = this;
		if (newValue.length == 8) {
			console.log("Load members table : " + newValue);
			var url = "/inquiry/getMember?idNumber=" + newValue;
			var body = API.APICaller("GET", null, url);
			var memberData = [];
			if (body.meta.code == 200) {
				console.log(body.data);
				if (body.data.length) {
					memberData.push(body.data[0]);
				} else {
					memberData.push(body.data);
				}

				var params = {
					"timeType" : this.state.timeType,
					"sessionId" : this.state.value,
					"idNumber" : memberData[0].idNumber,
					"fullName" : memberData[0].lastName + ", " + memberData[0].firstName + " " + memberData[0].middleName
				};
				console.log(params);
				var urlSTime = "/attendance/saveTimePost";
				var bodySTime = API.APICaller("POST", params, urlSTime);
				var snackBarMessage = bodySTime.meta.errorMessage;
				this.setState({memberData: memberData, showMemberData: true, openSnackBar: true, snackBarMessage: "[" + newValue + "] - " + snackBarMessage, idNumber: ''}, function() {
					this.loadAttendanceTable(this.state.value);
					self.loadAttendanceTable(this.state.value);
				}.bind(this));
			} else {
				this.setState({memberData: [], openSnackBar: true, snackBarMessage: "[" + newValue + "] - Member not found."});
			}
		}
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
									<div className="col-md-6 align-left">
										<span><h1>Attendance Kiosk</h1></span>
									</div>
									<div className="col-md-6 align-right">
										<span><h1>{this.state.selectedOpt}</h1></span>
									</div>
								</div>
							</Paper>
						</div>
					</div>
					<div className="row">
						<div className="col-md-3">
							<Paper zDepth={2}>
								<div style={{padding: "1em"}}>
								    <SelectField autoWidth={true} className="align-left full-width" floatingLabelText="Active Session" value={this.state.value} onChange={this.handleChange}>
								        {this.state.items}
								    </SelectField>
									<TextField
										  className="align-center"
									      floatingLabelText="ID Number"
									      fullWidth={true}
									      maxLength="8"
									      value={this.state.idNumber}
									      onChange={this.onChangeIdNumber}
								    /> 
								    <br />
								    <div className="align-right">
								    	<RaisedButton label="Time In" primary={true} disabled={this.state.inDisabled} onTouchTap={this.onClickIn}/>
								    	<RaisedButton label="Time Out" secondary={true} disabled={this.state.outDisabled} onTouchTap={this.onClickOut}/>
								    </div>
								    
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
										<Tab label="Attendance List" >
									    	<Table style={{ tableLayout: 'auto' }} height="400px" selectable={false}>
											    <TableHeader adjustForCheckbox={false} displaySelectAll={false}>
											      <TableRow>
											        <TableHeaderColumn>#</TableHeaderColumn>
											        <TableHeaderColumn>Name</TableHeaderColumn>
											        <TableHeaderColumn>Time In</TableHeaderColumn>
											        <TableHeaderColumn>Time Out</TableHeaderColumn>
											      </TableRow>
											    </TableHeader>
											    <TableBody displayRowCheckbox={false} showRowHover={true} stripedRows={true}>
								    				{
											    		this.state.tableData.length > 0 ? 
												    		this.state.tableData.map(function(item, index) {
												    			return (
												    				<TableRow key={index}>
																        <TableRowColumn>{index + 1}</TableRowColumn>
																		<TableRowColumn>{item.fullName}</TableRowColumn>
																		<TableRowColumn>{item.timeIn ? item.timeIn : "--/--/-- --:--:--.-"}</TableRowColumn>
																		<TableRowColumn>{item.timeOut ? item.timeOut : "--/--/-- --:--:--.-"}</TableRowColumn>
																    </TableRow>
												    			)
												    		})
											    		:
											    		'No data found.'
											    	}
											    </TableBody>
											</Table>
									    </Tab>
									    <Tab label="Profile" >
									    	{this.state.showMemberData ? 
										    	<div>
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
														      <ListItem primaryText={this.state.memberData[0].lastName + ", " + this.state.memberData[0].firstName + " " + this.state.memberData[0].middleName} leftIcon={<PermIdentity />} />
														      <ListItem primaryText="650-A Apple Street, Brgy. Commonwealth, Quezon City" leftIcon={<Address />} />
														      <ListItem primaryText="0935-572-5950" leftIcon={<Phone />} />
														    </List>
														</div>
														<div className="col-md-6">
														    <List>
														      <ListItem primaryText={this.state.memberData[0].sex} leftIcon={<Gender />} />
														      <ListItem primaryText={this.state.memberData[0].civilStatus} leftIcon={<CivilStatus />} />
														    </List>
														</div>
											    	</div>
										    	</div>
									    	: ''
									    	}
									    </Tab>
									</Tabs>
							    </div>
							</Paper>
					    </div>
				    </div>
				    <Snackbar
			          open={this.state.openSnackBar}
			          message={this.state.snackBarMessage}
			          autoHideDuration={this.state.autoHideDuration}
			          className="align-center"
			        />
			    </div>
			</MuiThemeProvider>
		);
	}

});

module.exports = AttendanceKiosk;
