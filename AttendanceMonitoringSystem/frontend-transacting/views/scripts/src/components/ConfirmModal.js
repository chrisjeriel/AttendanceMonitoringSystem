'use strict';

var React = require('react');

var ConfirmModal = React.createClass({
    propTypes: {
        message: React.PropTypes.string
    },
    confirm: function (e) {
        e.preventDefault();

        if (e.target.innerText === (this.props.yes || 'Yes')) {
            return this.props.onConfirm(true);
        }

        this.props.onConfirm(false);
    },
    render: function(){
        return (
            <div className='panel-body-nomodal view-container-modal confirm_modal'>
                <div className='container-content-nomodal'>
                    <h5 className="text-center">{this.props.message}</h5>
                    <br/>
                    <div className="row">
                        <button type="button" onClick={this.confirm} className="btn btn-primary col-sm-offset-3 col-sm-2">
                            {this.props.yes || 'Yes'}
                        </button>
                        <button type="button" onClick={this.confirm} className="btn btn-default col-sm-offset-2 col-sm-2">
                            {this.props.no || 'No'}
                        </button>
                    </div>
                </div>
            </div>
        )
    }
});

module.exports = ConfirmModal;
