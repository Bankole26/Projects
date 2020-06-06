package com.example.restservice.bin.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.bin.models.*;
import com.example.restservice.bin.services.BankCustomerService;

@RestController
public class Controller {

	
	@Autowired
	BankCustomerService customersService;

//	@GetMapping("/greeting")
//	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
//		return new Greeting(counter.incrementAndGet(), String.format(template, name));
//	}

//	@PostMapping("/bankCustomer")
//	public String bankCustomer(@RequestParam(value = "name") String name, @RequestParam(value = "accNo") String accNo,
//			@RequestParam(value = "amount") int amount,@RequestParam(value = "id") String id) {
//		BankCustomer a = new BankCustomer(accNo, name, amount,id);
//		customers.add(a);
//		return a.toString();
//	}

	@GetMapping("/allCustomers")
	//@RequestMapping(value = "/allCustomers", method = RequestMethod.GET, produces = { "application/json" })
    private List<BankCustomer> getAllPersons() {
        return customersService.getAllPersons();
    }

	
	@GetMapping("/customers/{id}")
    private BankCustomer getBankCustomer(@PathVariable("id")int id) {
        return customersService.getPersonById(id);
    }
	
	
	 //@DeleteMapping("/removeCustomers/{id}")
	 @RequestMapping(value = "/removeCustomers/{id}", method = RequestMethod.DELETE, produces = { "application/json" })
	    private void deleteCustomer(@PathVariable("id") int id) {
		 customersService.delete(id);
	    }
	 
	//@PostMapping("/createCustomers")
	 @RequestMapping(value = "/createCustomers", method = RequestMethod.POST, produces = { "application/json" })
	 public int bankCustomer(@RequestParam(value = "name") String name, @RequestParam(value = "accNo") String accNo,
			@RequestParam(value = "amount") int amount) {
		 	return customersService.createBankCustomer(accNo,name,amount);
		 
		    }
	 
	 @RequestMapping(value = "/updateDepositAmount", method = RequestMethod.PUT, produces = { "application/json" })
	 public int bankCustomer(@RequestParam(value = "amount") int amount,@RequestParam(value = "id") int id) {
		 return customersService.updateDepositAmount(id, amount);
	 }
}

	 
//	@PutMapping("/depositAmount")
//	public int depositAmount(@RequestParam(value = "id") String id, @RequestParam(value = "amount") int amount) {
//
//		int result = 0;
//		Iterator itr = customers.iterator();
//		while (itr.hasNext()) {
//			BankCustomer x = (BankCustomer) itr.next();
//
//			if (x.getId().equals(id) == true) {
//				result = x.getAmount() + amount;
//				x.setAmount(result);
//			}
//		}
//
//		return result;
//	}
//	
//	@PutMapping("/transferAmount")
//	public int transferAmount(@RequestParam(value = "id") String id, @RequestParam(value = "amount") int amount) {
//
//		int result = 0;
//		Iterator itr = customers.iterator();
//		
//		while (itr.hasNext()) {
//			BankCustomer x = (BankCustomer) itr.next();
//
//			if (x.getId().equals(id) == true) {
//				result = x.getAmount() + amount;
//				x.setAmount(result);
//			}
//		}
//
//		return result;
//	}
//
//
//	


/*
 * reformat customer toString 
 * create a function that allows you to transfer money from one account
 * to another

 */
