package com.api.DemoRest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("resources")
public class StudentsResource {

	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getStudents()
	{
		return"done";
	}
}
