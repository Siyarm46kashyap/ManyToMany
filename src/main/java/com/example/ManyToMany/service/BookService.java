package com.example.ManyToMany.service;

import com.example.ManyToMany.entity.Book;
import com.example.ManyToMany.repositiory.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    Logger logger = LoggerFactory.getLogger(BookService.class);

    @Autowired
    BookRepository bookRepository;

    public List<Book> getAll() {
        return this.bookRepository.findAll();
    }

    public Book createBook(Book book) {
        logger.info(book.toString());
        return this.bookRepository.save(book);
    }

}
