'use strict';

var ajax = require('../ajax');
var config = require('../config');
var AppConstants = require('../AppConstants');

exports.login = function (data, success, fail) {
	if(AppConstants.MOCK_DATA){
		var flag = true;

		if(flag){
			if(success){
				success({
					success: true
				});
			}
		}else{
			if(fail){
				fail({
					success: false
				});
			}
		}
	}else{
	    return ajax('POST', config.backend_url + '/login', JSON.stringify(data), success, fail);
	}
}
exports.password = function(data, success, fail){
	if(AppConstants.MOCK_DATA){
		return ajax('POST', config.backend_url + '', data, success, fail);
	}else{
	  return ajax('POST',config.backend_url + '/password' , data, success, fail);
  	}
}
