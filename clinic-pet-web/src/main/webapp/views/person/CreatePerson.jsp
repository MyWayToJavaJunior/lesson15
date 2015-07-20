<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title></title>
</head>
<body>
<h3>Add person:</h3>
<hr>
<form action="${pageContext.servletContext.contextPath}/person/create" method="POST">
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
      <td align="right" >Pet name : </td>
      <td>
        <select size = "1" required size = "1" name = "ClassOfPet">
          <option value = "Cat">Cat</option>
          <option value = "Bird">Bird</option>
          <option value = "Dog">Dog</option>
        </select>
      </td>
    </tr>
    <tr>
      <td><input type="submit" align="center" value="Submit"/></td>
    </tr>
  </table>
</form>
</body>
