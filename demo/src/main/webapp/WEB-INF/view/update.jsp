<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update/${obj.id}" method="post">
<table>
<tr>
<th>Enter name</th>
<td><input type="text" name="name" value="${obj.name}">
</tr>
<tr>
<th>Enter email</th>
<td><input type="text" name="email" value="${obj.email}">
</tr>
<tr>
<th>Enter ph</th>
<td><input type="text" name="ph" value="${obj.ph}">
</tr>
<tr>
<th>Enter gender</th>
<td><input type="text" name="gen" value="${obj.gen}">
</tr>
</table>

<input type="submit" value="update">
</form>
</body>
</html>