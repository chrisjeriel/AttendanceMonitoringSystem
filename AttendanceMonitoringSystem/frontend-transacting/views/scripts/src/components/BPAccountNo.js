'use strict';

var React = require('react');

var BPAccountNo = React.createClass({
    handleChange: function(event){
        if (this.props.callback) {
            this.props.callback(event.target.value);
        }
    },
    render: function(){
        return (
            <div className='col-md-6 component'>
                <div className='row'>
                    <label className='col-md-4'>BP Account No.</label>
                    <label className='col-md-1'>:</label>
                    <div className='col-md-7'>
                        <label>[</label>
                        {' '}
                        <input type='text' maxLength='1' size='3' />
                        {' '}
                        <label>-</label>
                        {' '}
                        <input type='text' maxLength='3' size='5' />
                        {' '}
                        <label>-</label>
                        {' '}
                        <input type='text' maxLength='8' size='10' onChange={this.handleChange}/>
                        {' '}
                        <label>]</label>
                    </div>
                </div>
            </div>
        );
    }
});

module.exports = BPAccountNo;
