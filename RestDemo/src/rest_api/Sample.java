package rest_api;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
@Path("/sample")
public class Sample {
	//@Path("/rests")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String myMsg()
	{	String str="Hey Siddharth";
		return str;
		
	}
	
}