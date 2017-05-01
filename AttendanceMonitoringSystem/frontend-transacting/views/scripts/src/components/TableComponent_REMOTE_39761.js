var React = require('react');
var TableRowComponent = require('./TableRowComponent');
var TableComponent = React.createClass({
	getDefaultProps: function() {
    return {
      checkBox: false
    };
  },
	getDefaultProps: function() {
    return ({
    });
  },
	propTypes: {
		data: React.PropTypes.array,
		keyListener: React.PropTypes.object,
		checkBox: React.PropTypes.bool,
		column: React.PropTypes.array,
	},
	getInitialState: function(){
		return ({})
	},
	focus : function(){

	},
	selectedItem: function(){
		var items = []
		$('#table tbody tr.active td').each(function(index) {
			items.push($(this).text())
		});
		return items
	},
	selectedItemNode: function(){
		return $('#table tbody tr.active')
	},
	componentDidMount: function(){
		console.log(this.props)
		$('#table').focus()
		var rowLength = $('#table tbody tr').length - 1
		var keyDown = {
        "keys"          : "down",
        "is_exclusive"  : true,
        "on_keydown"      : function(e) {
					console.log("down")
					if($('#table tbody tr.active').index() < rowLength ){
						var index = $('#table tbody tr.active').index()
						console.log(index)
						$('#table tbody tr').removeClass('active')
						$('#table tbody tr').eq(index+1).addClass('active')
					}
        }
		}
		var keyUp = {
        "keys"          : "up",
        "is_exclusive"  : true,
        "on_keydown"      : function(e) {
					console.log("up")
					if($('#table tbody tr.active').index() > 0){
						var index = $('#table tbody tr.active').index()
						$('#table tbody tr').removeClass('active')
						$('#table tbody tr').eq(index-1).addClass('active')
					}
        }
		}
		this.props.keyListener.register_many([keyDown,keyUp])
	},
	componentWillUnmount: function(){
		this.props.keyListener.unregister_combo("up")
		this.props.keyListener.unregister_combo("down")
	},
	renderColumns: function(){
		// var thead = ["","BP Acct. No.","Purch Amt","Customer Name", "Remark"]
		// var head = []
		// for (var i = 0; i < thead.length; i++) {
		// 	head.push(<th>thead[i]</th>)
		// }
		// return (<tr>{head}</th>);
	},
	render: function(){
		// var thead = ["","BP Acct. No.","Purch Amt","Customer Name", "Remark"]
		return (
			<div className='col-md-12 component'>
				<div className='row'>
		    	<table id="table" className="table">
		    		<thead>
							<tr>
								{
									this.props.checkBox ?
										<th></th>
									: null
								}
								{this.props.column.map(function(item, index){
                    return <th key={index}>{item}</th>;
                  }.bind(this))
								}
							</tr>
		    		</thead>
						<tbody>
							{this.props.data.map(function(item, index){
									return <TableRowComponent key={index} data={item} checkBox={this.props.checkBox} />;
								}.bind(this))
							}
						</tbody>
		    	</table>
				</div>
			</div>
		);
	}
});

module.exports = TableComponent;
