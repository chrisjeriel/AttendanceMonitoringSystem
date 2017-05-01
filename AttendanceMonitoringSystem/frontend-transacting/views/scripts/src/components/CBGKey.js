'use strict';

var React = require('react');

var CBGKey = React.createClass({
    propTypes: {
        display: React.PropTypes.string,
        keyLabel: React.PropTypes.string.isRequired,
        keyValue: React.PropTypes.string.isRequired,
        actionLabel: React.PropTypes.string.isRequired,
        action: React.PropTypes.func.isRequired,
        keyListener: React.PropTypes.object,
    },
    keyListener: function(event){
        // if((event.key.toLowerCase() == this.props.keyValue.toLowerCase()) && (document.activeElement == document.body)){
        //  if(this.props.action){
        //      this.props.action();
        //  }
        // }
    },
    getInitialState: function(){
        return ({keyListener : null})
    },
    componentDidMount: function() {
        window.addEventListener('keydown', this.keyListener);
        var callback = this.props.action;

        var keyCombo = {
            keys: this.props.keyValue.toLowerCase(),
            is_exclusive: true,
            on_keyup: function(e) {
                callback(e);
            }
        }

        this.props.keyListener.register_combo(keyCombo);
    },
    componentWillUnmount: function() {
        this.props.keyListener.unregister_combo(this.props.keyValue.toLowerCase())
    },
    render: function(){
        return (
            <div className={'col-md-3 component ' + this.state.display}>
                <div className='row'>
                    <label className='col-md-12'>[{this.props.keyLabel}] - {this.props.actionLabel}</label>
                </div>
            </div>
        );
    }
});

module.exports = CBGKey;
