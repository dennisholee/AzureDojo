package io.forest.azure.webapp;

import java.time.LocalDateTime;

public record HealthRecord(Status status, LocalDateTime datetime) {

	public enum Status {
		OK;
	}
}
