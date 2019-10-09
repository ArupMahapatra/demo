<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="register" method="post">
Enter name<input type="text" name="name"><br>
Enter password<input type="password" name="password"><br>
Enter email<input type="email" name="email" ><br>
<input type="submit" value="register">
<input type="submit" value="click here already hava an account">
<a href="/Login.jsp"></a>
</form>
${msg}
</body>
</html>