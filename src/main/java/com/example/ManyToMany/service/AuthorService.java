package com.example.ManyToMany.service;

import com.example.ManyToMany.entity.Author;
import com.example.ManyToMany.repositiory.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;
    public List<Author> getAll() {
        return this.authorRepository.findAll();
    }

    public Author createAuthor(Author author) {
        return this.authorRepository.save(author);
    }
}
