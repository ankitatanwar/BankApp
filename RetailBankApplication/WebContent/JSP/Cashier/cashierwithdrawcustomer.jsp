<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deposit Money</title>
</head>
<body>
<form name="myform" action="<%=request.getContextPath()%>/RetailBankController" method="post" >
	<center>
	<table>

    <tr>
	   <td>Enter Account Id:</td> <td><input type="text" name="accountid"></td>
    </tr>
    
     <tr>
	   <td>Withdrawal Amount:</td> <td><input type="text" name="amount"></td>
    </tr>
    
    </table>
    
	<button name="action" value="withdrawmoney">WithDraw</button>
	</center>
</form> 
</body>
</html>