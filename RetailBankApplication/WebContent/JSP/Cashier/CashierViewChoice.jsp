<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cashier View Choice</title>
</head>
<body>
<center>
<h1>Please Select An Option!!</h1>
<form name="myform" action="<%=request.getContextPath()%>/RetailBankController" method="post" >
Enter Your Choice:
<select name="choice">
  <option value="custid">Customer Id</option>
  <option value="accid">Account Id</option>
</select>
<br><br> <br>
<br>
<button name="action" value="cashierchoice">ENTER</button>
</form>
</center>
</body>
</html>