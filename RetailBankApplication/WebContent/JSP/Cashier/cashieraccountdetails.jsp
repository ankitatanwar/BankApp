<%@page import="com.tcs.RetailBank.Bean.Account" %>
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Account Details</title>
</head>
<body>
<%
ArrayList<Account> list=(ArrayList<Account>)request.getAttribute("list");
%>

<% if(list!=null)
 
{%>
<center>
<table>
   
   		<tr>
            <th>Customer id</th>
            <th>Account Id</th>
            <th>Account Type</th>
            <th>Balance</th>        
      </tr>
      <%
      for(Account i : list)
      {
      %>
      <tr>
       
        <td><%=i.getCustomerid() %></td>
        <td><%=i.getAccountid() %></td>
        <td><%=i.getAccounttype() %></td>
         <td><%=i.getBalance() %></td>
         
      </tr>
      <tr>
      <center>
  
    <input type="button" value="Deposit"onclick="window.location.href='<%=request.getContextPath()%>/RetailBankController?action=deposit&&accid=<%=i.getAccountid() %>'">
     <input type="button" value="Withdraw"onclick="window.location.href='<%=request.getContextPath()%>/RetailBankController?action=withdraw&&accid=<%=i.getAccountid() %>'">
     <input type="button" value="Transfer"onclick="window.location.href='<%=request.getContextPath()%>/RetailBankController?action=transfer&&accid=<%=i.getAccountid() %>'">
     </center>
     </tr>
      <%} }%>

</table>

</center>



</body>
</html>