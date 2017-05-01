package com.seerlabs.resource;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class ResourceLoader extends Application{
	@Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<Class<?>>();

        // register root resource
        classes.add(RestResource.class);
        return classes;
    }
}
