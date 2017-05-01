'use strict';

var API = require('./api');

//callback(err)
exports.checkStore = function (callback) {
    if (!store.enabled) {
        alert('Local storage is not supported by your browser. Please disable "Private Mode", or upgrade to a modern browser.');
        return callback(true);
    }

    return callback();
};

exports.strIsEmpty = function(str){
    if (!str || /^\s*$/.test(str)){
    	if(!str || 0 === str.length){
    		return true;
    	}
    }
    return false;
}

exports.decimalNumber = function(str){
    var num = str.replace(/^0+/,'').replace(/(\d)(?=(\d{3})+(?!\d))/g,"$1,");
    if(num.length <= 3 && num.charAt(0) === "."){
        return  "0"+num; 
    }else if(num === "0"){
        return "0";
    }else{
        return num;
    }
}

exports.removeLeadingZeros = function(str){
    return str.replace(/^0+/g,'');
}

exports.removeCommas = function(str){
    return str.replace(/\,/g,'');
}

exports.getDecimalPlaces = function(num){
    var match = (''+num).match(/(?:\.(\d+))?(?:[eE]([+-]?\d+))?$/);
    if(! match){
        return 0;
    }
    return Math.max(
        0,
        (match[1] ? match[1].length : 0) - (match[2] ? match[2] : 0)
    );
}

exports.checkIfNumerical = function(num){ //period included
    var dot = (num.match(/\./g) || []).length;
    num = num.replace(/\./g,'');
    num = num.replace(/\,/g,'');
    var match = num.match(/\D+/);
    return (dot<=1 && match==null);
}