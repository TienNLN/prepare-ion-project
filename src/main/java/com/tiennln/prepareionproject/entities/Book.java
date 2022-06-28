package com.tiennln.prepareionproject.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, columnDefinition = "uniqueidentifier", nullable = false)
    private String id;

    @Column(name = "name", unique = false, length = 50, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
