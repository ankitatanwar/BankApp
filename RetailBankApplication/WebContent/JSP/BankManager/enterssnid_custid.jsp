<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <form>
 <a href="<%= request.getContextPath()%>/JSP/BankManager/enterssnid.jsp"/>Click this Link to Update Customer Details On Basis of Aadhar No
  <br><a href="<%= request.getContextPath()%>/JSP/BankManager/entercusid.jsp"/>click This Link to Update customer Details On Basis of Customer ID
 <br> <a href="../BankManager/managerhome.jsp">Click here to return to Manager's Home Page</a>
</form>


</body>
</html>