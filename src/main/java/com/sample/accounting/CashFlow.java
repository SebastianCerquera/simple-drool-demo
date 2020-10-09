package com.sample.accounting;

import java.util.Date;

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
