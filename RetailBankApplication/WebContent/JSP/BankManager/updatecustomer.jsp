<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="com.tcs.RetailBank.Bean.ManageCustomerBean"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="<%=request.getContextPath()%>/RetailBankController?action=updatecustomer" method="post">
<center><h1>Update Customer</h1></center>
<center>
<h2>View All Customers</h2>
   
   <%
     String message = (String)request.getAttribute("message"); 
   	
     ArrayList<ManageCustomerBean> list = ( ArrayList<ManageCustomerBean>)request.getAttribute("list");
     if(message!=null){
    	 %>
    	   <span style="color:green"><%=message %></span>
    	   
    	   <%} %>
    	   
    
  <form action="<%=request.getContextPath() %>/RetailbankController action=updatecustomer" method="post">
  
  	 <table>
      <tr>
           <th>ssnid</th>
            <th>Customer id</th>
            <th>name</th>
            
              <th>age</th>
               <th>address line 1</th>
               <th>address line 2</th>
               <th>city</th>
               <th>state</th>
            <!-- <th colspan="2">Action</th -->
      </tr>
  	
  	<%
      
      for(ManageCustomerBean cust : list){
      %>
  <tr>
  
  <td>    <input type="text" name="ssnid" value="<%=cust.getSsnid()%>" readonly="readonly"></td> <br>
       
   <td>   <input type="text" name="customer_id" value="<%=cust.getCustomer_id()%>" readonly="readonly"></td> <br>
       
       
     <td>   <input type="text" name="name" value="<%=cust.getName()%>"> </td><br>
       
       <td>  <input type="text" name="age" value="<%=cust.getAge()%>"></td> <br>
        
     <td>    <input type="text" name="addressline1" value="<%=cust.getAddressline1()%>"></td> <br>
     <td>    <input type="text" name="addressline2" value="<%=cust.getAddressline2()%>"></td> <br>
     <td>   <input type="text" name="city" value="<%=cust.getCity()%>"></td><br>
     <td>    <input type="text" name="state" value="<%=cust.getState()%>"> </td><br>
      
        <%--  status : <input type="text" name="status" value="<%=cust.getStatus()%>"> <br> --%>       
         <button name="action" value="updatecustomer">Update</button>
         
         <br> <a href="../BankManager/managerhome.jsp">Click here to return to Manager's Home Page</a>
  
  <%} %>
  </table>
  </form>
  
</body>
</html>