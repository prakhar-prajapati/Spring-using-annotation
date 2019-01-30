<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>${msg}</h1>
<form action="insert" method="post">
<pre>
NAME    :   <input type="text" name="name">
SALARY  :   <input type="text" name="sal">
ADDRESS :   <input type="text" name="add">

           <input type="Submit" value="SUBMIT">
           <br/><br/>
           
</pre>
</form>
</center>

</body>
</html>