package com.tiennln.prepareionproject.controllers;

import com.tiennln.prepareionproject.entities.Customer;
import com.tiennln.prepareionproject.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> GetAllCustomer() {
        List<Customer> targetCustomers = customerService.getAll();

        targetCustomers.stream().forEach(System.out::println);
        return new ResponseEntity<List<Customer>>(targetCustomers, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> GetById(@PathVariable String id) {
        Customer targetCustomer = customerService.getById(id);

        return new ResponseEntity<Customer>(targetCustomer, HttpStatus.OK);
    }
}
