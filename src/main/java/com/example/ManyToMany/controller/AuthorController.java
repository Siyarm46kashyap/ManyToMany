package com.example.ManyToMany.controller;

import com.example.ManyToMany.entity.Author;
import com.example.ManyToMany.repositiory.AuthorRepository;
import com.example.ManyToMany.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    AuthorService authorService;
    @GetMapping("/author")
    public List<Author> getAllAuthor() {
        return this.authorService.getAll();
    }
    @PostMapping("/author")
    public Author createAuthor(@RequestBody Author author){
        return this.authorService.createAuthor(author);
    }

}
