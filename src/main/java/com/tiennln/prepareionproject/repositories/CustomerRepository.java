package com.tiennln.prepareionproject.repositories;

import com.tiennln.prepareionproject.entities.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, String> {
}
