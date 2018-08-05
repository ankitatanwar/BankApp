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
<form action ="<%=request.getContextPath()%>/RetailBankController?action=createaccount" method="post">
<h2>Create Account For Existing Customer</h2></center>
<center>
Customer ID: &nbsp; <input type="text" name="customerid"><br><br>
Account Type<select>
<option value="Select">Select</option>
<option value="Savings">Savings</option>
<option value="Current">Current</option>
</select><br><br>
Deposit Amount : &nbsp; <input type="text" name="depositamount"><br><br>
<input type="submit" value="Submit">

</form>
</center>

</body>
</html>