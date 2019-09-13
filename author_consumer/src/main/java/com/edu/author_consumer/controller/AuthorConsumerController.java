package com.edu.author_consumer.controller;

import com.edu.author_consumer.dto.LibraryFeignClient;
import com.edu.author_consumer.model.Author;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AuthorConsumerController {

    private LibraryFeignClient libraryFeignClient;

    @GetMapping("/author/{authorID}")
    public Author findAuthor(@PathVariable("authorID") Long authorID){
        return libraryFeignClient.findAuthor(authorID);
    }

}
