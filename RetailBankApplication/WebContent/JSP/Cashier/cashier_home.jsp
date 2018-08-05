<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CashierHome</title>
</head>
<body>
<center>
	<div class="header">
	<h1>Cashier Home</h1>
	</div>

	<a href="<%=request.getContextPath()%>/RetailBankController?action=viewcustomerprofile">view customer profile</a> <br>

	<a href="<%=request.getContextPath()%>/RetailBankController?action=viewcustomerstatement">view customer statement</a> <br>
	
	<a href="<%=request.getContextPath()%>/RetailBankController?action=deposit">deposit</a> <br>
 
 	<a href="<%=request.getContextPath()%>/RetailBankController?action=withdraw">withdraw</a> <br>
 
 	<a href="<%=request.getContextPath()%>/RetailBankController?action=transfer">transfer</a> <br>

<a href="logout.jsp">logout</a>

<br><br>
     <jsp:include page="footer.jsp"/>
</center>


</body>
</html>