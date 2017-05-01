'use strict';
var React = require('react');
// var ModalContainerNoTitle = require('./components/ModalContainerNoTitle');
var ModalContainer = require('./ModalContainer');

var SystemMessage = React.createClass({
    render: function () {
        return (
            <ModalContainer title = "System Message">
                <h5 className='text-center'>{this.props.message}</h5>
            </ModalContainer>
        );
    }
});

module.exports = SystemMessage;
