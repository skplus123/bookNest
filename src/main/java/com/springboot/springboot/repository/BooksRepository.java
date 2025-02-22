package com.springboot.springboot.repository;

import com.springboot.springboot.model.Books;
import org.springframework.data.repository.CrudRepository;

//repository that extends CrudRepository
public interface BooksRepository extends CrudRepository<Books, Integer> {
}
