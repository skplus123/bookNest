package com.springboot.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.springboot.model.Books;
import com.springboot.springboot.service.BooksService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//mark class as Controller

@RestController
public class BooksController {
    //autowire the BooksService class
    @Autowired
    BooksService booksService;
    private static final Logger logger = LoggerFactory.getLogger(BooksController.class);

    @GetMapping("/test")
    public String testEndpoint() {
        return "Test endpoint working!";
    }

    //creating a get mapping that retrieves all the books detail from the database
    @GetMapping("/books")
    private List<Books> getAllBooks() {
        logger.info("service call started");
        return booksService.getAllBooks();
    }

    //creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/books/{bookid}")
    private Books getBooks(@PathVariable("bookid") int bookid) {
        return booksService.getBooksById(bookid);
    }

    //creating a delete mapping that deletes a specified book
    @DeleteMapping("/books/{bookid}")
    private void deleteBook(@PathVariable("bookid") int bookid) {
        booksService.delete(bookid);
    }

    //creating post mapping that post the book detail in the database
    @PostMapping("/books")
    private int saveBook(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books.getBookid();
    }

    //creating put mapping that updates the book detail
    @PutMapping("/books")
    private Books update(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books;
    }
}

