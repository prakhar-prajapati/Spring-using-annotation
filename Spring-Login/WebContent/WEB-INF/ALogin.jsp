<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<center>
<h1>${msg}</h1>
<form action="loginCheck" method="post">
<pre>
<h3>${m}</h3>
USERNAME : <input type="text" name="id">

PASSWORD : <input type="password" name="pass">

           <input type="Submit" value="LOGIN">
           <br/><br/>
           
</pre>
</form>
</center>
</body>
</html>