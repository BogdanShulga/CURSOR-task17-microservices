package com.edu.author_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AuthorConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthorConsumerApplication.class, args);
    }

}
