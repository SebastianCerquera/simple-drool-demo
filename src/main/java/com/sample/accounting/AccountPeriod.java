package com.sample.accounting;

import java.util.Date;

public class AccountPeriod {

	private Date start;
	
	private Date end;
	
	public AccountPeriod() {}
	
	public AccountPeriod(Date start, Date end) {
		this.start = start;
		this.end = end;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}
	
}
