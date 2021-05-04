<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body bgcolor="skyblue">
<h1 text color="green">Welcome to the first application ${uname}</h1>
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
if (session.getAttribute("uname")==null)
{
	response.sendRedirect("Index.jsp");
}
%>
<form action="addUser">
<a href="addUser.jsp"><h2> Click here to add a candidate</h2></a>
<a href="viewUser.jsp"><h2> Click here to View all candidate</h2></a>
<a href="deleteuser.jsp"><h2> Click here to Delete a candidate</h2></a>
</form>
Rest enjoy this video..........<br>
<iframe width="560" height="315" src="https://www.youtube.com/embed/E53vZJQhJjI" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe> <br>

<form action="logoutUser">
<input type="submit" value="logout">
</form>

</body>
</html>