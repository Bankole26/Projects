package com.example.restservice.bin.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice.bin.models.BankCustomer;
import com.example.restservice.bin.repo.BankCustomerRepo;


@Service
public class BankCustomerService {
	
	
	
	    @Autowired
	    BankCustomerRepo bankCustomerRepo;
	    @Autowired
	    BankCustomer bankCustomer;
	    
	    public List<BankCustomer> getAllPersons() {
	        List<BankCustomer> persons = new ArrayList<BankCustomer>();
	        bankCustomerRepo.findAll().forEach(person -> persons.add(person));
	        return persons;
	    }

	    public BankCustomer getPersonById(int id) {
	        return bankCustomerRepo.findById(id).get();
	    }

	    public void saveOrUpdate(BankCustomer person) {
	    	bankCustomerRepo.save(person);
	    }

	    public void delete(int id) {
	    	bankCustomerRepo.deleteById(id);
	    }
	    public int updateDepositAmount(int id,int amount) {
	    	int v = bankCustomerRepo.findById(id).get().getAmount();
	    	bankCustomerRepo.findById(id).get().setAmount(v+amount);
			return v;
	    	
	    }
	
	public int createBankCustomer(String accNo,String name,int amount) {
		bankCustomer.setAccNo(accNo);
		bankCustomer.setName(name);
		bankCustomer.setAmount(amount);
	 	bankCustomerRepo.save(bankCustomer);
	 	bankCustomer.getId();
	    return bankCustomer.getId();
	
	}

}
