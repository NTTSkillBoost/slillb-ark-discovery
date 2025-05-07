package br.com.bitsincloud.arkdiscovery.arkdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ArkDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArkDiscoveryApplication.class, args);
	}

}
