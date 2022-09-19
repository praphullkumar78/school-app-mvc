<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>

	<form:form action="save" modelAttribute="student">

		<form:label path="name">Name:</form:label>
		<form:input path="name" /><br>

		<form:label path="age">Age:</form:label>
		<form:input path="age"/>
	
		<input type="submit" value="save">

	</form:form>
</body>
</html>