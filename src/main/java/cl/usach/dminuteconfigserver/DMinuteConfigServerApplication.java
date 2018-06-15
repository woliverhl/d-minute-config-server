package cl.usach.dminuteconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DMinuteConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DMinuteConfigServerApplication.class, args);
	}
}
