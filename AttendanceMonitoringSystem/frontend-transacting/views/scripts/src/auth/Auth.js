'use strict';

var util = require('../helpers/util');

var Auth = {
    isLoggedIn: function() {
        function start () {
            return util.check_store(end);
        }

        function end () {
            return !!store.get('bpiBPLogin');
        }

        return start();
    },
    login: function(token, callback) {
        function start () {
            return util.check_store(end);
        }

        function end () {
            var status = store.set('bpiBPLogin', token);

            if (callback) {
                return callback(status);
            }
        }

        return start();
    },
    getToken: function() {
        function start () {
            return util.check_store(end);
        }

        function end () {
            return store.get('bpiBPLogin');
        }

        return start();
    },
    logout: function(callback) {
        function start () {
            return util.check_store(end);
        }

        function end () {
            var status = store.remove('bpiBPLogin');

            if (callback) {
                return callback(status);
            }
        }

        return start();
    }
};

module.exports = Auth;
