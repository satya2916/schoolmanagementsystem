<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="jquery-1.9.1.js"></script>
<!-- <script type="text/javascript" src="jquery.min.js"/></script> -->
<script>
$(document).ready(function(){
	$("#username").focus(function(){
		
	});	
});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>School Management System</title>
</head>
<body>
<h1 align="center">School Management System</h1>
<table><tr><td>
<form action="login.view" method="post" >
<table align="center" >
<tr>
	<td>UserId :</td> 
	<td> <input type="text" id="username" name="username"/> </td>
</tr>
<tr>
	<td>Password :</td> 
	<td> <input type="password" id="password" name="password"/> </td>
</tr>
<tr>
	<td></td>
	<td><input type="submit" value="Submit" /> </td>
</tr>
<tr>
	<td></td>
	<td>${msg}</td>
</tr>
</table>
</form>
</td>
<td>
<form action="adduserpage.view" method="post">
<table align="right">
	<tr><td>Is this your first time?</td></tr>
	<tr><td><input type="submit" value="Register"/></td></tr>
</table>
</form>
</td></tr></table>
</body>
</html>