'use strict';

var React = require('react');

var ModalContainer = React.createClass({
    propTypes: {
        title: React.PropTypes.string
    },
    render: function(){
        return (
            <div className={this.props.className + ' panel-body-modal view-container-modal'}>
                <div className='container-title-modal-transparent'>
                    <h4 className='test-left'>{this.props.title}</h4>
                </div>
                <div className='container-content-modal'>
                    {this.props.children}
                </div>
            </div>
        )
    }
});

module.exports = ModalContainer;
