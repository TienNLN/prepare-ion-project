package com.tiennln.prepareionproject.services;

import com.tiennln.prepareionproject.entities.Book;
import com.tiennln.prepareionproject.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book GetBookById(String id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public List<Book> GetAll() {
        Iterable<Book> books = bookRepository.findAll();

        List<Book> response = new ArrayList<>();

        books.forEach(response::add);

        return response;
    }

    @Override
    public List<Book> GetAllBookByCustomerId(String customerId) {
        return bookRepository.findAllByCustomerId(customerId);
    }
}
