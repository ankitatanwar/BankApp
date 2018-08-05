package com.tcs.RetailBank.Service;
import java.util.ArrayList;

import com.tcs.RetailBank.Bean.Account;
import com.tcs.RetailBank.Bean.LoginBean;
import com.tcs.RetailBank.Bean.ManageCustomerBean;
import com.tcs.RetailBank.Bean.Transaction;
import com.tcs.RetailBank.DAO.RetailBankDao;
public class BankService {
private RetailBankDao rbd = new RetailBankDao();
	
	public boolean LoginProcess(LoginBean lb)
	{ 
		System.out.println("In ser");
		return rbd.userlogin(lb);
		
	}	
	
	public boolean manageCustomerStatus(ManageCustomerBean managecustomerbean){
		boolean res=rbd.managecustomer(managecustomerbean);
		if(res==false)
		{
			return false;
		}
		else
			return true;
	}
	
	public ArrayList<ManageCustomerBean> checkSSNID(int ssnid){
		System.out.println("Calling dao");
		return rbd.checkSSNID(ssnid);
		
	}
	
	public ArrayList<ManageCustomerBean> checkCustID(int cusid){
		System.out.println("Calling dao");
		return rbd.checkCustID(cusid);
		
	}
	public boolean update(int ssnid,String name, int age, String addressline1, String addressline2 )
	{
		return rbd.updatecustomer(ssnid,name,age,addressline1, addressline2 );
		
	}


	public int addAccount(Account ac) {
	
	return rbd.addAccount(ac);
}
	
	public ArrayList<Integer> getCustomerByCustomerId(String custid) {
		// TODO Auto-generated method stub
		return rbd.getCustomerByCustomerId(custid);
	}
	public ArrayList<Account> getCustomerByAccountId(int accountid) {
		// TODO Auto-generated method stub
		return rbd.getCustomerByAccountId(accountid);
	}
	public long withdraw(int accountid, long balance) {
		// TODO Auto-generated method stub
		return rbd.withdraw(accountid,balance);
	}
	/*public ArrayList<ManageCustomerBean> getAllCustomers(){
		  return rbd.getAllCustomers();
	}
*/

	/*public boolean actdeactCustomer(int ssnid) {
		// TODO Auto-generated method stub
		return rbd.activate_deactivateCustomer(ssnid);
	}*/
	
	/*Cashier*/
	
	public ArrayList<Integer> accdisplay(int custid)
	{
		return rbd.accdisplay(custid);
	}
	public ArrayList<Account> accdetails(int accid)
	{
		return rbd.accdetails(accid);
	}
	public boolean updatebal(int accid,float depamt)
	{
		return rbd.updatebal(accid, depamt);
	}
	public boolean withdrawbal(int accid,float withamt)
	{
		return rbd.withdrawbal(accid, withamt);
	}
	public boolean transaction(int accid,String acctype,Float amount,String sacctype,String tacctype,String transactype)
	{
		return rbd.transaction(accid, acctype, amount, sacctype, tacctype, transactype);
	}
	public boolean updatebalt(int accid,float depamt,String acctype)
	{
		return rbd.updatebalt(accid, depamt,acctype);
	}
	public boolean deletebalt(int accid,float withdrawamt,String acctype)
	{
		return rbd.deletebalt(accid, withdrawamt,acctype);
	}
	public ArrayList<Transaction> statement(int id)
	{
		return rbd.statement(id);
	}
	}



