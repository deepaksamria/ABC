<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body bgcolor="cyan">
<div align="center">
<h4> Hello!!! Please login to get database access</h4>

<form action="ValidateUser" method="post">

Enter the username:<input type = "text" name="uname"> <br>
Enter the password:<input type = "password" name="pass"> <br>
<input type = submit value= "Click here to login">

</form>

</div>

</body>
</html>