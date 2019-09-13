package com.edu.library_server.controller;

import com.edu.library_server.models.Book;
import com.edu.library_server.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class BookController {
    private BookService bookService;

    @PostMapping("/book")
    public void saveAuthor(@RequestBody Book book) {
        bookService.saveBook(book);
    }

    @GetMapping("/book/{bookID}")
    public Book findAuthor(@PathVariable("bookID") Long authorID) {
        return bookService.findBook(authorID);
    }

    @DeleteMapping("/book/{bookID}")
    public void deleteAuthor(@PathVariable("bookID") Long authorID) {
        bookService.deleteBook(authorID);
    }
}
