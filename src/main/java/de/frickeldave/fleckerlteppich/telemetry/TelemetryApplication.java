package de.frickeldave.fleckerlteppich.telemetry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TelemetryApplication {

	public static void main(String[] args) {

		SpringApplication.run(TelemetryApplication.class, args);

		//LAST THING TO DO: 
		// Wie starte ich die Applikation als Test, damit auch die H2 maven dependency mit
		// der Notation <scope>test</scope> gestartet werden kann. 
		// Wenn ich das rausgefunden habe, muss der Blog Artikel noch mal angepasst werden. 
	}

}
