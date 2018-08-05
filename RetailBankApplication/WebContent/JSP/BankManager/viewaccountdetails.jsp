<%@page import="com.tcs.RetailBank.DAO.RetailBankDao"%>
<%@page import="java.sql.*"%>
<%@page import="com.tcs.RetailBank.DAO.RetailBankDao"%> 



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>view account details </title>
<style type="text/css">
h1{
color:white;
background-color:brown;
}
</style>
</head>
<body>
<center>
<h1>View Account Details</h1>
<%! int a; %>
<table>
<tr>
<th>CUSTOMER ID</th><th>ACCOUNT ID</th>
<th>ACCOUNT TYPE</th><th>BALANCE</th>
<th>ACCOUNT STATUS</th><th>Action</th>
</tr>
<%
RetailBankDao rbd = new RetailBankDao();
ResultSet rs=rbd.getAllAccounts();
while(rs.next())
{
	a=rs.getInt(1);
	//out.println(a);
	
%>
<form action="<%=request.getContextPath()%>/RetailBankController?action=performviewacc" method="post">
 <tr>
<td><%= rs.getString(1) %></td>
<td><%= rs.getInt(2) %></td>
<td><%= rs.getString(3) %></td>
<td><%= rs.getInt(4) %></td>
<td><%= rs.getString(5) %></td>
<td><button name="ssnid" value="<%=a %>">Change Status</button></td> 

</tr>
 <%} %> 
 </form>
</table>

<a href="/RetailBankApplication/JSP/BankManager/managerhome.jsp"> <button name="action" value="reset">Go Back</button></a>
<br><br>
     <jsp:include page="footer.jsp"/>
</center>
</body>
</html>