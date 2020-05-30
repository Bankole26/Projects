package com.example.restservice.bin.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class BankCustomer {
	
	
	
	
	private String accNo;
	private String name;
	private int amount;
	@Id
	@GeneratedValue
	private int id;
	
	
	public BankCustomer(String accNo1,String name1,int amount1) {
		this.accNo=accNo1;
		this.name= name1;
		this.amount=amount1;
		
				
	}
	
	
	
	@Override
	public String toString() {
		return "BankCustomer [accNo=" + accNo + ", name=" + name + ", amount=" + amount + ", id=" + id + "]";
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	
}
