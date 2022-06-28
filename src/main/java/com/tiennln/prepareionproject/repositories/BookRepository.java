package com.tiennln.prepareionproject.repositories;

import com.tiennln.prepareionproject.entities.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, String> {
    List<Book> findAllByCustomerId(String customerId);
}
