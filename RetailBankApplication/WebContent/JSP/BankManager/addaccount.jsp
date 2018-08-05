

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Account</title>
 <%
     String message = (String)request.getAttribute("message"); 
   	
     //ArrayList<ManageCustomerBean> list = ( ArrayList<ManageCustomerBean>)request.getAttribute("list");
     if(message!=null){
    	 %>
    	   <span style="color:green"><%=message %></span>
    	   
    	   <%} %>
    	   
 <link rel="stylesheet" href="include.css">
</style>
</head>
<body>

<center>
<h1 id="h1">Add Account</h1>

<form action="<%=request.getContextPath() %>/RetailBankController" method="post" >
	
	<table>
	<tr>
	   <td>Enter Customer Id:</td> <td><input type="text" name="customerid" required></td>
    </tr>
    <tr>
	   <td>Enter Account Type :</td> 
	   				<td><input type="radio" value="Savings" name="accounttype">Savings
					<input type="radio" value="Current" name="accounttype">Current </td>			
	</tr>
	<tr>
	   <td>Enter Balance:</td> <td><input type="text" name="balance"></td>
    </tr>	
    </table>
    
	<button name="action" value="createaccount">Add Account</button>
	
</form> 
 
</center>
<footer>
<center>

 <p>&copy; Team-Group3 </p>
 <p>Visit the link to locate us<a href="https://google.co.in"> Locate us</a>.</p>
 <p>Contact Number:+0-888899997</p>
 <p>Branch Location: <br> New Delhi - Janakpuri Industrial Area.</p>
</center>
</footer>  
<center>
<a href="../BankManager/managerhome.jsp">Go to Home Page</a>
</center>

<br><br>
     <jsp:include page="footer.jsp"/>
</body>
</html>