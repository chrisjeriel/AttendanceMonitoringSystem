
'use strict';

var ajax = require('../ajax');
var config = require('../config');
var AppConstants = require('../AppConstants');

exports.Display = function(data, success) {

    if(AppConstants.MOCK_DATA){
        return ajax('GET', config.backend_url + '', data, success);
    }else{
        return ajax('GET', config.backend_url + '/interbank/define-file/list', data, success);
    }
}