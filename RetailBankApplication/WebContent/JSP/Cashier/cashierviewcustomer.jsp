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
<h2>Enter CustomerID</h2>
<form name="myform" action="<%=request.getContextPath()%>/RetailBankController" method="post" >
	
	<table>

	<tr>
	   <td>Enter Customer Id:</td> <td><input type="text" name="customerid"></td>
    </tr>
    
    </table>
    
	<button name="action" value="viewbycustomerid">Submit</button>
	
</form> 

<a href="cashierhome.jsp">Click here to return to home page</a>
<br><br>
     <jsp:include page="footer.jsp"/>
</center>
</body>
</html>