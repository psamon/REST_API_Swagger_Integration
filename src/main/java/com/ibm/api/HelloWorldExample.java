package com.ibm.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

 
@Path("/hello")
@Api
public class HelloWorldExample {
 

	
	@GET
	@Path("/world")	
	@ApiOperation(value = "say hello world, sanket", notes ="nothing else than sanket")
	@Produces(MediaType.TEXT_PLAIN)
	@ApiResponses(value={
			@ApiResponse(code=200, message="OK"),
			@ApiResponse(code=500, message="Something went wrong"),
	})
	public String getMsg1() {
		
		return "Hello World from " + Result.IMPLEMENTATION;
		
	}
	

 
}