package com.tcs.RetailBank.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.tcs.RetailBank.Bean.Account;
import com.tcs.RetailBank.Bean.LoginBean;
import com.tcs.RetailBank.Bean.ManageCustomerBean;
import com.tcs.RetailBank.Bean.Transaction;
import com.tcs.RetailBank.Util.Databaseutil;



public class RetailBankDao {
	
	public boolean userlogin(LoginBean lb)
	{
		Databaseutil db=new Databaseutil();
		Connection con=db.getConnection();
		boolean flag = false;
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			String uname=lb.getUsername();
			System.out.println(uname);
			ResultSet rs= stmt.executeQuery("Select * from LOGIN_GROUP3 where USERNAME='"+uname+"'");
		
			System.out.println(rs);
			while(rs.next())
			{
				System.out.println("while");
				if(rs.getString(2).equals(lb.getPassword()))
				{
					System.out.println("if");
					flag = true;
					return flag;
				}
				else
					System.out.println("else");
					flag = false;
					return flag;
			}
			
	return flag;
	}
	catch (SQLException e)
	{
		e.printStackTrace();
	}
	return flag;
		}

	public boolean managecustomer(ManageCustomerBean managecustomerbean) {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			Databaseutil db = new Databaseutil();
			Connection con = db.getConnection();
			PreparedStatement pst = null;
			Statement stm = null;
			String Query1 = "Insert into CUSTOMERTBL_GROUP3 values(?,CUSTOMERsequence_Group3.nextval,?,?,?,?,?,?,'Activated','C'||to_char(CUSTOMERsequence_Group3.nextval))";
			
			pst = con.prepareStatement(Query1);
			pst.setInt(1, managecustomerbean.getSsnid());
			pst.setString(2, managecustomerbean.getName());
			pst.setInt(3, managecustomerbean.getAge());
			pst.setString(4, managecustomerbean.getAddressline1());
			pst.setString(5, managecustomerbean.getAddressline2());
			pst.setString(6, managecustomerbean.getCity());
			pst.setString(7, managecustomerbean.getState());
			if (pst.executeUpdate() > 0)
			{
				flag = true;
				stm = con.createStatement();
				System.out.println("inserting in Login table");
				String sql = "Insert into LOGIN_GROUP3(USERNAME,PASSWORD) values('C'||to_char(CUSTOMERsequence_Group3.currval),'#PASS'||to_char(PASSWORDsequence_Group3.nextval))";
				int val = stm.executeUpdate(sql);
				System.out.println(val);
			    if(val>0)
			    {
			    	return flag;
			    }
				
			}
			else
			{
				flag = false;
				return flag;
			}
			return flag;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
		//return false;
	}
	
	public boolean updatecustomer(int ssnid,String name,int age,String addressline1,String addressline2)
	{

		boolean flag = false;
		try {
			Databaseutil db = new Databaseutil();
			Connection con = db.getConnection();
			String s = "Update customertbl_group3 set customer_name = '"+name+"',age = "+age+",address_line_1 = '"+addressline1+"',address_line_2 = '"+addressline2+"' where ssn_id="+ssnid;
			System.out.println(s);
			Statement stmt = con.createStatement();

			int i = stmt.executeUpdate(s);
			if (i > 0)
				flag = true;
			else
				flag = false;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	public ArrayList<ManageCustomerBean> checkSSNID(int ssnid){
		boolean flag = false;
		System.out.println(ssnid);
		 ArrayList<ManageCustomerBean> list = new ArrayList<ManageCustomerBean>();
		try {
			Databaseutil db = new Databaseutil();
			Connection con = db.getConnection();
			PreparedStatement pst = null;
			Statement st = null;
			st=con.createStatement();
			String sql1="Select * from customertbl_group3 where ssn_id = "+ssnid+"";
			System.out.println(sql1);
			ResultSet rs=st.executeQuery(sql1);
			System.out.println(rs);
			while(rs.next()){
				System.out.println("in while");
				ManageCustomerBean managecustomerbean=new ManageCustomerBean();
				managecustomerbean.setSsnid(rs.getInt(1));
				managecustomerbean.setCustomer_id(rs.getInt(2));
				managecustomerbean.setName(rs.getString(3));
				managecustomerbean.setAge(rs.getInt(4));
				managecustomerbean.setAddressline1(rs.getString(5));
				managecustomerbean.setAddressline2(rs.getString(6));
				managecustomerbean.setCity(rs.getString(7));
				managecustomerbean.setState(rs.getString(8));
				managecustomerbean.setStatus(rs.getString(9));
			
				list.add(managecustomerbean);
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<ManageCustomerBean> checkCustID(int cusid){
		boolean flag = false;
		System.out.println(cusid);
		 ArrayList<ManageCustomerBean> list = new ArrayList<ManageCustomerBean>();
		try {
			Databaseutil db = new Databaseutil();
			Connection con = db.getConnection();
			PreparedStatement pst = null;
			Statement st = null;
			st=con.createStatement();
			String sql1="Select * from customertbl_group3 where CUSTOMER_ID = "+cusid+"";
			System.out.println(sql1);
			ResultSet rs=st.executeQuery(sql1);
			System.out.println(rs);
			while(rs.next()){
				System.out.println("in while");
				ManageCustomerBean managecustomerbean=new ManageCustomerBean();
				managecustomerbean.setSsnid(rs.getInt(1));
				managecustomerbean.setCustomer_id(rs.getInt(2));
				managecustomerbean.setName(rs.getString(3));
				managecustomerbean.setAge(rs.getInt(4));
				managecustomerbean.setAddressline1(rs.getString(5));
				managecustomerbean.setAddressline2(rs.getString(6));
				managecustomerbean.setCity(rs.getString(7));
				managecustomerbean.setState(rs.getString(8));
				managecustomerbean.setStatus(rs.getString(9));
			
				list.add(managecustomerbean);
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}

	/*public  boolean activate_deactivateCustomer(int ssnid) {
		// TODO Auto-generated method stub
		boolean flag=false;
		 //ArrayList<ManageCustomerBean> list = new ArrayList<ManageCustomerBean>();
		try {
			Databaseutil db = new Databaseutil();
			Connection con = db.getConnection();
			PreparedStatement pst = null;
			Statement st = null;
			st=con.createStatement();
			String sql1="Select cust.status,account.status from customertbl_group3 cust,account_group3 account where account.customerid=cust.customer_id ";
			System.out.println(sql1);
			ResultSet rs=st.executeQuery(sql1);
			while(rs.next()){
				String account_status=rs.getString(2);
				System.out.println(account_status);
				if(account_status=="Activated"){
							flag=true;			
					return flag;
				}
				else
				{
					flag=false;
					return flag;
				}
			
			}
		}
			catch(SQLException e){
				e.printStackTrace();
			}
			
		
		
		return flag;
	}*/
		
	public ResultSet getAllCustomers()
	{
		ResultSet rs=null;
		try
		{
			Databaseutil db = new Databaseutil();
			Connection con = db.getConnection();
				PreparedStatement stmt1=con.prepareStatement("Select SSN_ID,CUSTOMER_ID,CUSTOMER_NAME,STATUS from CUSTOMERTBL_GROUP3");
				rs= stmt1.executeQuery();	
				//System.out.println(rs.getInt(1));
				return rs;
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return rs;
	}
	
	public static int addAccount(Account ac) {
		try
		{

			Databaseutil db = new Databaseutil();
			Connection con = db.getConnection();
				Statement stmt=con.createStatement();
				PreparedStatement pst=null;
				ResultSet rs=null;
				int flag=0;
				System.out.println("in dao class");
				String query="SELECT customerid,accounttype FROM ACCOUNT_GROUP3 GROUP BY customerid,accounttype";
				System.out.println(query);
				rs=stmt.executeQuery(query);
				System.out.println(rs);
				while(rs.next())
				{
					System.out.println("In while");
					if(rs.getInt(1)==ac.getCustomerid()&&(rs.getString(2).equalsIgnoreCase("Savings")||rs.getString(2).equalsIgnoreCase("Current")))
					{
						System.out.println("while- if");
						System.out.println(rs.getString(2));
						flag=1;
						System.out.println("flag: "+flag);
						return 2;
					}
				}
				System.out.println(flag);
				if(flag==0)
				{
				String Query1="Insert into ACCOUNT_GROUP3(ACCOUNTID,CUSTOMERID,ACCOUNTTYPE,BALANCE,DURATION,STATUS) values(ACCOUNT_SEQUENCE_GROUP3.nextval,?,?,?,?,?)";
				System.out.println(Query1);	
				
				pst=con.prepareStatement(Query1);
					pst.setInt(1,ac.getCustomerid());
					System.out.println(ac.getCustomerid());
					pst.setString(2,ac.getAccounttype());
					System.out.println(ac.getAccounttype());
					pst.setLong(3,ac.getBalance());
					System.out.println(ac.getBalance());
					/*pst.setString(4,null);
					pst.setString(5,null);*/
					pst.setInt(4,0);
					pst.setString(5,ac.getStatus());
					System.out.println(ac.getStatus());
					if(pst.executeUpdate()>0)
						return 1;
				}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return 0;	
		
	}

	public  ResultSet getAllAccounts()
	{
		ResultSet rs=null;
		try
		{
			Databaseutil db = new Databaseutil();
			Connection con = db.getConnection();
				PreparedStatement stmt1=con.prepareStatement("Select CUSTOMERID,ACCOUNTID,ACCOUNTTYPE,BALANCE,STATUS from ACCOUNT_GROUP3");
				rs= stmt1.executeQuery();	
				return rs;
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return rs;
	}
	public static void changeAccountStatus(int ssnid)
	{
		ResultSet rs=null;
		try
		{
			PreparedStatement pst=null;
			String status=null;	
			String Query2=null;
			Databaseutil db = new Databaseutil();
			Connection con = db.getConnection();
				Statement stmt=con.createStatement();
				rs= stmt.executeQuery("Select STATUS from ACCOUNT_GROUP3 where CUSTOMERID="+ssnid);	
				System.out.println(rs);
				System.out.println(ssnid);
				while(rs.next())
					
				status= rs.getString(1);
				System.out.println(status);
				if(status.equalsIgnoreCase("Activate"))
				{
					 Query2="update ACCOUNT_GROUP3 set status='deactivate' where CUSTOMERID ="+ssnid;
					 System.out.println(Query2);
				
				}
				else {
					 Query2="update ACCOUNT_GROUP3 set status='activate' where CUSTOMERID ="+ssnid;
					 System.out.println(Query2);
				}
				
				pst=con.prepareStatement(Query2);
				int i=pst.executeUpdate();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

		
	/*public ArrayList<ManageCustomerBean> getAllCustomers(){

		   Connection con = null;
		   PreparedStatement ps = null;
		   ResultSet rs = null;
		   ArrayList<ManageCustomerBean> list = new ArrayList<ManageCustomerBean>();
		   con = Databaseutil.getConnection();
		   try {
			ps = con.prepareStatement("select * from CUSTOMERTBL_GROUP3");
		    rs = ps.executeQuery();
		    while(rs.next()){
		    	
		    	ManageCustomerBean managecustomerbean=new ManageCustomerBean();
				managecustomerbean.setSsnid(rs.getInt(1));
				managecustomerbean.setCustomer_id(rs.getInt(2));
				managecustomerbean.setName(rs.getString(3));
				managecustomerbean.setAge(rs.getInt(4));
				managecustomerbean.setAddressline1(rs.getString(5));
				managecustomerbean.setAddressline2(rs.getString(6));
				managecustomerbean.setCity(rs.getString(7));
				managecustomerbean.setState(rs.getString(8));
				managecustomerbean.setStatus(rs.getString(9));
		    	list.add(managecustomerbean);
		    }
		   }catch(SQLException e){
				e.printStackTrace();
			}
			return list;
	}
			*/
	
	
	public static void activate_deactivateCustomer(int ssnid)
	{
		ResultSet rs=null;
		System.out.println("IN DAO");
		try
		{
			PreparedStatement pst=null;
			String status=null;	
			String Query2=null;
			Databaseutil db = new Databaseutil();
			Connection con = db.getConnection();
				Statement stmt=con.createStatement();
				rs= stmt.executeQuery("Select STATUS from CUSTOMERTBL_GROUP3 where SSN_ID="+ssnid);	
				while(rs.next())
				status= rs.getString(1);
				if(status.equalsIgnoreCase("activated"))
				{
					 Query2="update CUSTOMERTBL_GROUP3 set status='Deactivated' where SSN_ID="+ssnid;
				
				}
				else {
					 Query2="update CUSTOMERTBL_GROUP3 set status='Activated' where SSN_ID="+ssnid;
				}
				
				pst=con.prepareStatement(Query2);
				int i=pst.executeUpdate();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	
	}
	
	public ArrayList<Integer> getCustomerByCustomerId(String custid) 
	{
		ResultSet rs=null;
		ArrayList<Integer> a1=new ArrayList<Integer>();
		//Customer c=new Customer();
		try
		{
			Databaseutil db = new Databaseutil();
			Connection con = db.getConnection();

				Statement stmt=con.createStatement();
				
				rs= stmt.executeQuery("Select AccountId from Account_GROUP3 where CUSTOMERID='"+custid+"'");	
				
				while(rs.next())
				{
					int a=rs.getInt(1);
					System.out.println(a);
					a1.add(a);
				}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	return a1;
	}
	
	public ArrayList<Account> getCustomerByAccountId(int accountid) 
	{
		ResultSet rs=null;
		ArrayList<Account> a1=new ArrayList<Account>();
		//Customer c=new Customer();
		try
		{
			Databaseutil db = new Databaseutil();
			Connection con = db.getConnection();
				Statement stmt=con.createStatement();
				
				rs= stmt.executeQuery("Select * from Account_GROUP3 where AccountId="+accountid);	
				
				while(rs.next())
				{
					Account a=new Account();
					a.setCustomerid(rs.getInt(2));
					a.setAccountid(accountid);
					a.setAccounttype(rs.getString(3));
					a.setBalance(rs.getInt(4));
					a.setCrdate(rs.getString(5));
					a.setCrlastdate(rs.getString(6));
					a.setDuration(rs.getLong(7));
					a.setStatus(rs.getString(8));
					a1.add(a);
				}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	return a1;
	}

	public long withdraw(int accountid, long balance)
	{
		ResultSet rs=null;
		Databaseutil db = new Databaseutil();
		Connection con = db.getConnection();
		Statement stmt;
		long bal=0;
		try {
			stmt = con.createStatement();
			rs=stmt.executeQuery("SELECT balance FROM Account_GROUP3 WHERE accountid="+accountid);
			while(rs.next())
			{
			bal=rs.getInt(1);
			}
			long currbal=bal-balance;
			if(currbal<500)
			{
				return 0;
			}
			else
			{
				int x=stmt.executeUpdate("Update Account_GROUP3 set balance="+currbal+"WHERE accountid="+accountid);
				if(x>0)
					return currbal;
				else 
					return 0;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	
	/*Cashier*/
	
	public ArrayList<Integer> accdisplay(int custid){

		   ResultSet rs = null;
		   ArrayList<Integer> list = new ArrayList<>();
		   Databaseutil db = new Databaseutil();
		   Connection con = db.getConnection();
		   PreparedStatement pst = null;
		   
		   try {
			pst= con.prepareStatement("select * from ACCOUNT_GROUP3 where CUSTOMERID= "+custid);
		    rs = pst.executeQuery();
		    while(rs.next()){
		    	list.add(rs.getInt("ACCOUNTID"));
		    	    }
		    for(Integer i:list)
			{
				System.out.println(i);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			db.closeConnection(con);
			db.closeStatement(pst);
			
		}
		
		return list;
	}
	public ArrayList<Account> accdetails(int accid){

		   ResultSet rs = null;
		   ArrayList<Account> list = new ArrayList<>();
		   Databaseutil db = new Databaseutil();
		   Connection con = db.getConnection();
		   PreparedStatement pst = null;
		   try {
			pst= con.prepareStatement("select * from ACCOUNT_GROUP3 where ACCOUNTID= "+accid);
		    rs = pst.executeQuery();
		    while(rs.next()){
		    	Account acc=new Account();
		    	acc.setAccountid(rs.getInt(1));
		    	acc.setCustomerid(rs.getInt(2));
		    	acc.setAccounttype(rs.getString(3));
		    	acc.setBalance(rs.getLong(4));
		    	//acc.setLastupdated(rs.getDate(5));*/
		    	acc.setStatus(rs.getString(6));
		    	list.add(acc);
		    	    }
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			
			db.closeConnection(con);
			db.closeStatement(pst);
			
		}
		
		return list;
	}
	public boolean updatebal(int accid,float depamt)
	{
		boolean flag = false;
		try
		{
				Databaseutil db = new Databaseutil();
			   Connection con = db.getConnection();
			   PreparedStatement pst = null;
			String query="update ACCOUNT_GROUP3 set BALANCE=BALANCE+"+depamt+ " where ACCOUNTID= "+accid+"";
			pst = con.prepareStatement(query); 
			int rowsAffected = pst.executeUpdate();
		
			if(rowsAffected >0)
			{
				flag= true;
			}
		
		}
		catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
		
		
		return flag;
	}
	public boolean withdrawbal(int accid,float withamt)
	{
		boolean flag = false;
		try
		{
			Databaseutil db = new Databaseutil();
			   Connection con = db.getConnection();
			   PreparedStatement pst = null;
			String query="update ACCOUNT_GROUP3 set BALANCE=BALANCE-"+withamt+ " where ACCOUNTID= "+accid+"";
			pst = con.prepareStatement(query); 
			int rowsAffected = pst.executeUpdate();
		
			if(rowsAffected >0)
			{
				flag= true;
			}
		
		}
		catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
	
		return flag;
	}
	public boolean updatebalt(int accid,float depamt,String acctype)
	{
		boolean flag = false;
		try
		{
			Databaseutil db = new Databaseutil();
			   Connection con = db.getConnection();
			   PreparedStatement pst = null;
			String query="update ACCOUNT_GROUP3 set BALANCE=BALANCE+"+depamt+ " where ACCOUNTID= "+accid+" AND ACCOUNTTYPE= '"+acctype+"'";
			
			pst = con.prepareStatement(query); 
			int rowsAffected = pst.executeUpdate();
		
			if(rowsAffected >0)
			{
				flag= true;
			}
		
		}
		catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
		
		return flag;
	}
	public boolean deletebalt(int accid,float withdrawamt,String acctype)
	{
		boolean flag = false;
		try
		{
			Databaseutil db = new Databaseutil();
			   Connection con = db.getConnection();
			   PreparedStatement pst = null;
			String query="update ACCOUNT_GROUP3 set BALANCE=BALANCE-"+withdrawamt+  " where ACCOUNTID= "+accid+" AND ACCOUNTTYPE= '"+acctype+"'";
			pst = con.prepareStatement(query); 
			int rowsAffected = pst.executeUpdate();
		
			if(rowsAffected >0)
			{
				flag= true;
			}
		
		}
		catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
		
		return flag;
	}
	public boolean transaction(int accid,String acctype,float amount,String sacctype,String tacctype,String transactype)
	{
		boolean flag=false;
		try
		{
		
			Databaseutil db = new Databaseutil();
			   Connection con = db.getConnection();
			   PreparedStatement pst = null;
		String query="insert into TRANSACTION_GROUP3 values(TRANSACTIONID_GROUP4.NEXTVAL,?,?,?,CURRENT_TIMESTAMP,?,?,?)";
		pst = con.prepareStatement(query); 
		pst.setInt(1,accid);
		pst.setString(2,acctype);
		pst.setFloat(3,amount);
		pst.setString(4,sacctype);
		pst.setString(5,tacctype);
		pst.setString(6,transactype);
	
		int rowsAffected = pst.executeUpdate();
	
		if(rowsAffected >0)
		{
			flag= true;
		}
		}
	
	catch (SQLException e1) {
		System.out.println(e1.getMessage());
	}

	return flag;
	}
	public ArrayList<Transaction> statement(int id)
	{
		ArrayList<Transaction> list=new ArrayList<Transaction>();
		
		try{
			Databaseutil db = new Databaseutil();
			   Connection con = db.getConnection();
			
			PreparedStatement ps=null;
			ps=con.prepareStatement("SELECT accountid,transactionid,transaction_date,amount,transaction_type  from TRANSACTION_GROUP3 where accountid =?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString(5));
				Transaction u=new Transaction();
				u.setAccid(rs.getInt(1));
				u.setTransactionid(rs.getInt(2));
				
				u.setTransactiondate(rs.getDate(3));
				u.setAmount(rs.getInt(4));
				u.setTransaction_type(rs.getString(5));
				list.add(u);
			
		}
		}
			catch(Exception e)
		{
			System.out.println(e);
		}
		
		return list;
	}
	/*public static void main(String ardsf[]){
		CashierDAO dao = new CashierDAO();
		dao.statement(10000016);
	}*/
	}

