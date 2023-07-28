package io.forest.azure.webapp;

import java.net.URI;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.SeBootstrap;
import jakarta.ws.rs.SeBootstrap.Configuration;
import jakarta.ws.rs.core.Application;

@ApplicationPath("")
public class WebApplication extends Application {

	public static void main(String args[]) throws InterruptedException {

		Configuration configuration = SeBootstrap.Configuration.builder()
				.host("0.0.0.0")
				.port(80)
				.rootPath("")
				.protocol("HTTP")
				.build();

		SeBootstrap.start(WebApplication.class, configuration)
				.thenAccept(i -> {
					i.stopOnShutdown(stopResult -> stopResult.unwrap(Object.class));

					final URI uri = i.configuration()
							.baseUri();
					System.out.printf("Instance %s running at %s [Native handle: %s].%n", i, uri,
							i.unwrap(Object.class));
					

					System.out.println("Send SIGKILL to shutdown.");
				});

		Thread.currentThread()
				.join();
	}
}
