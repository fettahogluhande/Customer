package com.hafnium.customer.repository;

import com.hafnium.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <Customer,Long>{

}
