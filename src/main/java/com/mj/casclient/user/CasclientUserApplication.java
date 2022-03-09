package com.mj.casclient.user;

import org.jasig.cas.client.boot.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableCasClient
public class CasclientUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasclientUserApplication.class, args);
	}

}
