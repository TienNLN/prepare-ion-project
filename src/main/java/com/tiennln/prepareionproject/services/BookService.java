package com.tiennln.prepareionproject.services;

import com.tiennln.prepareionproject.entities.Book;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    @Async
    Book GetBookById(String id);

    @Async
    List<Book> GetAll();

    @Async
    List<Book> GetAllBookByCustomerId(String customerId);
}
