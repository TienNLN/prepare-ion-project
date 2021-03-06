package com.tiennln.prepareionproject.controllers;

import com.tiennln.prepareionproject.entities.Book;
import com.tiennln.prepareionproject.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> GetAll() {
        List<Book> response = bookService.GetAll();

        return new ResponseEntity<List<Book>>(response, HttpStatus.OK);
    }
}
