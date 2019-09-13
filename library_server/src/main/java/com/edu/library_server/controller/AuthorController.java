package com.edu.library_server.controller;

import com.edu.library_server.models.Author;
import com.edu.library_server.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class AuthorController {
    private AuthorService authorService;

    @PostMapping("/author")
    public void saveAuthor(@RequestBody Author author) {
        authorService.saveAuthor(author);
    }

    @GetMapping("/author/{authorID}")
    public Author findAuthor(@PathVariable("authorID") Long authorID) {
        return authorService.findAuthor(authorID);
    }

    @DeleteMapping("/author/{authorID}")
    public void deleteAuthor(@PathVariable("authorID") Long authorID) {
        authorService.deleteAuthor(authorID);
    }
}
