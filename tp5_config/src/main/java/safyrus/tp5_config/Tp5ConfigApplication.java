package safyrus.tp5_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Tp5ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp5ConfigApplication.class, args);
	}

}
