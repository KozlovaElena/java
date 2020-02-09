<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main</title>
</head>
<body>
	<center>
		<h2>Welcome to the main page!</h2>
	</center>
	<form name="Richest User" method="POST" action="FrontController">
		<input type="hidden" name="command" value="GET_RICHEST_USER" /> <input
			type="submit" value="richest user"></input>
	</form>
	<p>
		<i></i>
	</p>
	<form name="Account Sum" method="POST" action="FrontController">
		<input type="hidden" name="command" value="GET_ACCOUNTS_SUM" /> <input
			type="submit" value="accounts sum"></input>
	</form>

</body>
</html>