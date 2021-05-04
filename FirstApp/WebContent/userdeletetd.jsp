<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User deleted</title>
</head>
<body align="center" bgcolor="cyan">
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
if (session.getAttribute("uname")==null)
{
	response.sendRedirect("Login.jsp");
}
%>
<h3> Hi, candidate deleted sucessfully.......</h3>

<form action="homepage">
<a href="HomePage.jsp"><h2> Click here to go to Home Page</h2></a>
</form>

<form action="logoutUser">
<input type="submit" value="Logout">
</form>
</body>
</html>