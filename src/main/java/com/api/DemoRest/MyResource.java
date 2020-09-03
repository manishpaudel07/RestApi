package com.api.DemoRest;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MyResource {

	StudentRepository repository=new StudentRepository();
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@GET
	public List<Students> getStudents()
	{

		return repository.getStudents();
	}
	
	@POST
	@Path("student")
	public Students createStudent( Students students)
	{
		System.out.println(students);
		 repository.createStudent(students);
		 return students;
	}
	
	@GET
	@Path("student/{id}")
	public Students getStudent(@PathParam("id")int id)
	{
		return repository.getOneStudent(id);
	}
	
	@PUT
	@Path("student/{id}")
	public Students updateStudent(@PathParam("id") int id, Students student)
	{
		student.setStudentId(id);
		return repository.updateMessage(student);
	}
}
