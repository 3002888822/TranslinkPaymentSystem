<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body {background-color: rgb(186, 196, 250);}
h1   {color: rgb(21, 21, 121);
margin-left: 250px;
margin-top: 40px;}


</style>

<title>Welcome</title>
</head>
<body>
	<table>
		<tr>
			<td>Welcome ${firstname}</td>
		</tr>
		<tr>
		<td><button id="delete" value="delete">delete account</button></td>
		</tr>
		<tr>
		<td><button id="update" value="update">update account</button></td>
		</tr>
		<tr>
			<td><a href="home.jsp">Home</a></td>
		</tr>
	</table>
</body>
</html>