package com.edu.book_consumer.dto;

import com.edu.book_consumer.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "library-service")
public interface LibraryFeignClient {

    @GetMapping("/book/{bookID}")
    Book findAuthor(@PathVariable("bookID") Long authorID);
}
