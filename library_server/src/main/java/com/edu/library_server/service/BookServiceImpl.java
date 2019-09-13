package com.edu.library_server.service;

import com.edu.library_server.models.Book;
import com.edu.library_server.repository.BookRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepo bookRepo;

    @Override
    public void saveBook(Book book) {
        bookRepo.save(book);
    }


    @Override
    public Book findBook(Long bookID) {
        return bookRepo.findById(bookID).orElse(new Book());
    }

    @Override
    public void deleteBook(Long bookID) {
        bookRepo.deleteById(bookID);
    }
}
