<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add user page</title>
</head>
<body bgcolor="cyan">
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
if (session.getAttribute("uname")==null)
{
	response.sendRedirect("Login.jsp");
}
%>
<%
String ncan=request.getParameter("ncan");
String mob=request.getParameter("mob");
String email=request.getParameter("email");
String city=request.getParameter("city");
%>
<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/deepak" user="root" password=""/>

<sql:query var="rs" dataSource"${db}">select * from student</sql:query>

<c:out value="${mob}"></c:out>

<form action="logoutUser">
<input type="submit" value="Logout">

</body>
</html>