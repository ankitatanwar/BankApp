<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%= request.getContextPath()%>/RetailBankController?action=check" method = "post"">
Enter Customer ID: <input type="number" name="custid"/><br/><br/>
<input type="submit" value="SUBMIT"></form>

<br><a href="/JSP/BankManager/managerhome.jsp">Click here to return to Manager's Home Page</a>
</body>
</html>