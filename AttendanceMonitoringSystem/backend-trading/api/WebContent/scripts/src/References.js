
// var store = require('./store');
var API = require('./api');

var References = {

	// 0131 - VALID TRADING UNITS
	loadTables: function(callBack){

		API.sys_ref.sysref_get(
	        {
	            tCode: "0131"
	        },
	        function(data){
	            if(data.meta.code == 200 || data.meta.code == 0){
	                store.set('0131', data.data);
	                callBack();
	            }else{
	            	console.log("Error in loading referenceTable");
	            }  
	        }.bind(this),
	        function(data){
	        	console.log("Error in loading referenceTable");
	        }.bind(this)
	    );
	}

}



module.exports = References;