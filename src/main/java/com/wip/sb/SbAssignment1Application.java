package com.wip.sb;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SbAssignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(SbAssignment1Application.class, args);
	}

	 @Bean
	public CommandLineRunner getBeans(ApplicationContext ctx) {
		return args -> {
					String[] allBeans = ctx.getBeanDefinitionNames();
					System.out.println("All Default Beans created from Spring Boot as follows : ");

					Arrays.sort(allBeans);

					for(String eachBean : allBeans) {
						System.out.println(eachBean);
					}
		};
	} 
	
}
