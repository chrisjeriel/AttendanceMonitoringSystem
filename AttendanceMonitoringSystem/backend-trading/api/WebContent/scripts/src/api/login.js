'use strict';

var ajax = require('../ajax');
var config = require('../config');

exports.login = function(data,success,fail){
  return ajax('GET', config.backend_url,data,success,fail)
}

exports.logout = function(success,fail){
  return ajax('POST', config.backend_url,null,success,fail)
}

exports.changePassword = function(data,success,fail){
  return ajax('GET', config.backend_url,data,success,fail)
}
