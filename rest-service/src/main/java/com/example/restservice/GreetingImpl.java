package com.example.restservice;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingImpl {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	List<BankCustomer> customers = new ArrayList<BankCustomer>();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@PostMapping("/bankCustomer")
	public String bankCustomer(@RequestParam(value = "name") String name, @RequestParam(value = "accNo") String accNo,
			@RequestParam(value = "amount") int amount) {
		BankCustomer a = new BankCustomer(accNo, name, amount, accNo);
		customers.add(a);
		return a.toString();
	}

	@GetMapping("/allCustomers")
	public String allCustomers() {
		return customers.toString();

	}

	@PutMapping("/depositAmount")
	public int depositAmount(@RequestParam(value = "id") String id, @RequestParam(value = "amount") int amount) {

		int result = 0;
		Iterator itr = customers.iterator();
		while (itr.hasNext()) {
			BankCustomer x = (BankCustomer) itr.next();

			if (x.getId().equals(id) == true) {
				result = x.getAmount() + amount;
				x.setAmount(result);
			}
		}

		return result;
	}
	
	@PutMapping("/transferAmount")
	public int transferAmount(@RequestParam(value = "id") String id, @RequestParam(value = "amount") int amount) {

		int result = 0;
		Iterator itr = customers.iterator();
		
		while (itr.hasNext()) {
			BankCustomer x = (BankCustomer) itr.next();

			if (x.getId().equals(id) == true) {
				result = x.getAmount() + amount;
				x.setAmount(result);
			}
		}

		return result;
	}


	
	@RequestMapping(value = "/deleteBankCustomer", produces = "application/json", method = RequestMethod.DELETE)
	public void deletebankCustomer(@RequestParam(value = "id") String id) {

		BankCustomer x = new BankCustomer(id, id, 0, id);
		Iterator itr = customers.iterator();

		while (itr.hasNext()) {

			x = (BankCustomer) itr.next();

			if (x.getId().equals(id) == true) {
			}

		}
		customers.remove(x);


	}
}

/*
 * reformat customer toString 
 * create a function that allows you to transfer money from one account
 * to another

 */
