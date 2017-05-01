'use strict';

var React = require('react');

var ViewHeader = React.createClass({
    render: function(){
        return (
            <div className='row col-md-12'>
                {this.props.children}
            </div>
        );
    }
});

module.exports = ViewHeader;
