package com.edu.book_consumer.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book {
    private Long id;
    private String title;
    private String genre;
    private String description;
    private int rate;
}