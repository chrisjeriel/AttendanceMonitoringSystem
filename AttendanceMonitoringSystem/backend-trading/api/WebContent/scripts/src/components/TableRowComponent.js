var React = require('react');


// module.exports = function(React){

var TableRowComponent = React.createClass({
	propTypes: {
		data: React.PropTypes.object,
		checkBox: React.PropTypes.bool,
	},
	getDefaultProps: function() {
		return ({
			checkBox: false,
			checked: false,
		});
	},
	render: function(){
		var data = []
		Object.keys(this.props.data).filter(function(key, index) {
			if(key != "check"){
				data.push(<td align="center" key={index}>{this.props.data[key]}</td>)
			}

		}.bind(this));
		return (
			<tr align="center">
				{data}
				{this.props.checkBox ? <td><input type="checkbox" /></td> : null}
			</tr>
		)
	}
});

module.exports = TableRowComponent;
// }