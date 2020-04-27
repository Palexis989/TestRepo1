<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>

<body>

<h3 align="center">Welcome!</h3>
<p align="center">Please, choose your account credentials and insert your personal informations:</p>
<form method="POST" action="SubServ1">
    <p align="center">Account:</p>
    <p align="left">Username: <input type="text" name="username" size="24"> </p>
    <p align="left">Password: <input type="password" name="password" size="24"> </p>
    <p align="center">Personal Data:</p>
    <p align="left">Name: <input type="text" name="name" size="24"></p>
    <p align="left">Surname: <input type="text" name="surname" size="24"></p>
    <p align="left">Nickname: <input type="text" name="nickname" size="24"></p>
    <p align="left">Email: <input type="email" name="email" size="24"></p>
    <p align="center"><input type="submit" value="Submit" name="b1"><input type="reset" value="Reset" name="b2"></p>
</form>

</body>

</html>