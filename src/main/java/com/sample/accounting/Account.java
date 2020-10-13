package com.sample.accounting;

/*
 * There are 2 fields that are required to model an account: The accountNo that is its identifier and the balance that is 
 * amount that the account holds.
 */
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
