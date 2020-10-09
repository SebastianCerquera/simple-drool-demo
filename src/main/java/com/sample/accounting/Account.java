package com.sample.accounting;

public class Account {

	private Integer accountNo;
	
	private Double balance;
	
	public Account() {}
	
	public Account(Integer accountNo, Double balance) {
		this.balance = balance;
		this.accountNo = accountNo;
	}
	
	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}
	
}
