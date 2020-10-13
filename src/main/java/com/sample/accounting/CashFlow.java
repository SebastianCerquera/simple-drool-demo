package com.sample.accounting;

import java.util.Date;

/*
 * This entity models each transaction perform over an account, each transaction requires an accountNo that identifies the account
 * an amount that is the value, a type that indicates if it is a DEBIT or a CREDIT and finally the date of the transaction. 
 */

public class CashFlow {
	
	private CashFlowType type;
	
	private Integer accountNo;
	
	private Date date;
	
	private Double amount;
	
	public CashFlow() {}
	
	public CashFlow(CashFlowType type, Integer accountNo, 
			Date date, Double amount) {
		this.type = type;
		this.accountNo = accountNo;
		this.date = date;
		this.amount = amount;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public CashFlowType getType() {
		return type;
	}

	public void setType(CashFlowType type) {
		this.type = type;
	}
	
	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
