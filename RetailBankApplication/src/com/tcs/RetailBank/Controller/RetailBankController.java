package com.tcs.RetailBank.Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.tcs.RetailBank.Bean.Account;
import com.tcs.RetailBank.Bean.LoginBean;
import com.tcs.RetailBank.Bean.ManageCustomerBean;
import com.tcs.RetailBank.DAO.RetailBankDao;
import com.tcs.RetailBank.Service.BankService;

/**
 * Servlet implementation class RetailBankController
 */
@WebServlet("/RetailBankController")
public class RetailBankController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RetailBankController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in Get");
		
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String action = request.getParameter("action");
		BankService service = new BankService();
		System.out.println(action);
		if (action == null || action.equals("")) {
			response.sendRedirect(request.getContextPath() + "/loginscreen.jsp");
			return;
		} /*else if (action.equalsIgnoreCase("login")) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			LoginBean lb = new LoginBean(username, password);
			boolean flag = service.LoginProcess(lb);
			System.out.println(flag);
			if (flag) {

				RequestDispatcher rd = request
						.getRequestDispatcher("/JSP/BankManager/managerhome.jsp");
				request.setAttribute("Login User", lb);
				rd.forward(request, response);
			} else {
				System.out.println("else part");
			}
		}*/
		if ("login".equalsIgnoreCase(action)) {

			boolean flag = false;

			String username = request.getParameter("username");
			String password = request.getParameter("password");

			if (username.startsWith("M")) {

				LoginBean lb = new LoginBean(username, password);
				 flag = service.LoginProcess(lb);
				if (flag) {
					RequestDispatcher rd = request
							.getRequestDispatcher("/JSP/BankManager/managerhome.jsp");
					rd.forward(request, response);

				} else {
					RequestDispatcher rd = request
							.getRequestDispatcher("/JSP/BankManager/loginscreen.jsp");
					request.setAttribute("message",
							"Invalid Details...Please enter correct Username and Password");
					rd.forward(request, response);
				}
			} else if (username.startsWith("T")) {
				LoginBean lb = new LoginBean(username, password);
				 flag = service.LoginProcess(lb);
				if (flag) {
					RequestDispatcher rd = request
							.getRequestDispatcher("/JSP/Cashier/cashier_home.jsp");
					rd.forward(request, response);
				} else {
					RequestDispatcher rd = request
							.getRequestDispatcher("/JSP/BankManager/loginscreen.jsp");
					request.setAttribute("message",
							"Invalid Details...Please enter correct Username and Password");
					rd.forward(request, response);
				}
			} else if (username.startsWith("C")) {

				LoginBean lb = new LoginBean(username, password);
			    flag = service.LoginProcess(lb);
				if (flag) {
					RequestDispatcher rd = request
							.getRequestDispatcher("/JSP/Customer/customerhome.jsp");
					rd.forward(request, response);

				} else {
					RequestDispatcher rd = request
							.getRequestDispatcher("/JSP/BankManager/loginscreen.jsp");
					request.setAttribute("message",
							"Invalid Details...Please enter correct Username and Password");
					rd.forward(request, response);
				}

			} else {
				RequestDispatcher rd = request
						.getRequestDispatcher("/Login.jsp");
				request.setAttribute("message",
						"Invalid Details...Please enter correct Username and Password");
				rd.forward(request, response);
			}

		}

		else if (action.equalsIgnoreCase("managecustomer")) {
			System.out.println("ssss");

			int ssnid = Integer.parseInt(request.getParameter("ssnid"));
			String name = request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			String addressline1 = request.getParameter("addressline1");
			String addressline2 = request.getParameter("addressline2");
			String city = request.getParameter("city");
			String state = request.getParameter("state");

			ManageCustomerBean managecustombean = new ManageCustomerBean(ssnid,
					name, age, addressline1, addressline2, city, state);
			boolean flag1 = service.manageCustomerStatus(managecustombean);
			RequestDispatcher rd = request
					.getRequestDispatcher("/JSP/BankManager/createcustomer.jsp");
			rd.forward(request, response);

		}

		else if (action.equalsIgnoreCase("check")) {
			String ssnid = request.getParameter("ssnid");
			String custid = request.getParameter("custid");
			
			System.out.println(ssnid);
			if(ssnid !=null){
				int ssnid1 = Integer.parseInt(request.getParameter("ssnid"));
			ArrayList<ManageCustomerBean> list = service.checkSSNID(ssnid1);
			System.out.println("Service return list");
			request.setAttribute("list", list);
			RequestDispatcher rd = request
					.getRequestDispatcher("/JSP/BankManager/updatecustomer.jsp");
			rd.forward(request, response);
			}
			else if(custid != null){
				int cusid1 = Integer.parseInt(request.getParameter("custid"));
				ArrayList<ManageCustomerBean> list = service.checkCustID(cusid1);
				System.out.println("Service return list");
				request.setAttribute("list", list);
				RequestDispatcher rd = request
						.getRequestDispatcher("/JSP/BankManager/updatecustomer.jsp");
				rd.forward(request, response);
				
				
			}
		}

		else if (action.equalsIgnoreCase("viewcustomer"))

		{
			System.out.println("sss");
			/* ArrayList<ManageCustomerBean> list = service.getAllCustomers();
			   
			   
			   request.setAttribute("list", list);
			   RequestDispatcher rd = request.getRequestDispatcher("/JSP/BankManager/viewallcustomers.jsp");
			   // RequestDispatcher rd= request.getRequestDispatcher("/JSP/BankManager/viewallcustomers.jsp");
			   rd.forward(request, response);*/
		
			  response.sendRedirect(request.getContextPath()+ "/JSP/BankManager/viewallcustomers.jsp"); 
			
			 return;
	}

		/*
		 * else if(action.equalsIgnoreCase("activate")){ int
		 * ssnid=Integer.parseInt(request.getParameter("ssnid"));
		 * System.out.println(ssnid); boolean flag =
		 * service.actdeactCustomer(ssnid); //ArrayList<ManageCustomerBean> list
		 * =service.activateCustomer(ssnid);
		 * System.out.println("Service return boolean"); if(flag) {
		 * 
		 * RequestDispatcher rd =
		 * request.getRequestDispatcher("/JSP/BankManager/deactscreen.jsp");
		 * //request.setAttribute("Login User", lb); rd.forward(request,
		 * response); } else { System.out.println("else part");
		 * 
		 * RequestDispatcher rd =
		 * request.getRequestDispatcher("/JSP/BankManager/actscreen.jsp");
		 * //request.setAttribute("Login User", lb); rd.forward(request,
		 * response); }
		 * 
		 * // request.setAttribute("list", list); RequestDispatcher rd =
		 * request.
		 * getRequestDispatcher("/JSP/BankManager/ActivateAccountSuccess.jsp");
		 * rd.forward(request, response);
		 * 
		 * } else if(action.equalsIgnoreCase("deactcust")) {
		 * 
		 * 
		 * }
		 */
		else if (action.equalsIgnoreCase("performview")) {
			int ssnid = Integer.parseInt(request.getParameter("ssnid"));
			RetailBankDao.activate_deactivateCustomer(ssnid);
			response.sendRedirect(request.getContextPath()+ "/JSP/BankManager/viewallcustomers.jsp");
			return;
		}
		
		else if(action.equalsIgnoreCase("createaccount"))
		{
			int customerid =Integer.parseInt(request.getParameter("customerid"));
			String accounttype =request.getParameter("accounttype");
			long balance=Long.parseLong(request.getParameter("balance"));
			Account ac=new Account(customerid,accounttype,balance,"activate");
			//BankService service=new managerService();
			int count=service.addAccount(ac);
			if(count==1)
			{
				RequestDispatcher rd = request.getRequestDispatcher("/JSP/BankManager/addaccount.jsp");
				request.setAttribute("message", "Account added successfully");
				rd.forward(request, response);
			}
			else if (count==2)
			{
				RequestDispatcher rd = request.getRequestDispatcher("/JSP/BankManager/addaccount.jsp");
				request.setAttribute("message", "Account For this Customer Already Exist");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("addaccount.jsp");
				request.setAttribute("message", "Falied To Add Account Try Again Later");
				rd.forward(request, response);
			}
		}
		
		
		else if(action.equalsIgnoreCase("viewaccount"))

		{
				response.sendRedirect(request.getContextPath()+"/JSP/BankManager/viewaccountdetails.jsp");
				return;
		}
		
		/* Cashier Functions*/
		
		else if(action.equalsIgnoreCase("viewcustomerprofile"))
		{		
			response.sendRedirect(request.getContextPath()+"/JSP/Cashier/CashierViewChoice.jsp");
			return;
		}
		else if(action.equalsIgnoreCase("viewbycustomerid"))
		{
			String custid=request.getParameter("customerid");
				ArrayList<Integer> c1=service.getCustomerByCustomerId(custid);
				request.setAttribute("list",c1);
				RequestDispatcher rd=request.getRequestDispatcher("/JSP/Cashier/cashierviewscustomer.jsp");
				rd.forward(request, response);
		}
			
		else if(action.equalsIgnoreCase("viewbyaccountid"))
		{
			int accountid=Integer.parseInt(request.getParameter("accountid"));
			System.out.println("account id:"+accountid);
			ArrayList<Account> c1=service.getCustomerByAccountId(accountid);
			request.setAttribute("list",c1);
			RequestDispatcher rd=request.getRequestDispatcher("/JSP/Cashier/cashieraccountdetails.jsp");
			rd.forward(request, response);
			
		}
			
		
		else if(action.equalsIgnoreCase("cashierchoice"))
		{
			String choice=request.getParameter("choice");
			System.out.println(choice);
			if(choice.equalsIgnoreCase("custid"))
			{
				response.sendRedirect(request.getContextPath()+"/JSP/Cashier/cashierviewcustomer.jsp");
				return;
			}
			else 
			{
				response.sendRedirect(request.getContextPath()+"/JSP/Cashier/cashierviewaccount.jsp");
				return;
			}
			
		}
		
		/*else if(action.equalsIgnoreCase("withdraw"))
		{
			response.sendRedirect(request.getContextPath()+"/JSP/Cashier/cashierwithdrawcustomer.jsp");
			return;
		}
		else if (action.equalsIgnoreCase("withdrawmoney"))
		{
			int accountid=Integer.parseInt(request.getParameter("accountid"));
			long balance=Integer.parseInt(request.getParameter("amount"));
		    long c1=service.withdraw(accountid,balance);
			if(c1>0)
			{
				RequestDispatcher rd = request.getRequestDispatcher("/JSP/Cashier/WithdrawalSuccess.jsp");
				request.setAttribute("balance", c1);
				request.setAttribute("message", "Amount Withdrawn Successfully !!");
				rd.forward(request, response);
			}
			
			
		}
	*/
		else if ("deposit".equals(action)) {
			int accid = Integer.parseInt(request.getParameter("accid"));

			ArrayList<Account> list = service.accdetails(accid);
			request.setAttribute("list", list);
			RequestDispatcher rd = request.getRequestDispatcher("/JSP/Cashier/Deposit.jsp");

			rd.forward(request, response);
		}

		else if ("depamt".equals(action)) {
			int accid = Integer.parseInt(request.getParameter("accid"));
			Float depamt = Float.parseFloat(request.getParameter("depamt"));
			boolean flag = service.updatebal(accid, depamt);
			if (flag) {
				ArrayList<Account> list = service.accdetails(accid);
				request.setAttribute("list", list);
				request.setAttribute("depamt", depamt);
				request.setAttribute("message", "Amount deposited successfully");
				RequestDispatcher rd = request
						.getRequestDispatcher("/JSP/Cashier/DepositSuccess.jsp");

				rd.forward(request, response);
			} else {
				ArrayList<Account> list = service.accdetails(accid);
				request.setAttribute("list", list);
				request.setAttribute("depamt", depamt);
				request.setAttribute("message", "Amount not deposited");
				RequestDispatcher rd = request
						.getRequestDispatcher("/JSP/Cashier/DepositNS.jsp");

				rd.forward(request, response);
			}
		} else if ("withdraw".equals(action)) {
			int accid = Integer.parseInt(request.getParameter("accid"));

			ArrayList<Account> list = service.accdetails(accid);
			request.setAttribute("list", list);
			RequestDispatcher rd = request
					.getRequestDispatcher("/JSP/Cashier/withdraw.jsp");

			rd.forward(request, response);
		}

		else if ("withamt".equals(action)) {
			int accid = Integer.parseInt(request.getParameter("accid"));
			Float withamt = Float.parseFloat(request.getParameter("withamt"));
			boolean flag = service.withdrawbal(accid, withamt);
			if (flag) {
				ArrayList<Account> list = service.accdetails(accid);
				request.setAttribute("list", list);
				request.setAttribute("withamt", withamt);
				request.setAttribute("message", "Amount deducted successfully");
				RequestDispatcher rd = request
						.getRequestDispatcher("/JSP/Cashier/withdrawSuccess.jsp");

				rd.forward(request, response);
			} else {
				ArrayList<Account> list = service.accdetails(accid);
				request.setAttribute("list", list);
				request.setAttribute("withamt", withamt);
				request.setAttribute("message", "Amount not deposited");
				RequestDispatcher rd = request
						.getRequestDispatcher("/JSP/Cashier/DepositNS.jsp");

				rd.forward(request, response);
			}
		} else if ("transfer".equals(action)) {
			int accid = Integer.parseInt(request.getParameter("accid"));

			ArrayList<Account> list = service.accdetails(accid);
			request.setAttribute("list", list);
			RequestDispatcher rd = request
					.getRequestDispatcher("/JSP/Cashier/Transfer.jsp");

			rd.forward(request, response);
		}

		else if ("transferamt".equals(action)) {
			
			int accid = Integer.parseInt(request.getParameter("accid"));
			int accidt = Integer.parseInt(request.getParameter("accidt"));
			String sacctype = request.getParameter("sacctype").equalsIgnoreCase("Savings") ? "Savings":null ;
			String tacctype = request.getParameter("tacctype").equalsIgnoreCase("Savings") ? "Savings":null;
			Float transferamt = Float.parseFloat(request.getParameter("transferamt"));
			boolean flag = service.deletebalt(accid, transferamt, sacctype);
			if (flag) {
				boolean flag1 = service.updatebalt(accid, transferamt,tacctype);
				if (!flag1) {
					service.updatebal(accid, transferamt);
					ArrayList<Account> list = service.accdetails(accid);

					request.setAttribute("list", list);

					request.setAttribute("transferamt", transferamt);
					request.setAttribute("message", "enter correct details");
					RequestDispatcher rd = request
							.getRequestDispatcher("/JSP/Cashier/TransferNS.jsp");

					rd.forward(request, response);

				} else {
					service.transaction(accid, sacctype, transferamt,sacctype, tacctype,"debit");
					service.transaction(accidt, tacctype, transferamt,sacctype, tacctype, "credit");
					ArrayList<Account> list = service.accdetails(accid);
					ArrayList<Account> listt = service.accdetails(accidt);
					request.setAttribute("list", list);
					request.setAttribute("listt", listt);
					request.setAttribute("transferamt", transferamt);
					request.setAttribute("message",
							"Amount transfer completed successfully");
					RequestDispatcher rd = request.getRequestDispatcher("/JSP/Cashier/TransferSuccess.jsp");

					rd.forward(request, response);
				}
			} else {
				ArrayList<Account> list = service.accdetails(accid);

				request.setAttribute("list", list);

				request.setAttribute("transferamt", transferamt);
				request.setAttribute("message", "Transfer not successful");
				RequestDispatcher rd = request
						.getRequestDispatcher("/JSP/Cashier/TransferNS.jsp");

				rd.forward(request, response);
			}

		}
		 else if ("statement".equals(action))
		 {
			 RequestDispatcher rd = request.getRequestDispatcher("/JSP/Cashier/statement.jsp");
			 rd.forward(request, response);
		 }
		 else if("submit".equalsIgnoreCase(action))
		 {
			 int id=Integer.parseInt(request.getParameter("accid"));
			 int tranid=Integer.parseInt(request.getParameter("tranid"));
			 System.out.println(id);
			 	request.setAttribute("message",id);
				request.setAttribute("ArrayList",service.statement(id));
				RequestDispatcher rd=request.getRequestDispatcher("/JSP/Cashier/statementsuccess.jsp");
				rd.forward(request, response);
		 }
	

		
		else if(action.equalsIgnoreCase("performviewacc"))
		{
			int ssnid=Integer.parseInt(request.getParameter("ssnid"));
			RetailBankDao.changeAccountStatus(ssnid);
			response.sendRedirect(request.getContextPath()+"/JSP/BankManager/viewaccountdetails.jsp");
			return;
		}

		else if (action.equalsIgnoreCase("updatecustomer")) {
			int ssnid = Integer.parseInt(request.getParameter("ssnid"));
			String name = request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			String addressline1 = request.getParameter("addressline1");
			String addressline2 = request.getParameter("addressline2");
			String city = request.getParameter("city");
			String state = request.getParameter("state");
			boolean flag = service.update(ssnid, name, age, addressline1,
					addressline2);

			if (flag) {
				System.out.println("sss");
				ArrayList<ManageCustomerBean> list = service.checkSSNID(ssnid);
			/*	System.out.println("Service return list");*/
				

				RequestDispatcher rd = request
						.getRequestDispatcher("/JSP/BankManager/updatecustomer.jsp");
				request.setAttribute("message", "Customer Information  Updated Sucessfully");
				request.setAttribute("list", list);
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request
						.getRequestDispatcher("/error.jsp");
				request.setAttribute("message",
						"Item not Updated OR Item not Found");
				rd.forward(request, response);
			}

		} else {
			System.out.println("exact else");
		}
	}
}
