package br.edu.univas.si8.ta.hello.rest.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/service")
public interface HelloService {

	@GET
	@Path("/say/{name}")
	@Produces(MediaType.TEXT_HTML)
	String sayHello(@PathParam("name") String name);

	@POST
	@Path("/sum")
	@Produces(MediaType.APPLICATION_JSON)
	Result sum(@FormParam("a") int a, @FormParam("b") int b);

}
