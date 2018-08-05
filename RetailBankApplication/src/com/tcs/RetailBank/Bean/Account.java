package com.tcs.RetailBank.Bean;

public class Account {

	private int customerid;
	private String accounttype;
	private long balance;
	private String crdate;
	private String crlastdate;
	private long duration;
	private String status;
	private long accountid;

	public long getAccountid() {
		return accountid;
	}

	public void setAccountid(long accountid) {
		this.accountid = accountid;
	}

	public Account(int customerid, String accounttype,
			long balance, String crdate, String crlastdate, long duration,
			String status) {
		super();
		this.customerid = customerid;
		this.accounttype = accounttype;
		this.balance = balance;
		this.crdate = crdate;
		this.crlastdate = crlastdate;
		this.duration = duration;
		this.status = status;
	}
	
	
	
	


	public Account(int customerid, String accounttype, long balance,String status) {
		super();
		this.customerid = customerid;
		this.accounttype = accounttype;
		this.balance = balance;
		this.status = status;
	}


	public Account() {
		// TODO Auto-generated constructor stub
	}






	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getCrdate() {
		return crdate;
	}
	public void setCrdate(String crdate) {
		this.crdate = crdate;
	}
	public String getCrlastdate() {
		return crlastdate;
	}
	public void setCrlastdate(String crlastdate) {
		this.crlastdate = crlastdate;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
