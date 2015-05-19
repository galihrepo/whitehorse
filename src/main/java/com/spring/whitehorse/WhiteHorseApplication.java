package com.spring.whitehorse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing	// used for automatic create date and modified date in Person.java
public class WhiteHorseApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhiteHorseApplication.class, args);
    }
}
