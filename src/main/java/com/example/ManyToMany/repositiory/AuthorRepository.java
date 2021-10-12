package com.example.ManyToMany.repositiory;

import com.example.ManyToMany.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
