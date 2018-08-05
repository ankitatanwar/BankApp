package com.tcs.RetailBank.Bean;

public class ManageCustomerBean {
	private int ssnidaadhar;
	private int customer_id;
	private String name;
	private int age;
	private String addressline1;
	private String addressline2;
	private String city;
	private String state;
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getSsnid() {
		
		return ssnidaadhar;
	}
	public void setSsnid(int ssnid) {
		this.ssnidaadhar = ssnid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getAddressline2() {
		return addressline2;
	}
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public ManageCustomerBean(int ssnid,String name, int age,
			String addressline1, String addressline2, String city, String state) {
		super();
		this.ssnidaadhar = ssnid;
	
		this.name = name;
		this.age = age;
		this.addressline1 = addressline1;
		this.addressline2 = addressline2;
		this.city = city;
		this.state = state;
	}
	public ManageCustomerBean(int ssnid, int customer_id,String name, int age,
			String addressline1, String addressline2, String city, String state) {
		super();
		this.ssnidaadhar = ssnid;
		this.customer_id=customer_id;
		this.name = name;
		this.age = age;
		this.addressline1 = addressline1;
		this.addressline2 = addressline2;
		this.city = city;
		this.state = state;
	}
	public ManageCustomerBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
