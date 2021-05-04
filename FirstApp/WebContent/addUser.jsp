<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User Page</title>
</head>
<body bgcolor="cyan" align="center">
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
if (session.getAttribute("uname")==null)
{
	response.sendRedirect("Login.jsp");
}


%>
<h3>Hi, please enter the following details to register a new candidate.....</h3>
<form action="AddUserServ" >
<table border=2 bordercolor="green" align="center">
<tr>
<th><h6>Particulars</h6></th>
<th><h6>Input Fields</h6></th>
</tr>
<tr>
<td>Enter the Candidate Name:</td>
<td> <input type="text" name="ncan" Pattern="[a-zA-Z][a-zA-Z\\s]+" title="Please enter a valid name"></td>
</tr>
<tr>
<td>Enter the Candidate Mob:</td>
<td> <input type="text" name="mob" Pattern="[6789][0-9]{9}" title="Please enter a valid mob number"></td>
</tr>
<tr>
<td>Enter the Candidate Email:</td>
<td> <input type="text" name="email" Pattern="[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+)" title="Please enter a valid email"></td>
</tr>
<tr>
<td>Enter the Candidate City:</td>
<td> <input type="text" name="city" Pattern="[a-zA-Z][a-zA-Z\\s]+" title="Please enter a valid city"></td>
</tr>
</table>
<input type="submit" value="Click here to add candidate">
</form>
<form action="logoutUser">
<input type="submit" value="Logout">
</form>
</body>
</html>