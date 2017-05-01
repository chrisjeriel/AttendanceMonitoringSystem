'use strict';

var React = require('react');
var SeparatorComponent = require('./SeparatorComponent');
var _ = require('lodash');

var ViewFooter = React.createClass({
    render: function(){
        return (
            <div className='col-md-12 view-footer'>
                <div className="row footer_message">
                    <SeparatorComponent/>
                    <h5>{this.props.message || ''}</h5>
                </div>
                <div className="row">
                    {
                        _(this.props.key_listeners || []).map(function (key_listener, index) {
                            return (
                                <h5 key={index} className="col-sm-3">
                                    [{key_listener.key}]-{key_listener.action}
                                </h5>
                            );
                        }).value()
                    }
                </div>
            </div>
        )
    }
});

module.exports = ViewFooter;
