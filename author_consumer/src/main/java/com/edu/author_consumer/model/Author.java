package com.edu.author_consumer.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Author {
    private Long id;
    private String firstName;
    private String lastName;
    private String country;
    private int age;
}