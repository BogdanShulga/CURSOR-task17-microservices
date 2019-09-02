package com.edu.book_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BookConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookConsumerApplication.class, args);
    }

}
