<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/RetailbankController?action=deactcust" method="post"> 
<br> Status of Customer is : <input type="text" value=" Activated" readonly="readonly">
<br>Status of Account is : <input type="text" value=" Activated" readonly="readonly">
<input type="submit" name ="submit" value=" De-activate the account" >
</form>

</body>
</html>