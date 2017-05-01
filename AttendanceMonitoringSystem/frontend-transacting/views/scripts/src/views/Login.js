'use strict';
/**
 * Login view.
 */

var React = require('react');
var Auth = require('../auth/Auth');
var defaultData = require('../components/defaultData');

var Login = React.createClass({
    contextTypes: {
        router: React.PropTypes.object
    },

    getInitialState: function(){
        return ({
            data: null,
            message: '',        //Message/Action
            systemResponse: '', //Response from API to be displayed
            transDate: '',      //Transation DATE
            officeCode: '',     //officeCode
            userId: '',         //User ID
            password: '',       //Password
            date: '',           //currentDate
            changePassword: '',  //changePassword
            submit_btn: 'Log In'
        });
    },

    componentDidMount: function(){
        var date = new Date();

        this.refs.officeCode.focus();
        defaultData.storeLoginData();
        this.setState({transDate: (date.getMonth() +1 ) + '/' + date.getDate() + '/' + date.getFullYear()});
    },

    componentWillUnmount: function(){
        window.removeEventListener('keyup', this.loginKeyListener);
        window.removeEventListener('keyup', this.enterCredentialKeyListener);
    },

    login: function(e) {
        if (e) {
            e.preventDefault();
        }

        var success = false;
        this.setState({message: 'Receiving...'});
        document.activeElement.blur();

        var defData = store.get("loginData", null);

        // if((this.state.transDate == defData.transDate) &&
        //     (this.state.officeCode == defData.officeCode) &&
        //     (this.state.userId == defData.userId) &&
        //     (this.state.password == defData.password)){

        if((this.state.transDate) &&
            (this.state.officeCode) &&
            (this.state.userId) &&
            (this.state.password)) {

            Auth.login('kahsdkjashd', function(data){
                store.set("data", data);

                this.setState({
                    data: data,
                    message: '',
                    systemResponse: 'Successful login!'
                },function () {
                    this.setState({submit_btn: 'Submit'});
                    this.refs.changePassword.focus();
                }.bind(this));

                setTimeout(function () {
                    this.setState({systemResponse: ''});
                }.bind(this), 2000);
            }.bind(this));
        }
        else {
            setTimeout(function(){
                this.setState({
                    message: '',
                    systemResponse: 'User Logon: Wrong! Try Again.'
                });
            }.bind(this), 2000);
        }
    },

    updateTransDate: function(event){
        this.setState({transDate: event.target.value});
    },

    updateOfficeCode: function(event){
        this.setState({officeCode: event.target.value});
    },
    updateUserId: function(event){
        this.setState({userId: event.target.value});
    },
    updatePassword: function(event) {
        this.setState({password: event.target.value});
    },
    updatechangePassword: function (event) {
        event.preventDefault();

        var mchangePassword = this.refs.changePassword.value;

        if(mchangePassword == 'Y'){
            this.setState({
                change_password: true,
                submit_btn: 'Change Password'
            });
        }
        else {
            //check if password is expired
        }
    },
    updatePasswordConfirm1: function(event){
        this.setState({passwordConfirm1: event.target.value});
    },
    updatePasswordConfirm2: function(event){
        this.setState({passwordConfirm2: event.target.value});
    },
    changePassword: function (e) {
        e.preventDefault();

        if (this.state.passwordConfirm1 === this.state.passwordConfirm2) {
            this.setState({message: 'Receiving'});

            //if success
            this.setState({systemResponse: 'Password changed'});

            setTimeout(function(){
                this.context.router.push('/main');
            }.bind(this), 2000);
        }
        else{
            this.setState({
                message: 'Please PRESS <ENTER> to ignore.',
                systemResponse: 'Passwords do not match!'
            });
            setTimeout(function(){
                window.addEventListener('keyup', this.enterCredentialKeyListener);
            }.bind(this), 500);
        }
    },
    enterCredentialKeyListener: function(event){
        this.setState({
            systemResponse: '',
            passwordConfirm1: '',
            passwordConfirm2: ''
        });

        window.removeEventListener('keyup', this.enterCredentialKeyListener);
        this.refs.passwordConfirm1.focus();
    },
    render: function () {
        var on_submit;

        switch (this.state.submit_btn) {
            case 'Log In':
                on_submit = this.login;
                break;
            case 'Submit':
                on_submit = this.updatechangePassword;
                break;
            case 'Change Password':
                on_submit = this.changePassword;
                break;
        }

        return (
            <div className='container-fluid app-container'>
                <div id='banner'>
                    <div className="row banner-head">
                        <span id = 'BPI-Top' className = 'block'>BANK OF THE PHILIPPINE ISLANDS</span>
                        <span id='banner-title' className='block'>CBG-FX</span>
                        <h5 className='a-center'>
                            ONLINE FX PURCHASE AND SALE DATA ENTRY SYSTEM
                            <br />
                            (Transacting Unit Module) Version 1.00
                            <br />
                            Date Compiled: 05/17/2006
                        </h5>
                        <div className="row banner-sub">
                            {
                                this.state.systemResponse ?
                                    <div id='system-response' className=' col-md-offset-3 col-md-6'>
                                        {this.state.systemResponse}
                                    </div>
                                : null
                            }
                        </div>
                    </div>
                </div>
                <div id='login-view'>
                    <div id='login-panel'>
                        <div className='col-md-12'>
                            <div id='login-main' className="col-md-offset-3 col-md-6 container-border">
                                <form className="form-group" id="login-panel" onSubmit={on_submit}>
                                    <div className="row">
                                        <div className="col-md-4">
                                            <label>Transaction Date:</label>
                                        </div>
                                        <div className="col-md-8">
                                            <input className="form-control"
                                                type="text"
                                                value={this.state.transDate}
                                                placeholder={this.state.transDate}
                                                maxLength='10'
                                                ref='transDate'
                                                onChange={this.updateTransDate} />
                                        </div>
                                    </div>

                                    <div className="row">
                                        <div className="col-md-4">
                                            <label>Office Code:</label>
                                        </div>
                                        <div className="col-md-8">
                                            <input className="form-control"
                                                type="text"
                                                placeholder="Office Code"
                                                maxLength='9'
                                                ref='officeCode'
                                                onChange={this.updateOfficeCode} />
                                        </div>
                                    </div>

                                    <div className="row">
                                        <div className="col-md-4">
                                            <label>User ID:</label>
                                        </div>
                                        <div className="col-md-8">
                                            <input className="form-control"
                                                type="text"
                                                placeholder="User ID"
                                                maxLength='8'
                                                ref='userId'
                                                onChange={this.updateUserId} />
                                        </div>
                                    </div>

                                    <div className="row">
                                        <div className="col-md-4">
                                            <label>Password:</label>
                                        </div>
                                        <div className="col-md-8">
                                            <input className="form-control"
                                                type="password"
                                                placeholder="Password"
                                                maxLength='8'
                                                ref='password'
                                                onChange={this.updatePassword} />
                                        </div>
                                    </div>
                                    {
                                        this.state.data && !this.state.change_password   ?
                                            <div className="row">
                                                <div className="col-md-4">
                                                    <label>Change Password ?</label>
                                                </div>
                                                <div className="col-md-8">
                                                    <input className="form-control"
                                                        type="text"
                                                        placeholder="Y/N"
                                                        maxLength='1'
                                                        ref='changePassword'/>
                                                </div>
                                            </div>
                                        :
                                            <div className="row"></div>
                                    }
                                    {
                                        this.state.change_password ?
                                            <div>
                                                <div className="row">
                                                    <div className="col-md-4">
                                                        <label>New Password:</label>
                                                    </div>
                                                    <div className="col-md-8">
                                                        <input className="form-control" type="password"
                                                            placeholder="Password" maxLength='8'
                                                            value={this.state.passwordConfirm1}
                                                            ref='passwordConfirm1' onChange={this.updatePasswordConfirm1} />
                                                    </div>
                                                </div>
                                                <div className="row">
                                                    <div className="col-md-4">
                                                        <label>Confirmation:</label>
                                                    </div>
                                                    <div className="col-md-8">
                                                        <input className="form-control" type="password"
                                                            placeholder="Confirm Password" maxLength='8'
                                                            value={this.state.passwordConfirm2}
                                                            ref='passwordConfirm2' onChange={this.updatePasswordConfirm2} />
                                                    </div>
                                                </div>
                                            </div>
                                        : ''
                                    }
                                    <div className="row">
                                        <div className="col-md-offset-4 col-md-8">
                                            <input className="btn btn-default" type="submit" value={this.state.submit_btn} />
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div id='login-footer'>
                        <span>
                            {this.state.message}
                        </span>
                    </div>
                </div>
            </div>
        );
    }
});

module.exports = Login;
