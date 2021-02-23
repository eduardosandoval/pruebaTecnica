package com.pruebatecnica.pruebaTecnica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@EnableAutoConfiguration
@EnableTransactionManagement
@Configuration
@EnableJpaRepositories(basePackages = {"com.pruebatecnica.repository"})
@EntityScan(basePackages = {"com.pruebatecnica.entity"})
@ComponentScan(basePackages = {"com.pruebatecnica.controller,com.pruebatecnica.service,com.pruebatecnica.impl,com.pruebatecnica.repository,com.pruebatecnica.dto"})
@SpringBootApplication
public class PruebaTecnicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaTecnicaApplication.class, args);
	}

}
