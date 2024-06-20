package com.hafnium.customer.service;

import com.hafnium.customer.model.Customer;
import com.hafnium.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {
    private final CustomerRepository customerRepository;
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    public List<Customer> allCustomer() {
        return customerRepository.findAll();
    }

    public Customer getCustomerFindById(Long id) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isPresent()) {
            return optionalCustomer.get();
        }else {
            log.info("Customer not found");
            return null;
        }
    }
    public String updateFirstName(Long id, Customer customer) {

        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isPresent()) {
            Customer existingCustomer = optionalCustomer.get();
            existingCustomer.setFirstName(customer.getFirstName());
            customerRepository.save(existingCustomer);
            return "Customer updated successfully";
        }
        return  null;
    }
}
