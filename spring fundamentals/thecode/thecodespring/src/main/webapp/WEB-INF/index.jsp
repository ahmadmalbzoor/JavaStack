<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red"><c:out value="${error}"/></h1>
<label>What is the code?</label><br>
<form action="/checkpage" method="POST">
  <input type="text" id="code" name="code" ><br><br>
  <input type="submit" value="Try Code">
</form> 
</body>
</html>