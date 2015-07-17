<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h3>Registration Form</h3>
<form action="adduser.view" method="post">
<table border="1" align="left">
	<tr>
		<td>First Name :</td>
		<td><input type="text" id="fname" name="fname" /></td>
	</tr>
	<tr>
		<td>Middle Name :</td>
		<td><input type="text" id="mname" name="mname" /></td>
	</tr>
	<tr>
		<td>Last Name :</td>
		<td><input type="text" id="lname" name="lname" /></td>
	</tr>
	<tr>
		<td>Username :</td>
		<td><input type="text" id="username" name="username" /></td>
	</tr>
	<tr>
		<td>Password :</td>
		<td><input type="text" id="password" name="password" /></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit" value="Submit" /> </td>
	</tr>
</table>
</form>
</body>
</html>