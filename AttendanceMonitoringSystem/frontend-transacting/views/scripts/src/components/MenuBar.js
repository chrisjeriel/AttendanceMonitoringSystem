'use strict';

var React = require('react');

var MenuBar = React.createClass({
    render: function(){
        return (
            <div className='panel-body app-header'>
                <div className='row col-md-12'>
                    <div className='col-md-2'>
                        <div>
                        <button className = 'buttons' type='button'><mark className = "bgcolor"><b>U</b></mark>tility</button>
                        </div>
                    </div>
                    <div className='menuadjust1 col-md-2'>
                        <button className = 'buttons'  type='button'><mark className = "bgcolor"><b>T</b></mark>ransaction</button>
                    </div>
                    <div className='menuadjust2 col-md-2'>
                        <button className = 'buttons'  type='button'><mark className = "bgcolor"><b>I</b></mark>nquiry</button>
                    </div>
                    <div className='menuadjust3 col-md-2'>
                        <button className = 'buttons'  type='button'><mark className = "bgcolor"><b>R</b></mark>eports</button>
                    </div>
                    <div className='menuadjust4 col-md-2'>
                        <button  className = 'buttons' type='button'><mark className = "bgcolor"><b>Q</b></mark>uit</button>
                    </div>
                </div>
            </div>
        );
    }
});

module.exports = MenuBar;
