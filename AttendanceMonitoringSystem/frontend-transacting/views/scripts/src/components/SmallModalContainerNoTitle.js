'use strict';

var React = require('react');

var SmallModalContainerNoTitle = React.createClass({
    propTypes: {
        title: React.PropTypes.string
    },
    render: function(){
        return (
            <div className='panel-body-nomodal view-container-modal'>

            <div className='container-title-modal-no'>
                <h4 className='test-left'>{this.props.title}</h4>
            </div>

            <div className='container-content-nomodal'>
                    {this.props.children}
                </div>
            </div>
        )
    }
});

module.exports = SmallModalContainerNoTitle;
