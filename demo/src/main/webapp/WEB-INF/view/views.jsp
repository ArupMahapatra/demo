<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<table border="3" width="80">
		<tr>
			<td>Id</td>
			<td>name</td>
			<td>email</td>
			<td>ph</td>
			<td>gender</td>
		</tr>
		
	 <c:forEach items="${obj}" var="dd">
		<tr>
			<td><c:out value="${dd.id}"/></td>
			<td><c:out value="${dd.name}"/></td>
			<td><c:out value="${dd.email}"/></td>
			<td><c:out value="${dd.ph}"/></td>
			<td><c:out value="${dd.gen}"/></td>
			<td><a href="edit/${dd.id}" >edit</a></td>
			<td><a href="delete/${dd.id}" >Delete</a></td>
		</tr>
	</c:forEach> 
	</table>
</body>
</html>