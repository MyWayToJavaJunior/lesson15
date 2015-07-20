<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title></title>
</head>
<body>
<h3>Search of persons:</h3>
<hr>
<a href="${pageContext.servletContext.contextPath}/person/view">View All</a>
<br>
<br>
<form action="${pageContext.servletContext.contextPath}/person/find" method="POST">
  <table>
    <tr>
      <td align="right" >Person name : </td>
      <td>
        <input type="text" name="nameOfPerson">
      </td>
    </tr>
    <tr>
      <td align="right" >Pet name : </td>
      <td>
        <input type="text" name="nameOfPet">
      </td>
    </tr>
    <tr>
      <td><input type="submit" align="center" value="Submit"/></td>
    </tr>
  </table>
</form>
<table border="1">
  <tr>
    <td>Person name:</td>
    <td>Pet name:</td>
    <td>Pet type:</td>
    <td>Pet ability:</td>
    <td>Actions</td>
  </tr>
  <c:forEach items="${findedPersons}" var="person" varStatus="status">
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