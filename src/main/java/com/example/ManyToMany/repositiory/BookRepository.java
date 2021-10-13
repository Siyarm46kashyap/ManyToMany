package com.example.ManyToMany.repositiory;

import com.example.ManyToMany.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
