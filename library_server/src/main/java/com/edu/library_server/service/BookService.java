package com.edu.library_server.service;

import com.edu.library_server.models.Book;

public interface BookService {
    void saveBook(Book book);

    Book findBook(Long bookID);

    void deleteBook(Long bookID);
}
