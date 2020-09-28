<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url var="R" value="/" />
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
        rel="stylesheet" media="screen">
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="${R}res/common.js"></script>
  <link rel="stylesheet" href="${R}res/common.css">
</head>
<body>
<div class="container">
  <h1>고객 목록</h1>
  <table id="articles" class="table table-bordered">
    <thead>
      <tr>
        <th>ID</th>
        <th>이름</th>
        <th>직위</th>
        <th>전화</th>
        <th>도시</th>
        
      </tr>
    </thead>
    <tbody>
      <c:forEach var="customer" items="${ list }">
        <tr>
          <td>${ customer.id }</td>
          <td>${ customer.last_name } ${ customer.first_name } </td>
          <td>${ customer.job_title }</td>
          <td>${ customer.business_phone }</td>
          <td>${ customer.city }</td>
        
        </tr>
      </c:forEach>
    </tbody>
  </table>
 
</div>
</body>
</html>

