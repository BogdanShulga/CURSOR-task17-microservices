package com.edu.library_server.service;

import com.edu.library_server.models.Author;
import com.edu.library_server.repository.AuthorRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepo authorRepo;

    @Override
    public void saveAuthor(Author author) {
        authorRepo.save(author);
    }

    @Override
    public Author findAuthor(Long authorID) {
        return authorRepo.findById(authorID).orElse(new Author());
    }

    @Override
    public void deleteAuthor(Long authorID) {
        authorRepo.deleteById(authorID);
    }
}
