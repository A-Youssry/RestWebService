package ws;

import entities.*;
import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("product")
public class ProductRestful {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/findall")
	public Response findAll()  {
	
		
		List<Product> result = new ArrayList<Product>();
		result.add(new Product("p01","Product 01",1000,2));
		result.add(new Product("p02","Product 02",2000,2));
		result.add(new Product("p03","Product 03",3000,2));
		result.add(new Product("p04","Product 04",4000,2));
		return Response.ok().entity(new GenericEntity<List<Product>>(result) {} )
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTIONS, HEAD")
				.build();
				
				
		
	}

}
