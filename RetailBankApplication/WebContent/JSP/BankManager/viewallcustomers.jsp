
<%@page import="com.tcs.RetailBank.DAO.RetailBankDao"%> 
 <%@page import="com.tcs.RetailBank.Bean.ManageCustomerBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Customer</title>
<style type="text/css">
h1{
color:white;
background-color:brown;
}
</style>
</head>
<body>
<center>
<h1>View Customer Details</h1>

  
<%! int a; %>
<table>
<tr>
<th>SSNID</th>
<th>Customer ID</th>
<th>Customer Name</th>
<th>Customer Status</th>
<th>Action</th>
</tr>
<%
RetailBankDao rbd = new RetailBankDao();
ResultSet rs=rbd.getAllCustomers();
while(rs.next())
{
	a=rs.getInt(1);
%> 
<form action="<%=request.getContextPath()%>/RetailBankController?action=performview" method="post">
 <tr>
<td><%= rs.getInt(1) %></td>
<td><%= rs.getString(2) %></td>
<td><%= rs.getString(3) %></td>
<td><%= rs.getString(4) %></td>
<td><button name="ssnid" value="<%=a %>">Change Status</button></td>

</tr> 
<%} %> 
 </form>
</table>

<a href="../BankManager/managerhome.jsp"> <button name="action" value="reset">Go Back</button></a>
<br><br>
     <jsp:include page="footer.jsp"/>
</center>
</body>
</html>