<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>
		You have visited <a href="https://localhost:8080">localhost:8080</a>
		<c:out value="${count}"/>times.
	</h3>
	<h2>
		<a href="http://127.0.0.1:8080/">Test another visit?</a>
	</h2>
</body>
</html>