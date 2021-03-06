'use strict';

var ajax = require('../ajax');
var config = require('../config');
var AppConstants = require('../AppConstants')

exports.getList = function (){
	if(AppConstants.MOCK_DATA){
		return ajax('GET', config.backend_url + '');
	}else{
		return ajax('GET',config.backend_url + '');
	}
}
exports.Delete = function (data) {
	if(AppConstants.MOCK_DATA){
		return ajax('POST', config.backend_url + '', data);
	}else{
    return ajax('POST', config.backend_url + '/process/transacting_unit_maintenance/delete', data);
	}
}
exports.Add = function(data){
	if(AppConstants.MOCK_DATA){
		return ajax('POST', config.backend_url + '', data);
	}else{
		return ajax('POST', config.backend_url + '/process/transacting_unit_maintenance/add',data);
	}
}
exports.Modify = function(data){
	if(AppConstants.MOCK_DATA){
		return ajax('POST', config.backend_url + '', data);
	}else{
		return	ajax('POST', config.backend_url + '/process/transacting_unit_maintenance/modify',data);
	}
}
