var React = require('react');
var TableRowComponent = require('./TableRowComponent');

var TableComponent = React.createClass({
    propTypes: {
        data: React.PropTypes.array,
        column: React.PropTypes.array,
        checkBox: React.PropTypes.bool,
        keyListener: React.PropTypes.object
    },
    getInitialState: function(){
        return ({
            data: [],
            chunk: [],
            index: 0,
            visible: 5,
            last: false
        });
    },
    getDefaultProps: function() {
        return ({
            visible: 5,
            checkBox: false
        });
    },
    selectedItem: function(){
        var items = [];
        $('#table tbody tr.active td').each(function(index) {
            items.push($(this).text())
        });

        return items;
    },
    selectedItemNode: function(){
        return $('#table tbody tr.active');
    },
    lastDown: function(){

    },
    paginateUp: function(){
        if (this.state.index <= 0) {
            return false;
        }
        else {
            this.setState({
                index: this.state.index - this.state.visible
            }, function () {
                var key_listener = this.props.key_listener;

                if (key_listener) {
                    key_listener.unregister_combo("up");
                    key_listener.unregister_combo("down");
                }
                this.renderVisibleData()
            }.bind(this));

            return true;
        }
    },
    paginateDown: function(){
        if ((this.state.index + this.state.visible) >= this.state.data.length) {
            return false;
        }
        else {
            this.setState({
                index: this.state.index + this.state.visible
            }, function(){
                this.props.keyListener.unregister_combo("up");
                this.props.keyListener.unregister_combo("down");
                this.renderVisibleData();
            }.bind(this));

            return true;
        }
    },
    renderVisibleData: function(){
        let tempData = []
        for (let i = this.state.index; i < (this.state.visible + this.state.index); i++) {
            if(i < this.state.data.length){
                tempData.push(this.state.data[i])
            }
        }
        this.setState({chunk: tempData}, function () {
            var key_listener = this.props.keyListener;

            $('#table').focus()
            $('#table tbody tr').removeClass('active')
            $('#table tbody tr:nth-child(1)').addClass('active')

            var rowLength = $('#table tbody tr').length - 1
            var keyDown = {
                keys: 'down',
                is_exclusive: true,
                on_keydown: function(e) {
                    if($('#table tbody tr.active').index() < rowLength ){
                        var index = $('#table tbody tr.active').index()
                        $('#table tbody tr').removeClass('active')
                        $('#table tbody tr').eq(index+1).addClass('active')
                    }
                }
            };
            var keyUp = {
                keys: 'up',
                is_exclusive: true,
                on_keydown: function(e) {
                    if ($('#table tbody tr.active').index() > 0) {
                        var index = $('#table tbody tr.active').index()
                        $('#table tbody tr').removeClass('active')
                        $('#table tbody tr').eq(index-1).addClass('active')
                    }
                }
            };

            if (key_listener) {
                key_listener.register_many([keyDown,keyUp]);
            }
        }.bind(this))
    },
    componentWillMount: function(){
        if (this.props.visible != this.state.visible) {
            this.setState({visible:this.props.visible})
        }

        this.setState({data: this.props.data},function(){
            this.renderVisibleData()
        }.bind(this));
    },
    componentDidMount: function(){

    },
    componentWillUnmount: function(){
        var key_listener = this.props.keyListener;

        if (key_listener) {
            key_listener.unregister_combo("up");
            key_listener.unregister_combo("down");
        }
    },
    focus : function(){

    },
    render: function(){
        return (
            <div className='col-md-12 component'>
                <div className='row'>
                <table id="table" className="table table-hover">
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
                                    return <th key={index}>{item}</th>;
                                }.bind(this))
                            }
                        </tr>
                    </thead>
                        <tbody className = "table-scroll">
                            {this.state.chunk.map(function(item, index){
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
