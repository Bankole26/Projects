package com.example.restservice;

public class BankCustomer {

	private String accNo;
	private String name;
	private int amount;
	private String id;
	
	
	public BankCustomer(String accNo1,String name1,int amount1,String id1) {
		this.accNo=accNo1;
		this.name= name1;
		this.amount=amount1;
		this.id=id1;
				
	}
	
	
	
	@Override
	public String toString() {
		return "BankCustomer [accNo=" + accNo + ", name=" + name + ", amount=" + amount + ", id=" + id + "]";
	}

	public String getId() {
		return id;
	}



	public void setId(String id) {
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
