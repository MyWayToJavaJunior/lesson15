<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<title></title>
</head>
<body>
<a href="${pageContext.servletContext.contextPath}/views/user/CreateUser.jsp">Add user</a>
<table border="1">
	<tr>
		<td>Login Email</td>
		<td>Actions</td>
	</tr>
	<c:forEach items="${users}" var="user" varStatus="status">
		<tr valign="top">
			<td>${user.login} ${user.email}</td>
			<td>
				<a href="${pageContext.servletContext.contextPath}/user/edit?id=${user.id}">Edit user</a>
				<a href="${pageContext.servletContext.contextPath}/user/delete?id=${user.id}">Delete user</a>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>