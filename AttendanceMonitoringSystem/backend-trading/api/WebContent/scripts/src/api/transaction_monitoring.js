
'use strict';

var ajax = require('../ajax');
var config = require('../config');
var AppConstants = require('../AppConstants')

exports.process = function (data) {
	if(AppConstants.MOCK_DATA){
		return ajax('POST', config.backend_url + '', data);
	}else{
    return ajax('POST', config.backend_url + '/process/transaction_monitoring', data);
  }
}
