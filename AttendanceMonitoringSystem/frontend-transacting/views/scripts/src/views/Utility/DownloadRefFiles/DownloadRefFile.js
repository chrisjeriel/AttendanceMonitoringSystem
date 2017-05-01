'use strict';

var React = require('react');

var DownloadRefFile = React.createClass({
    propTypes: {
        title: React.PropTypes.string.isRequired
    },
    render: function(){
        return (
            <div className='panel-body view-container-print'>
                <div className='container-title-download'>
                    <h4 className='test-left'>{this.props.title}</h4>
                </div>
                <div className='container-content-print'>
                    {this.props.children}
                </div>
            </div>
        )
    }
});

module.exports = DownloadRefFile;
