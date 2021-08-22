package ol.sample;

import javax.ws.rs.core.Response;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Timed;

@RequestScoped
@Path("/res")
public class Resource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProperties() {
	    return Response.ok(System.getProperties()).build();
	}

}
