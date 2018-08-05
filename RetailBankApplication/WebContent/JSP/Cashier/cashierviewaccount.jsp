<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Customer Account Details</title>
</head>
<body>
<center>
<h1>Customer Account Details</h1> <br>

<form name="myform" action="<%=request.getContextPath()%>/RetailBankController" method="post" >
	
	<table>

	<tr>
	   <td>Enter Account Id:</td> <td><input type="text" name="accountid"></td>
    </tr>
    
    </table>
    
	<button name="action" value="viewbyaccountid">Submit</button>
	
</form> 
 </center>
 <footer>
<center>

 <p>CopyRight@2017</p>
 <p>For More info Visit:<a href="https://google.co.in"> Our Website</a>.</p>
 <p>Contact Number:+91-7870078143</p>
 <p>Main Office:<br> Randesan Road,Urjanagar1,Near City Pulse Cinema,Gandhinagar,Gujarat,Pin-382421.</p>
</center>
</footer>  
<center>
<a href="cashierhome.jsp">Click here to return to home page</a>
</center>
</body>
</html>