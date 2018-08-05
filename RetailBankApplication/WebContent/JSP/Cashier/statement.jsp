<%@ page import="java.sql.*"%>

<%
	Class.forName("oracle.jdbc.driver.OracleDriver");
%>

<HTML>
<HEAD>
<TITLE>Selecting Transactions From a Database</TITLE>
</HEAD>

<BODY>
	<H1>Selecting Transactions From a Database</H1>

	<%
		Connection connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@INGNRGPILPHP01:1521:ORCLILP",
				"aja33core", "aja33core");

		Statement statement = connection.createStatement();
		ResultSet resultset = statement
				.executeQuery("SELECT TRANSACTIONID FROM TRANSACTION_GROUP3");
	%>
<form action="<%=request.getContextPath()%>/RetailBankController" method="post">
	<TABLE>
		<br>ACCOUNT ID:
		<input type="text" name="accid">
		<br>
		<br>Transaction ID:
		<select name="tranid">
			<%
				while (resultset.next()) {
			%>

			<option><%=resultset.getString(1)%></option>

			<%
				}
			%>
		</select><br>
		<br><button type="submit" name="action" value="submit">Submit</button>
	</TABLE>
	</form>
</BODY>
</HTML>