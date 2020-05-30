package com.example.restservice.bin.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.restservice.bin.models.BankCustomer;

public interface BankCustomerRepo extends CrudRepository<BankCustomer, Integer> {}
