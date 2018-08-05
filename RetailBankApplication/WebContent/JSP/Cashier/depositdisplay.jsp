<%@page import="com.tcs.RetailBank.Bean.ManageCustomerBean" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <h2>Profile</h2>
   <a href="Customer.jsp">home</a>
   <%
    
ArrayList<ManageCustomerBean> list = (ArrayList<ManageCustomerBean>)request.getAttribute("list"); 
   
   %>
   
   <table>
      <tr>
           <th>Customer ID</th>
            <th>Account ID</th>
            <th>Account Type</th>
            <th>Balance before Deposit</th>
            <th>Latest balance</th>
         
      </tr>
       <%
      
      for(ManageCustomerBean cust : list){
      %>
      <tr>
        <td><%=cust.getSsnid() %></td>
        <td><%=cust.getName() %></td>
        <td><%=cust.getAge() %></td>
        <td><%=cust.getAddressline1() %></td>
   
      </tr>
     
     <%} %>
   


</body>
</html>