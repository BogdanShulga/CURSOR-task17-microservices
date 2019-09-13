package com.edu.library_server.service;

import com.edu.library_server.models.Author;

public interface AuthorService {
    void saveAuthor(Author author);

    Author findAuthor(Long authorID);

    void deleteAuthor(Long authorID);
}
