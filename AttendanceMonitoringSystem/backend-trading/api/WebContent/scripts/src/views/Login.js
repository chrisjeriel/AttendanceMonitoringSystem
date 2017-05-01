	'use strict';
/**
 * Login view.
 */

var React = require('react');
var Auth = require('../auth/Auth');
var MaskInputComponent = require('../components/MaskInputComponent');
var ButtonComponent = require('../components/ButtonComponent');
var LoginHeader = require('../components/LoginHeader');
var config = require('../config');
var util = require('../util');
var API = require('../api');
var disable = 'true';
var checkInput = false;
var TextInputComponent = require('../components/TextInputComponent');


var Login = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function () {
		return (
			{
				message: '',				//Message/Action
				systemResponse: null,			//Response from API to be displayed
				transdate: '',
				officeCode: '',				//Office code
				userId: '',					//User ID
				password: '',				//Password
				disable:'true',
			}
		);
	},
	componentDidMount: function () {
		this.refs.transactingDate.focus();
		$(document).on('keyup',function(e){
			if(this.state.systemResponse != null){
				if(this.state.success === true){
					this.context.router.push('/menu')
				}
				else{
					this.setState({
						systemResponse: null,
						success: null,
					},function(){
						this.refs.transactingDate.focus()
					}.bind(this))
				}
			}
		}.bind(this))
	},

	componentWillUnmount: function () {
		$(document).unbind("keyup")
	},

	login: function (e) {

		// this.loginSuccess();

		// this.setState({sending:true},function(){
		// 	API.auth.login({
		// 		// transactionDate: this.state.transdate,
		// 		// officeCode: this.state.officeCode,
		// 		// userID: this.state.userID,
		// 		// password: this.state.password
		// 		"gmfapplid": "",
		// 	  	"guserid": "",
		// 	  	"guserpass": "",
		// 	  	"xnewpass": "",
		// 	  	"gmfregion": ""
		// 	},
		// 	function(data){
				console.log('success login');
				if (!store.enabled) {
					alert('Local storage is not supported by your browser. Please disable "Private Mode", or upgrade to a modern browser.');
					return;
				}

				Auth.login('kahsdkjashd', function(status){
					console.log(Auth.isLoggedIn())
				}.bind(this));

				this.setState({sending:false,systemResponse: "Transaction Complete. Press any key to continue...",success:true})

				document.activeElement.blur()
		// 	}.bind(this), 
		// 	function(data){
		// 		console.log("error login");
		// 		console.log(data);
		// 		this.setState({sending:false, systemResponse: "Something went wrong. Please try again.",success: false,transdate: '', officeCode: '', userId: '', password: ''},function(){

		// 		}.bind(this))
		// 	}.bind(this))
		// }.bind(this))
	},

	loginSuccess: function (res) {
		var self = this,
			data;

		function start () {
			util.checkStore(next);
		}

		function next () {
			data = {
				officeCode: self.state.officeCode,
				userId: self.state.userId,
				type: 1
			};

			store.set('data', data);

			Auth.login(res.data.token, end);
		}

		function end (status) {
			self.setState({message: ''});
			self.setState({systemResponse: 'Initial User Logon: Please change password.'});
			alert('RECORD LOGGED ON');
			self.context.router.push('/menu');
		}

		start();
	},

	loginFail: function (err) {
		this.setState({message: ''});
		this.setState({systemResponse: 'User Logon: Wrong!.'});
		window.addEventListener('keyup', this.enterCredentialKeyListener);
	},

	updateTransactionDate: function(event){
		var value = event.target.value
		this.setState({transdate: event.target.value});

	},

	updateOfficeUnit: function(event){
		var value = event.target.value
		this.setState({officeCode: event.target.value});
	},

	updateUserId: function(event){
		var value = event.target.value
		this.setState({userId: event.target.value});
	},

	updatePassword: function(event){
		var value = event.target.value
		this.setState({password: event.target.value});
		if(value.length === 10 && event.keyCode === 13){
			this.check(null)
			document.activeElement.blur()
		}

	},
	check: function(node){
		if((this.state.transdate.length === 10) && (this.state.officeCode.length === 9) && (this.state.userId.length === 9) && (this.state.password.length === 10)){
			this.setState({sending:true},function(){
				API.auth.login({
					transactionDate: this.state.transdate,
					officeCode: this.state.officeCode,
					userID: this.state.userID,
					password: this.state.password
				},function(data){
					console.log(data)
					this.setState({sending:false,systemResponse: "Transaction Complete. Press any key to continue...",success:true})
				}.bind(this),function(){
					console.log("error")
					this.setState({sending:false, systemResponse: "Something went wrong. Please try again.",success: false,transdate: '', officeCode: '', userId: '', password: ''},function(){

					}.bind(this))
				}.bind(this))
			}.bind(this))

		}else{
			if(node != null) node.focus()
		}
	},
	changePassword: function(e){
		var value = e.target.value.toLowerCase()
		if(value === 'y')
		{
			e.target.value = "Y"
			this.setState({
				changePassword: false,
				confirmPassword: true,
			})
		}
		else if (value === 'n') {
			e.target.value = "N"
		}
		else{
			e.target.value = ""
		}
	},
	cancel:function(){
		Auth.logout();
	},
	SuggestedWaypassword:function(){
		if(Auth.isLoggedIn()){
			this.context.router.push('/password');
		}
		else{
			alert('Invalid Account');
		}

	},
	password:function(){
		this.context.router.push('/password');
	},
	mainMenu:function(){
		if(Auth.isLoggedIn()){
			thi.context.router.push('/menu');
		}
		alert('Invalid Account');
	},


	render: function() {
		return (
			<div id="banner" className="col-md-12">
				<div className="row">
					<div className="col-md-12">
						<span className="banner-top-title">BANK OF THE PHILIPPINE ISLANDS</span>
						<br/>
						<span className="banner-title">
							CBG-FX
						</span>
						<span>ONLINE FX PURCHASE AND SALE DATA ENTRY SYSTEM</span>
						<span>(Trading Unit Module) Version 1.00</span>
						<span>Date Compiled: 05/17/2006</span>
					</div>
				</div>
				<br/>
				<div className="row">
					<div className="col-md-10 container">
						<div className="col-md-9 ">
							<div className="row">
								<div className="col-md-12">
									<TextInputComponent
												title='Transacting Date'
												editMode={true}
												ref="transactingDate"
												idName='transdate'
												length="col-md-12"
												inputLength="col-md-6"
												inputTextAlign="left"
												placeholder="MM/DD/YYYY"
												mask="00/00/0000"
												maxLength="10"
												onChange={this.updateTransactionDate} />
								</div>
							</div>
							<div className="row">
								<div className="col-md-12">
									<TextInputComponent
												title='Office Unit'
												editMode={true}
												idName='officeunit'
												ref="officeUnit"
												length="col-md-12"
												inputLength="col-md-6"
												inputTextAlign="left"
												placeholder="__-__-___"
												maxLength="9"
												mask="00-00-000"
												onChange={this.updateOfficeUnit} />
								</div>
							</div>
							<div className="row">
								<div className="col-md-12">
									<TextInputComponent
												title='User ID'
												editMode={true}
												ref="userID"
												idName='userid'
												length="col-md-12"
												inputLength="col-md-6"
												inputTextAlign="left"
												placeholder="FF________"
												mask="FF000000"
												maxLength="9"
												onChange={this.updateUserId} />
								</div>
							</div>
							<div className="row">
								<div className="col-md-12">
									<TextInputComponent
												title='Password'
												editMode={true}
												ref="password"
												length="col-md-12"
												inputLength="col-md-6"
												inputTextAlign="left"
												inputType="password"
												maxLength="10"
												onKeyUp={this.updatePassword} />
								</div>
							</div>
						</div>
						<div className="col-md-3">
							<div className="row">
								<button className="btn btn-default col-md-12" onClick={this.login}>Login</button>
							</div>
							<div className="row">
								<button className="btn btn-default col-md-12">Cancel</button>
							</div>
							<div className="row">
								<button className="btn btn-default col-md-12" onClick={this.changePassword}>Change Password</button>
							</div>
						</div>
					</div>

				</div>
				<div className="row" style={{marginTop: "1em"}}>
				{
					this.state.sending ?
						<span>Sending...</span>
					: null
				}
				</div>
				{
					this.state.systemResponse != null ?
						<div className="col-md-6 system-response">
							{this.state.systemResponse}
						</div>
					: null
				}

			</div>
		)
	}
});

module.exports = Login;
