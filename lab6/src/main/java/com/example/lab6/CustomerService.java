package com.example.lab6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {

    
    @Autowired    
    private CustomerRepository repository;

    @Override
    public List<Customer> findAll() {

        return (List<Customer>) repository.findAll();
    }
}
