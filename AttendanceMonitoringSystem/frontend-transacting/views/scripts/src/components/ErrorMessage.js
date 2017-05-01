'use strict';
var React = require('react');
// var ModalContainerNoTitle = require('./components/ModalContainerNoTitle');
var ModalContainer = require('./ModalContainer');

var ErrorMessage = React.createClass({
    render: function () {
        return (
            <ModalContainer className="error_message" title = "Error Message">
                <h5 className='text-center'>{this.props.message}</h5>
            </ModalContainer>
        );
    }
});

module.exports = ErrorMessage;
