   var React = require('react');
var Link = require('react-router').Link;
var AppBody = require('../components/AppBody');
var MainContainer = require('../components/MainContainer');

var Auth = require('../auth/Auth');

var NavigationMenu = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function() {
		return ({

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
	render: function() {
		return (
			<div className="container-fluid">
					<div className="list-group col-xs-12">
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
						</div>
			<div className='app-content'>
			{this.props.children}
			</div>
		</div>

		)
	}
});

module.exports = NavigationMenu;
