package com.seerlabs.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class RestResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayTest(){
		return "Tested.";
	}
	
}
