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
    
  ArrayList<Account> list = ( ArrayList<Account>)request.getAttribute("list");
   
   %>
   <center>
   <table>
    <%
      
      for(Account acc: list){
      %>
      <tr>
           <th>Account ID:<%=acc.getAccountid() %></th>
            </tr>
            <tr>
            <th>Customer ID:<%=acc.getCustomerid() %></th>
            </tr>
            <tr>
            <th>Account Type:<%=acc.getAccounttype() %></th><br>
            </tr>
            <tr>
            <th>Balance:<%=acc.getBalance() %></th><br>
</tr>
     
   
       </table>
       
        <form action="<%=request.getContextPath() %>/RetailBankController?action=withamt&&accid=<%=acc.getAccountid() %>" method="post">
       Transfer Amount: <input type="text" name="withamt">
       <input type="submit" value="SUBMIT">
     
       </form>
         <%} %>
       </center>
</body>
</html>