<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title></title>
</head>
<body>
<a href="${pageContext.servletContext.contextPath}/views/person/CreatePerson.jsp">Add Person</a>
<table border="1">
  <tr>
    <td>Person name:</td>
    <td>Pet name:</td>
    <td>Pet type:</td>
    <td>Pet ability:</td>
    <td>Actions</td>
  </tr>
  <c:forEach items="${persons}" var="person" varStatus="status">
    <tr valign="top">
      <td>${person.nameOfPerson}</td><td> ${person.petOfPerson.nameOfPet}</td>
      <td> ${person.getTypeOfPet()}</td><td>${person.getAbilityOfPet()}</td>
      <td>
        <a href="${pageContext.servletContext.contextPath}/person/edit?id=${person.id}">Edit</a>
        <a href="${pageContext.servletContext.contextPath}/person/delete?id=${person.id}">Delete</a>
      </td>
    </tr>
  </c:forEach>
</table>
</body>
</html>