package br.com.dextraining.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hellors")
public class HelloRS {

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response hello() {
		return Response.ok("{ \"Hello\": \"World\"}").build();
	}
}












