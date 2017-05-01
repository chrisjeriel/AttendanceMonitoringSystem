var Auth = {
	isLoggedIn: function() {
	    if (!store.enabled) {
	        alert('Local storage is not supported by your browser. Please disable "Private Mode", or upgrade to a modern browser.')
	        return
	    }

	    return !!store.get('bpiBPLogin');
	},
	login: function(token, callback) {
	    if (!store.enabled) {
	        alert('Local storage is not supported by your browser. Please disable "Private Mode", or upgrade to a modern browser.')
	        return
	    }

	    var status = store.set('bpiBPLogin', token);

	    if(callback){
	    	callback(status);
	    }
	},
	getToken: function() {
	    if (!store.enabled) {
	        alert('Local storage is not supported by your browser. Please disable "Private Mode", or upgrade to a modern browser.')
	        return
	    }

	    return store.get('bpiBPLogin');
	},
	logout: function(callback) {
	    if (!store.enabled) {
	        alert('Local storage is not supported by your browser. Please disable "Private Mode", or upgrade to a modern browser.')
	        return
	    }

	    var status = store.remove('bpiBPLogin');
	    if(callback){
	    	callback(status);
				console.log("Logged out.")
	    }
	}
};

module.exports = Auth;
