<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
    <%@page import="com.tcs.RetailBank.Bean.ManageCustomerBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Updated Successfully</title>
</head>
<body>
  <%
    
     ArrayList<ManageCustomerBean> list = (ArrayList<ManageCustomerBean>)request.getAttribute("list");
   %>
   
   <%
    for(ManageCustomerBean i : list){
      %>
      <tr>
        <td><%=i.getStatus() %></td>
        
      </tr>
      
     <%} %>
  <hr>
</body>
</html>