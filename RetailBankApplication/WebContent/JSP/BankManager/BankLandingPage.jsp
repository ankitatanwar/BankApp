<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>G3Bank Welcomes You!</title>
 <link rel="stylesheet" href="/RetailProject/CSS/LandingPage.css"> 
</head>
<body>
<center>
<form action="<%=request.getContextPath() %>/JSP/BankManager/loginscreen.jsp">
<img align="center" alt="G3 Bank" src="banklogo.png">
<br>
<h1> G3 Bank Welcomes You!</h1>
<input  id ="login" class="login" type="submit" value="Login Here!" >
<%-- <a href="<%=request.getContextPath()%>/createcustomer.jsp"><button id ="Signup" class="signup" type="submit" value="Signup Here!" >Signup Here</button></a> --%>

</form>
</center>

</body>
</html>