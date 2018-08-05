

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ManagerHome</title>

<link rel="stylesheet" href="include.css">

</head>
<body>
<center>

  <h1 id="h1">Manager Home</h1>
 <a href="../BankManager/createcustomer.jsp">Add Customer</a> <br>
 
 <a href="<%= request.getContextPath()%>/RetailBankController?action=viewcustomer"> View Customer details </a> <br>
 <a href="<%= request.getContextPath()%>/JSP/BankManager/enterssnid_custid.jsp"> Update Customer Details </a> <br>
 
 <a href="/RetailBankApplication/RetailBankController?action=viewaccount"> View Account details </a> <br>
<!--  <a href="/RetailBankApplication/RetailBankController?action=updateaccount"> Update Account Details </a> <br> -->
 
 <!-- <a href="/RetailBankApplication/RetailBankController?action=custstatus"> Customer Status</a> <br>
 <a href="//RetailBankApplication/RetailBankController?action=editcuststatus"> Edit Customer Status </a> <br> -->
 
 <!--  <a href="/RetailBankApplication/RetailBankController?action=accountstatus"> Account Status</a> <br>
 <a href="/RetailBankApplication/RetailBankController?action=editaccountstatus"> Edit Account Status </a> <br> -->
 
 <a href="<%= request.getContextPath()%>/JSP/BankManager/addaccount.jsp">Add Account </a> <br>
 <!-- <a href="/RetailBankApplication/RetailBankController??action=deleteaccount">Delete Account </a> <br>
 
 <a href="/CaseStudy1/managerController?action=removecustomer">Remove Customer </a> <br> -->
<a href="login.jsp">Click here to return to Login page</a>
<br><br>
     <jsp:include page="footer.jsp"/>
</center>
</body>
</html>