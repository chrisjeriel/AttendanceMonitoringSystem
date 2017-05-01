'use strict';

var ajax = require('../ajax');
var config = require('../config');
var AppConstants = require('../AppConstants');

exports.process = function (data){
	if(AppConstants.MOCK_DATA){
		return ajax('GET', config.backend_url + '');
	}else{
		return ajax('GET',config.backend_url + '/process/application_code');
	}
}
