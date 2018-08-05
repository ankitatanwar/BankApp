<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Customer</title>
</head>
<body>
<center>
<form action ="<%=request.getContextPath()%>/RetailBankController?action=managecustomer" method="post">
<h2>Create Customer</h2></center>
Customer SSN ID: &nbsp; <input type="number" name="ssnid" pattern="[0-9]{9}"><br><br>
Customer Name: &nbsp; <input type="text" name="name"><br><br>
Age: &nbsp; <input type="number" name="age"><br><br>
AddressLine1: &nbsp; <input type="text" name="addressline1"><br><br>
AddressLine2: &nbsp; <input type="text" name="addressline2"><br><br>
City: &nbsp; <input type="text" name="city"><br><br>
State: &nbsp; <input type="text" name="state"><br><br>


<input type="submit" value="Submit"/>

<input type="button" value="submit">

</form>
</center>
</body>
</html>