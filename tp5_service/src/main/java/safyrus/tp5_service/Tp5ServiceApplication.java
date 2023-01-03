package safyrus.tp5_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Tp5ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp5ServiceApplication.class, args);
	}

}
