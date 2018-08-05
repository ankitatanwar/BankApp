<%@page import="com.tcs.RetailBank.Bean.Account" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<%
ArrayList<Integer> list=(ArrayList<Integer>)request.getAttribute("list");
%>
 <center>
	<form>
	  <table>
      <tr>
            <th>Account Id</th>
      </tr>
      <select name="accountid">
    <% for (Integer i:list)
    {%>
  <option > <%= i%></option> <br>
 

<%} %>
</select>
      </tr>
      
      </table>
   <button name="action" value="viewbyaccountid">Submit</button>
	
      </form>
      </center>
</body>
</html>