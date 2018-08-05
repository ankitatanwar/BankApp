<%@page import="com.tcs.RetailBank.Bean.Account" %>
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
<%
    String message=(String)request.getAttribute("message");
  ArrayList<Account> list = ( ArrayList<Account>)request.getAttribute("list");
   Float depamt=(Float)request.getAttribute("depamt");
   %>
   <span><%=message %></span>
   <table border="1">
      <tr>
           <th>Account ID</th>
            <th>Customer ID</th>
            <th>Account Type</th>
            <th>Before Balance</th>
            <th>Current Balance</th>
      </tr>
      <%
      
      for(Account acc: list){
      %>
      <tr>
        <td ><%=acc.getAccountid() %></td>
        <td ><%=acc.getCustomerid() %></td>
        <td ><%=acc.getAccounttype() %></td>
         <td ><%=acc.getBalance()-depamt %></td>
        <td ><%=acc.getBalance() %></td>
      
      </tr>
      
     <%} %>

     
   
   </table>

</body>
</html>