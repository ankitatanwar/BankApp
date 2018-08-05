<%@page import="com.tcs.RetailBank.Bean.Account" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transfer</title>
</head>
<body>
<center><h1><b>Transfer Amount</h1></b></center>
<%
    
  ArrayList<Account> list = ( ArrayList<Account>)request.getAttribute("list");
   
   %>
   <center>
    <%
      
      for(Account acc: list){
      %>
 <form action="<%=request.getContextPath() %>/RetailBankController?action=transferamt&&accid=<%=acc.getAccountid() %>" method="post">
   
     
          Source Account ID:<input type="number" value="<%=acc.getAccountid()%>" name="accid" readonly><br><br>
          Target Account ID:<input type="number" name="accidt"><br><br>
          Source Account Type:<select name="sacctype">
          <option></option>
          <option>Savings</option>
          <option>Current</option>
          </select><br><br>
          Target Account Type:<select name="tacctype">
          <option></option>
          <option>Savings</option>
          <option>Current</option>
          </select><br><br>
            Transfer Amount:<input type="text" name="transferamt"><br><br>
       
       <input type="submit" value="TRANSFER">
     
       </form>
         <%} %>
       </center>
</body>
</html>