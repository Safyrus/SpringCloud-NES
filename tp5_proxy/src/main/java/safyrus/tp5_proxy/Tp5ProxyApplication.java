package safyrus.tp5_proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Tp5ProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp5ProxyApplication.class, args);
	}

}
