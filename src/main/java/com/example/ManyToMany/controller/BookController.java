package com.example.ManyToMany.controller;

import com.example.ManyToMany.entity.Book;
import com.example.ManyToMany.repositiory.BookRepository;
import com.example.ManyToMany.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    BookService bookService;

    @GetMapping("/book")
    public List<Book> getAllBook() {
        return this.bookService.getAll();
    }

    @PostMapping("/book")
    public Book createBook(@RequestBody Book book) {
        return this.bookService.createBook(book);
    }

}
