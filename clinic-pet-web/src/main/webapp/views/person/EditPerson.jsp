<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title></title>
</head>
<body>
<h3>Edit person:</h3>
<hr>
<form action="${pageContext.servletContext.contextPath}/person/edit" method="POST">
  <input type="hidden" name="id" value="${person.id}">
  <table>
    <tr>
      <td align="right" >Person name : </td>
      <td>
        <input type="text" name="nameOfPerson" value="${person.nameOfPerson}">
      </td>
    </tr>
    <tr>
      <td align="right" >Name of pet :</td>
      <td>
        <input type="text" name="nameOfPet" value="${person.petOfPerson.nameOfPet}">
      </td>
    </tr>
    <tr>
      <td><input type="submit" align="center" value="Submit"/></td>
    </tr>
  </table>
</form>
</body>
</html>