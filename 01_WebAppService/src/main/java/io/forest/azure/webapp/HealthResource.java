package io.forest.azure.webapp;

import java.time.LocalDateTime;
import java.util.Map;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/ping")
public class HealthResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response ping() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		Map<String, String> payload = Map.of("foo1", "bar1", "foo2", "bar2");
		
		return Response.ok()
				//.entity(new HealthRecord(OK, now))
				.entity(payload)
				.build();
	}
}
