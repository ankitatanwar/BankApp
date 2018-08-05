<%@page import="java.util.ArrayList"%>
<%@page import="com.tcs.RetailBank.Bean.Transaction"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="https://printjs-4de6.kxcdn.com/print.min.css">
<title>Insert title here</title>
</head>
<script src="https://printjs-4de6.kxcdn.com/print.min.js"></script>
<body>


   <h2>View All Customers</h2>
   
   <%
     String message = request.getAttribute("message").toString();
   ArrayList<Transaction> list = ( ArrayList<Transaction>)request.getAttribute("ArrayList");
     if(message!=null){
   %>
     <span style="color:green"></span>
   <%} %>
   <table id="table_mini">
      <tr>
           <th>AccountID</th>
            <th>Transaction ID</th>
            <th>Transaction Type</th>
            <th>Transaction_date</th>
            <th>Amount</th>
      </tr>
      <%
      
      for(Transaction t : list){
      %>
      <tr>
        <td><%=t.getAccid()%></td>
        <td><%=t.getTransactionid()%></td>
        <td><%=t.getTransaction_type()%></td>
        <td><%=t.getTransactiondate() %></td>
        <td><%=t.getAmount()%></td>
      
     
      </tr>
      
     <%} %>
   
   </table>
	 <button type="button" onclick="printJS({ printable: 'table_mini', type: 'html', header: 'Mini Statement <%=message%>' })">
    		Print MiniStatement
 		</button>
</body>
</html>