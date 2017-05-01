'use strict';

var React = require('react');

var ButtonComponent = require('./ButtonComponent');
var AppHeader = require('./AppHeader');
var AppHeaderTitle = require('./AppHeaderTitle');
var AppBody = require('./AppBody');
var ViewFooter = require('./ViewFooter');
var Auth = require('../auth/Auth');
var Table = require('./TableComponent');
var API = require('../api');

var ConditionPrompt = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){

		return ({
			data:[],
			mode_code: '',
			Description: '',
			list_mode: ''

		});
	},
	propTypes:{
		content: React.PropTypes.string,
		title: React.PropTypes.string
	},
	render:function(){
		var title
		return(
			    <div className="modal-content process_modal">
			      <div className="modal-header">
			        <h4 className="modal-title">{this.props.title}</h4>
			      </div>
			      <div className="modal-body">
			        <p>{this.props.content}</p>
			      </div>
			      <div className="modal-footer">
			        <ButtonComponent ButtonClass='btn btn-default' ButtonName='Yes' whenClicked={this.props.yes} />
			        <ButtonComponent ButtonClass='btn btn-default' ButtonName='No' whenClicked={this.props.no} />
			      </div>
			    </div>
			);
	}

});

module.exports = ConditionPrompt;
