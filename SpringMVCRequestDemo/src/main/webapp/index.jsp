<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Spring View</title>
</head>
<body>
    <h2>Hello from Spring MVC!</h2>

    <p>User ID: ${userId}</p>
    <p>Name: ${name}</p>
    <p>Location: ${location}</p>

    <a href="/Demo/home?id=10&name=Chaitanya&location=Ahmednagar">Go to Home</a><br>
    <a href="/Demo/getStudent?id=99">Get Student</a>
</body>
</html>
