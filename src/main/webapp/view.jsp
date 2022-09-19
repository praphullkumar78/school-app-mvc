<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Page</title>
</head>
<body>
	<table border="2px">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Age</td>
		</tr>

		<tr>
	<c:forEach items="${students}" var="student">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.age}</td>
				<td><a href="delete?id=${student.id}">delete</a></td>
				<td><a href="edit?id=${student.id}">edit</a></td>
			</tr>
		</c:forEach>
		</tr>

	</table>
</body>
</html>