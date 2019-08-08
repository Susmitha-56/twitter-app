<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=chrome">
    <title>Employee Registration</title>
</head>
<body>
<h1>Please Register</h1><hr>
<h2>
<form action="/xyz/register" method="POST" modelAttribute="user">
username: <input type="text" name="name" required><br><p>
Password: <input type="password" name="password" required><br><p>
E-mail: <input type="email" name="email" required><br><p>
city: <input type="text" name="city" required><br><p>
street: <input type="text" name="street" required><br><p>
state: <input type="text=" name="state" required><br><p>
zipcode code: <input type="text" name="zipcode" required><br><p>
<input type="submit" name="b1" value="REGISTER" ></h2>
</form>
</body>
</html>