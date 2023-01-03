package safyrus.tp5_discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Tp5DiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp5DiscoveryApplication.class, args);
	}

}
