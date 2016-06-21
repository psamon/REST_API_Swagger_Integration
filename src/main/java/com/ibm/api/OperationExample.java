package com.ibm.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

 
@Path("/operate")
@Api
public class OperationExample {
 
	public static final String IMPLEMENTATION = "javaee_jax-rs";

	/**
	 * Maps to REST API http://localhost:8080/jax_rs/rest/hello/sanket
	 * @param msg "sanket"
	 * @return JSON object with "Jax-rs REST API : sanket"
	 * @see http://www.mkyong.com/webservices/jax-rs/jersey-hello-world-example/
	 */
	@GET
	@Path("/add/{left}/{right}")	
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "add operation", notes ="adds two integers")
	@ApiResponses(value={
			@ApiResponse(code=200, message="OK"),
			@ApiResponse(code=500, message="Something went wrong"),
	})
	public Result add(@PathParam("left") int left, @PathParam("right") int right) {
		Result p = new Result("" + (left + right));
		//return Response.status(200).entity(output).build();
		return p;
	}
 
}