'use strict';

var React = require('react');

// module.exports = function(React){

var TableRowComponent = require('./TableRowComponent');

var TableComponent = React.createClass({
	propTypes: {
		data: React.PropTypes.array,
		column: React.PropTypes.array,
		checkBox: React.PropTypes.bool,
		keyListener: React.PropTypes.object,
		onMove: React.PropTypes.func,
		onSelect: React.PropTypes.func
	},
	getInitialState: function(){
		return ({
			data: [],
			chunk: [],
			index: 0,
			visible: 5,
			last: false,
			selectedRow: [],
			checkedRow: [],
			paginate: true,
		});
	},
	getDefaultProps: function() {
		return ({
			visible: 5,
			checkBox: false,
			paginate:true,
		});
	},
	selectedItem: function(){
		var items = [];
		$(this.refs.mytable).find('tbody tr.selected td').each(function(index) {
			items.push($(this).text())
		});

		return items;
	},
	componentWillReceiveProps: function(){
		this.setState({editMode: this.props.editMode},function(){
			this.setState({editMode: this.props.editMode},function(){

			}.bind(this))
		}.bind(this))
	},
	selectedItemNode: function(){
		return $(this.refs.mytable).find('tbody tr.selected');
	},
	lastDown: function(){

	},
	currentPage: function(){
		return this.state.index
	},
	setPage: function(value){
		this.setState({
			index: value
		}, function(){
			this.props.keyListener.unregister_combo("up");
			this.props.keyListener.unregister_combo("down");
			this.renderVisibleData();
		}.bind(this));
	},
	paginateUp: function(){
		if(this.state.index <= 0){
			// return false;
		}else{
			this.setState({
				index: this.state.index - this.state.visible
			}, function(){

				this.props.keyListener.unregister_combo("up");
				this.props.keyListener.unregister_combo("down");
				this.renderVisibleData()
			}.bind(this));

			// return true;
		}
	},
	paginateDown: function(){
		if((this.state.index + this.state.visible) >= this.state.data.length){
			// return false;
		}else{
			this.setState({
				index: this.state.index + this.state.visible
			}, function(){
				this.props.keyListener.unregister_combo("up");
				this.props.keyListener.unregister_combo("down");
				this.renderVisibleData();

			}.bind(this));
			// return true;
		}
	},
	renderVisibleData: function(){
		$(this.refs.mytable).find('tbody tr td').text('')
		let tempData = []
		if(this.props.paginate){
			for (let i = this.state.index; i < (this.state.visible + this.state.index); i++) {
				if(i < this.state.data.length){
					// console.log(this.state.checkedRow)
					if(this.state.checkedRow.indexOf(i) > -1){
						this.state.data[i].check = true
						tempData.push(this.state.data[i])

					}
					else{
						tempData.push(this.state.data[i])
					}

				}
			}
		}
		else{
			for (let i = this.state.index; i < (this.state.data.length); i++) {
				if(i < this.state.data.length){
					// console.log(this.state.checkedRow)
					if(this.state.checkedRow.indexOf(i) > -1){
						this.state.data[i].check = true
						tempData.push(this.state.data[i])

					}
					else{
						tempData.push(this.state.data[i])
					}

				}
			}
		}

		this.setState({chunk: tempData},function(){
			$(this.refs.mytable).focus()
			$(this.refs.mytable).find('tbody tr').removeClass('selected')
			$(this.refs.mytable).find('tbody tr:first').addClass('selected')

		}.bind(this))
	},
	key_listener: function (e) {
      e=e||window.event;
      e.preventDefault();
      var key = e.key.toLowerCase();
      if (key === 'esc') {
          // this.context.router.push('/menu');
      } else if (key === 'up') {
            if ($('tbody tr:not(:first).selected').length === 0) {
                 $('tbody tr:first').addClass('selected');
            }
             $('tbody tr:not(:first).selected').removeClass('selected').prev().addClass('selected');
            
            if (this.props.onMove) {
           	 	this.props.onMove();
            }
      } else if (key === 'down') {
            if ($('tbody tr:not(:first).selected').length === 0) {
                $('tbody tr:first').addClass('selected');
            }
          	$('tbody tr:not(:last).selected').removeClass('selected').next().addClass('selected');
            
            if (this.props.onMove) {
           	 	this.props.onMove();
            }
      } else if (key === 'enter') {
            // $('tr.selected').click();

            this.props.onSelect(this.state.data[$("tbody tr.selected").index()]);
      }
    },
	componentDidMount: function(){
    	window.addEventListener('keyup', this.key_listener);

		if(this.props.visible != this.state.visible){
			this.setState({visible:this.props.visible})
		}
		if(this.props.checkBox){
			var clone = this.props.data.slice(0)
			for (var i = 0; i < clone.length; i++) {
				clone[i] = Object.assign(clone[i],{check: false})
			}
			this.setState({data: clone},function(){
				this.renderVisibleData()
			}.bind(this));
		}
		else{
			this.setState({data: this.props.data},function(){

				this.renderVisibleData()
			}.bind(this));
		}
	},
	getSelectedItems: function(){
		return ({	selectedRow: this.state.selectedRow,
					checkedRow : this.state.checkedRow})
	},
	setSelectedItems: function(value){
		this.setState(value)
	},
	checkRow: function(){
		var stateSelectedRow = this.state.selectedRow.slice(0)
		var stateCheckedRow = this.state.checkedRow.slice(0)
		var selectedItem = this.selectedItem()
		var selectedIndex = this.state.index + this.selectedItemNode().index()
		var selectedRow = {item: selectedItem ,index: selectedIndex}
		stateSelectedRow.push(selectedRow)
		stateCheckedRow.push(selectedIndex)
		this.setState({selectedRow: stateSelectedRow,checkedRow: stateCheckedRow},function(){
			this.selectedItemNode().find('td').eq(0).text("✓")
		}.bind(this))

	},
	uncheckRow: function(){
		var stateSelectedRow = this.state.selectedRow.slice(0)
		var stateCheckedRow = this.state.checkedRow.slice(0)
		var selectedIndex = this.state.index + this.selectedItemNode().index()
		if(stateCheckedRow.indexOf(selectedIndex) > -1){
			stateCheckedRow.splice(stateCheckedRow.indexOf(selectedIndex),1)
			this.setState({checkedRow: stateCheckedRow},function(){
				for (var i = 0; i < stateSelectedRow.length; i++) {
					if(stateSelectedRow[i].index === selectedIndex){
						stateSelectedRow.splice(i,1)
						this.setState({selectedRow: stateSelectedRow})
						break
					}
				}
			}.bind(this))
		}
	},
    componentWillUnmount: function () {
        window.removeEventListener('keyup', this.key_listener);
    },
	getTableNode: function(){
		return $(this.refs.mytable)
	},
	render: function(){
		return (
			<div className='col-md-12 component'>
				<div className={"row" + (this.props.paginate ? "" : " custom-no-paginate")}>
				<table ref="mytable" id="table" className="table custom-no-paginate">
					<thead>
						<tr>
							{
								this.props.checkBox ?
									<th></th>
								:
									null
							}
							{
								this.props.column.map(function(item, index){
									return <th align="center" key={index}>{item}</th>;
			  					}.bind(this))
							}
						</tr>
					</thead>
						<tbody>
							{this.state.chunk.map(function(item, index){
									console.log(JSON.stringify(item));
									return <TableRowComponent checked={item.check} key={index} data={item} checkBox={this.props.chkBox} />;
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
// return TableComponent;
// }