<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>
<body>

	<form:form action="update" modelAttribute="student">

		<form:label path="id">Id:</form:label>
		<form:input path="id" />
		<br>

		<form:label path="name">Name:</form:label>
		<form:input path="name" />
		<br>

		<form:label path="age">Age:</form:label>
		<form:input path="age" />

		<input type="submit" value="Edit">

	</form:form>

</body>
</html>