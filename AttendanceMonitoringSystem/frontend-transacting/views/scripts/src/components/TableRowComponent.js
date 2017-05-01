'use strict';

var React = require('react');

var TableRowComponent = React.createClass({
    propTypes: {
        data: React.PropTypes.object,
        checkBox: React.PropTypes.bool,
    },
    getDefaultProps: function() {
        return ({checkBox: false});
    },
    render: function(){
        var data = []
        Object.keys(this.props.data).filter(function(key, index) {
            data.push(<td key={index}>{this.props.data[key]}</td>)
        }.bind(this));
        return (
            <tr>
            {this.props.checkBox ? <td></td> : null }
                {data}
            </tr>
        )
    }
});

module.exports = TableRowComponent;
