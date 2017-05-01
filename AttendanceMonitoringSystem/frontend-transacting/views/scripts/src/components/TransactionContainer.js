'use strict';

var React = require('react');

var ModalContainer = React.createClass({
    propTypes: {
        title: React.PropTypes.string
    },
    render: function(){
        return (
            <div className={this.props.className + ' panel-body view-container'}>
                {
                    this.props.title ?
                        <div className='container-title-transaction'>
                            <h5 className='test-left'>{this.props.title}</h5>
                        </div>
                        : ''
                }
                <div className='container-content'>
                    {this.props.children}
                </div>
            </div>
        )
    }
});

module.exports = ModalContainer;
