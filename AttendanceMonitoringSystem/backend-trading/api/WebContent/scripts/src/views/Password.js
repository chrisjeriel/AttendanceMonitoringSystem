/**
 * Login view.
 */

var React = require('react');
var Auth = require('../auth/Auth');
var LoginHeader = require('../components/LoginHeader');
var ButtonComponent = require('../components/ButtonComponent');
var DateComponent = require('../components/DateComponent');
var config = require('../config');
var util = require('../util');
var api = require('../api');

var Password = React.createClass({
		contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){
		return (
			{
			    message: '',				//Message/Action
			    systemResponse: '',			//Response from API to be displayed
			    officecode: '',				//Transation UNIT
			    password: '',					//Password
			    passwordConfirm: ''				//Password Confirmation
			}
		);
	},
	componentDidMount: function(){
		var data = store.get('data');
		this.refs.officecode.value = data.officecode;
		this.refs.password.focus();
		this.setState({message: 'Please PRESS <ENTER> to ignore.'});
	},
	componentWillUnmount: function(){
		
	},
	password: function(e){
		var self = this;

		function start () {
			e.preventDefault();
			document.activeElement.blur();
			self.setState({message: 'Receiving...'}, sendData);
		}

		function sendData () {
		
					// uncomment this for testing
			self.passwordSuccess({data: {token: 'asdasddasad'}});

			// comment this when testing
			// api.auth.password({
			// 	transdate: self.state.transdate,
			// 	officecode: self.state.officecode,
			// 	userId: self.state.userId,
			// 	password: self.state.password
			// })
			// .done(self.passwordSuccess)
			// .fail(self.loginFail);
		}

		start();
	},
	passwordSuccess: function (res) {
		var self = this,
			data;

		function start () {
			util.checkStore(next);
		}

		function next () {
			data = {
				officecode: self.state.officecode,
				userId: self.state.userId,
				type: 1
			};

			store.set('data', data);

			Auth.login(res.data.token, end);
		}

		function end (status) {
			self.setState({message: ''});
			self.setState({systemResponse: 'Initial User Logon: Please change password.'});
			// alert('RECORD LOGGED ON');
			self.context.router.push('/menu');
		}

		start();
	},
	passwordFail: function (err) {
		this.setState({message: ''});
		this.setState({systemResponse: 'User Logon: Wrong!.'});
		window.addEventListener('keyup', this.enterCredentialKeyListener);
	},
    updatePassword: function(event){
    	var password = event.target.value;
		if(password.length == 8){
			this.setState({password: password}, function(){
				this.check(this.refs.passwordConfirm);
			});
		}else{
			this.setState({password: ''});
		}
	},
    updatePasswordConfirm: function(event){
    	var passwordConfirm = event.target.value;
		if(passwordConfirm.length == 8){
			this.setState({passwordConfirm: passwordConfirm}, function(){
				this.check(this.refs.password);
			});
		}else{
			this.setState({passwordConfirm: ''});
		}
	},
	check: function(node){
		if((this.state.password.length == 8) && (this.state.passwordConfirm.length == 8)){
			if(this.state.password == this.state.passwordConfirm){
				this.login();
			}else{
				this.setState({message: 'Please PRESS <ENTER> to ignore.'});
				this.setState({systemResponse: 'Passwords do not match!'});
				setTimeout(function(){
					window.addEventListener('keyup', this.enterCredentialKeyListener);
				}.bind(this), 500);
			}
		}else{
			node.focus();
		}
	},
	goToMenuKeyListener: function(event){
		this.context.router.push('/menu');
	},
	enterCredentialKeyListener: function(event){
		this.setState({systemResponse: ''});
		this.refs.password.value = '';
		this.refs.passwordConfirm.value = '';

		this.setState({password: ''});
		this.setState({passwordConfirm: ''});

		window.removeEventListener('keyup', this.enterCredentialKeyListener);
		this.refs.password.focus();
	},
    render: function() {
        return (
            <div className='container-fluid app-container'>
				<div id='login-view'>
					<div id='login-panel'>
						<div className='col-sm-12 full-height'>
							<div className='col-sm-10 col-sm-offset-1 container-border-thick padding-bottom'>								
								<LoginHeader>
									<h5>FXFRMLOGIN</h5>
								</LoginHeader>
								<div id='login-main' className="col-sm-12 container-padding container-border-thin">
									<form className="form-group ">
										<div className='col-sm-7'>
											<div className="row">

												<div className="col-sm-4 ">
													<label>New Password</label>
												</div>

												<div className="col-sm-8 ">
													<input className="form-control" type="password"
														placeholder="Password" maxLength='8'
														ref='password' onChange={this.updatePassword} />
												</div>

											</div>  

											<div className="row">

												<div className="col-sm-4 ">
													<label>Confirm Password</label>
												</div>

												<div className="col-sm-8">
													<input className="form-control" type="password"
														placeholder="Confirm Password" maxLength='8'
														ref='passwordConfirm' onChange={this.updatePasswordConfirm} />
												</div>
											</div>  
										</div>  

										<div className='login-button col-sm-4 col-md-offset-1'>
											<button className="btn btn-default form-control" onClick={this.goToMenuKeyListener}>CANCEL</button>
											<ButtonComponent ButtonName='CHANGE PASSWORD' whenClicked={this.ChangePassword} />
										</div>
									</form> 
								</div> 
							</div> 
						</div>
					</div> 

					<div id='login-footer'>
						<span className='block'>
							{this.state.message}
						</span>
					</div>
				</div> 
			</div> 
        )
    }
});

module.exports = Password;
