'use strict';

var React = require('react');

var dropDown_Utility = React.createClass({
    render: function(){
        return (
            <div className='dropdown'>
                <button class="dropbtn">Dropdown</button>
                <div class="dropdown-content">
                    <a href="#">Link 1</a>
                    <a href="#">Link 2</a>
                    <a href="#">Link 3</a>
                </div>
            </div>
        )
    }
});

module.exports = dropDown_Utility ;
