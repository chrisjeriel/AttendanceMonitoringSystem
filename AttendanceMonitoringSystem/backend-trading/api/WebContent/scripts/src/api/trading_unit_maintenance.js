
'use strict';

var ajax = require('../ajax');
var config = require('../config');
var AppConstants = require('../AppConstants');

exports.getList = function (){
	return ajax('GET',config.backend_url + '');
}
exports.Delete = function (data) {
	if(AppConstants.MOCK_DATA){
		return ajax('POST', config.backend_url + '', data);
	}else{
		return ajax('POST', config.backend_url + '/process/trading_unit_maintenance/delete', data);
	}
}
exports.Add = function(data){
	if(AppConstants.MOCK_DATA){
		return ajax('POST', config.backend_url + '', data);
	}else{
		return ajax('POST', config.backend_url + '/process/trading_unit_maintenance/add',data);
	}
}
exports.Modify = function(data){
	if(AppConstants.MOCK_DATA){
		return ajax('POST', config.backend_url + '', data);
	}else{
		return	ajax('POST', config.backend_url + '/process/trading_unit_maintenance/modify',data);
	}
}
