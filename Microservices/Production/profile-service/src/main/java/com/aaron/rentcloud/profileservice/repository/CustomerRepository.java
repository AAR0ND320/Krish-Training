package com.aaron.rentcloud.profileservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aaron.rentcloud.commons.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
