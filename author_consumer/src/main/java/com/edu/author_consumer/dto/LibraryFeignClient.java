package com.edu.author_consumer.dto;

import com.edu.author_consumer.model.Author;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "library-service")
public interface LibraryFeignClient {

    @GetMapping("/find_author/{authorID}")
    Author findAuthor(@PathVariable("authorID") Long authorID);
}
