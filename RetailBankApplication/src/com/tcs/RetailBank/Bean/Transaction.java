package com.tcs.RetailBank.Bean;

import java.util.Date;

public class Transaction {

	private int transactionid;
	private int customerid;
	public String getTransactiondescription() {
		return transactiondescription;
	}
	public void setTransactiondescription(String transactiondescription) {
		this.transactiondescription = transactiondescription;
	}
	private String transactiondescription;
	private int accid;
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	private String accounttype;
	private float amount;
	private Date transactiondate;
	private String sourceacctype;
	private String targetacctype;
	private String transaction_type;
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
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
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Date getTransactiondate() {
		return transactiondate;
	}
	public void setTransactiondate(Date transactiondate) {
		this.transactiondate = transactiondate;
	}
	public String getSourceacctype() {
		return sourceacctype;
	}
	public void setSourceacctype(String sourceacctype) {
		this.sourceacctype = sourceacctype;
	}
	public String getTargetacctype() {
		return targetacctype;
	}
	public void setTargetacctype(String targetacctype) {
		this.targetacctype = targetacctype;
	}
	
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	public Transaction() {
		super();
	}
	public Transaction(int transactionid, int customerid, String accounttype, float amount, Date transactiondate,
			String sourceacctype, String targetacctype) {
		super();
		this.transactionid = transactionid;
		this.customerid = customerid;
		this.accounttype = accounttype;
		this.amount = amount;
		this.transactiondate = transactiondate;
		this.sourceacctype = sourceacctype;
		this.targetacctype = targetacctype;
	}
	
}
