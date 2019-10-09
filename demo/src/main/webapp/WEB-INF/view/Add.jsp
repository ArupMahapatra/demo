<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="add" method="post">
Enter name<input type="text" name="name"><br>
Enter email<input type="email" name="email" ><br>
Enter ph<input type="text" name="ph"><br>
Gender<input type="radio" name="gen" value="Male">Male
<input type="radio" name="gen" value="Female">Female
<input type="submit" value="add">

</form>
</body>
</html>