package io.forest.azure.webapp;

import java.time.LocalDateTime;

import jakarta.json.bind.annotation.JsonbProperty;

public record HealthRecord(@JsonbProperty("status") Status status, @JsonbProperty("dateTime") LocalDateTime datetime) {

	public enum Status {
		OK;
	}
}
