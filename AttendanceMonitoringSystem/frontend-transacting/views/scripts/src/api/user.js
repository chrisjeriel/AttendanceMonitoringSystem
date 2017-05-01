'use strict';

var config = require('../config/config');
var request = require('superagent');
var prefix = require('superagent-prefix')(config.backend_url);

exports.login = function (data, callback) {
    function start () {
        request.post('/api/login')
            .use(prefix)
            .send(data)
            .end(callback);
    }

    start();
};
