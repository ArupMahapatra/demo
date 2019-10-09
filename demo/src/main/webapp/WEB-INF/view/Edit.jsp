<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="edit/${obj.id}" method="post">
Enter name<input type="text" name="name" value="${obj.name}"><br>
Enter email<input type="email" name="email" value="${obj.email}"><br>
Enter ph<input type="text" name="ph" value="${obj.ph}"><br>
Gender<input type="radio" name="gen" value="Male" value="${obj.gen}">Male
<input type="radio" name="gen" value="Female" value="${obj.name}">Female
<input type="submit" value="update">

</form>
</body>
</html>