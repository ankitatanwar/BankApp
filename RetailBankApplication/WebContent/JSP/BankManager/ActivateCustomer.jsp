<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action ="<%=request.getContextPath()%>/RetailBankController?action=activatecustomer" method="post">
 <h2>Customer Activation</h2>
<input type="submit" value="Click here to activate"><br><br><br>
<h2>Customer DeActivation</h2>
<input type="submit" value="Click hete to deactivate">
</center>
</body>
</html>