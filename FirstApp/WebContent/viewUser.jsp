<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Candidates</title>
</head>
<body align="center" bgcolor="cyan">
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
if (session.getAttribute("uname")==null)
{
	response.sendRedirect("Login.jsp");
}


%>
<h1>List of all candidates is as below</h1>

<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/deepak" user="root" password=""/>

<sql:query var="rs" dataSource="${db}">select * from candidate</sql:query>
<table border=2 bordercolor="green" align="center">
<tr>
<th><h6>Candidate ID</h6></th>
<th><h6>Candidate name</h6></th>
<th><h6>Candidate mob</h6></th>
<th><h6>Candidate email</h6></th>
<th><h6>Candidate city</h6></th>
</tr>
<c:forEach items="${rs.rows}" var="row">
<tr>
<td><c:out value="${row.id}"></c:out></td>
<td><c:out value="${row.name}"></c:out></td>
<td><c:out value="${row.mob}"></c:out></td>
<td><c:out value="${row.email}"></c:out></td>
<td><c:out value="${row.city}"></c:out></td>
</tr>
</c:forEach>
</table>
<form action="homepage">
<a href="HomePage.jsp"><h2> Click here to go to Home Page</h2></a>
</form>
<form action="logoutUser">
<input type="submit" value="Logout">
</form>
</body>
</html>