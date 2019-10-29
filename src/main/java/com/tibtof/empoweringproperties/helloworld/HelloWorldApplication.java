package com.tibtof.empoweringproperties.helloworld;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class HelloWorldApplication {

    @Value("${message.greeting:Undefined}")
    private String message;


//    private final Message message;

    public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@Bean
	public ApplicationRunner sayHello() {
	    return args -> System.out.println(message);
    }
}
