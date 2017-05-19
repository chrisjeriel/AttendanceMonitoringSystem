  


var React = require('react');
var Link = require('react-router').Link;
var AppBody = require('../components/AppBody');
var TimeComponent = require('../components/TimeComponent');
var MainContainer = require('../components/MainContainer');
var Drawer = require('material-ui/Drawer').default;
var MenuItem = require('material-ui/MenuItem').default;
var RaisedButton = require('material-ui/RaisedButton').default;
var MuiThemeProvider = require('material-ui/styles/MuiThemeProvider').default;
var ArrowDropRight = require('material-ui/svg-icons/navigation-arrow-drop-right').default;
var DatePicker = require('material-ui/DatePicker').default;
var ActionList = require('material-ui/svg-icons/action/view-list').default;
var FontIcon = require('material-ui/FontIcon').default;

var Auth = require('../auth/Auth');

var NavigationMenu = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function() {
		return ({
			open: false
		});
	},
	componentDidMount: function(){

	},
	componentWillUnmount: function(){

	},
	Close:function(){
		Auth.logout();
		this.context.router.push('/login')
	},
	handleToggle: function() {
		this.setState({open: !this.state.open});
	},
	handleClose: function() {
		this.setState({open: false});
	},
	openCalendar: function() {
		this.refs.dp.openDialog();
	},
	render: function() {
		return (
			<MuiThemeProvider>
				<div className="container-fluid">
						{/*<div className="list-group col-xs-12">
							<ul className="multi-level">
								<li className="btn btn-default dropdown-submenu list-group-item list-group-item-action"> ATTENDANCE
									<ul className="dropdown-menu">
										<li><Link to='/menu/attendance/kiosk'>Kiosk</Link></li>
										<li><Link to='/menu/attendance/list'>List</Link></li>
									</ul>
								</li>
								<li className="btn btn-default dropdown-submenu list-group-item list-group-item-action"> INQUIRY
									<ul className="dropdown-menu">
										<li><Link to='/menu/inquiry/members'> Members</Link></li>
									</ul>
								</li>
								<Link onClick={this.Close}><li className="btn btn-default list-group-item list-group-item-action">Exit</li></Link>
							</ul>
						</div>*/}
						<br/>
						<div className="list-group col-xs-12">
							<div className="col-xs-6 align-left">
								<RaisedButton
						          label="Menu"
						          onTouchTap={this.handleToggle}
						          icon={<ActionList />}
						        />
					        </div>
					        <div className="col-xs-6 align-right">
						        <RaisedButton
						          label={<TimeComponent />}
						          onTouchTap={this.openCalendar}
						        />
						        <DatePicker id="calenHidden" className="hidden" ref='dp' />
					        </div>
				        </div>
						<Drawer docked={false} open={this.state.open} onRequestChange={this.handleToggle}>
				          <MenuItem rightIcon={<ArrowDropRight />} menuItems={[
						                <MenuItem onTouchTap={this.handleClose} containerElement={<Link to="/menu/attendance/kiosk" />}>Kiosk</MenuItem>
						              ]}>Attendance</MenuItem>
				          <MenuItem rightIcon={<ArrowDropRight />} menuItems={[
						                <MenuItem onTouchTap={this.handleClose} containerElement={<Link to="/menu/inquiry/members" />}>Members</MenuItem>,
						                <MenuItem onTouchTap={this.handleClose} containerElement={<Link to="/menu/inquiry/schedules" />}>Schedules</MenuItem>,
						                <MenuItem onTouchTap={this.handleClose} containerElement={<Link to="/menu/inquiry/attendances" />}>Attendances</MenuItem>
						              ]}>Inquiry</MenuItem>
				        </Drawer>
				        
					<div className='app-content'>
					{this.props.children}
					</div>
				</div>
			</MuiThemeProvider>
		)
	}
});

module.exports = NavigationMenu;
