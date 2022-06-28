package com.tiennln.prepareionproject.services;

import com.tiennln.prepareionproject.entities.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAll();

    Customer getById(String id);

    List<Customer> getByNameContains(String searchValue);
}
