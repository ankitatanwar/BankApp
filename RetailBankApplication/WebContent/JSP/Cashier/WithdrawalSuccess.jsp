<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Withdrawal Success Page</title>
</head>
<body>
<center>
<h1>Withdrawal Successful</h1>
  
  <%
String message = (String)request.getAttribute("message");
Long l=(Long)request.getAttribute("balance");
if(message!= null)
{
%>

<span style="color:#00ff00"><%=message %></span>

<%} %>


<p>The Updated Balance is:<%=l %></p>
</center>
</body>
</html>