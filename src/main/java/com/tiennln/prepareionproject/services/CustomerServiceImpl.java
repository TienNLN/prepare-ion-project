package com.tiennln.prepareionproject.services;

import com.tiennln.prepareionproject.entities.Customer;
import com.tiennln.prepareionproject.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerServiceImpl() { }

    @Override
    public List<Customer> getAll() {
        Iterable<Customer> customers = customerRepository.findAll();

        List<Customer> response = new ArrayList<>();

        customers.forEach(response::add);

        return response;
    }

    @Override
    public Customer getById(String id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> getByNameContains(String searchValue) {
        return null;
    }
}
