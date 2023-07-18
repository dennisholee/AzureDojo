package io.forest.azure.webapp;

import static io.forest.azure.webapp.HealthRecord.Status.OK;

import java.time.LocalDateTime;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/ping")
public class HealthResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public HealthRecord ping() {
		return new HealthRecord(OK, LocalDateTime.now());
	}
}
