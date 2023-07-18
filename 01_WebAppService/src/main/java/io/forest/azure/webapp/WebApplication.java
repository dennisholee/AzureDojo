package io.forest.azure.webapp;

import jakarta.ws.rs.SeBootstrap;
import jakarta.ws.rs.SeBootstrap.Configuration;
import jakarta.ws.rs.core.Application;

public class WebApplication extends Application {

	public static void main(String args[]) throws InterruptedException {

		WebApplication app = new WebApplication();

		Configuration configuration = SeBootstrap.Configuration.builder()
				.host("0.0.0.0")
				.port(80)
				.rootPath("")
				.protocol("HTTP")
				.build();

		SeBootstrap.start(app, configuration)
				.thenAccept(i -> {
					i.stopOnShutdown(stopResult -> stopResult.unwrap(Object.class));
					System.out.printf("\nBooty Duke running at %s\n", i.configuration()
							.baseUri());
					System.out.println("Send SIGKILL to shutdown.");
				});

		Thread.currentThread()
				.join();
	}
}
