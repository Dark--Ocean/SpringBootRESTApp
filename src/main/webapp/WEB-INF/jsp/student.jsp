<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <style>
        table thead tr th{
            padding: 5px;
            border: 1px solid #dddddd;
        }
        table tbody tr td{
            padding: 5px;
            border: 1px solid #dddddd;
        }
    </style>
</head>
<title>BOOT</title>
<body>

This is my first boot app!!!
<br>
Email Address: ${email}
<br>
Department Name : ${dept}

<br>
<table>
    <thead>
    <tr>
        <th>SL#</th>
        <th>Name</th>
        <th>Description</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${pieList}" var="pie" varStatus="i">
    <tr>
        <td>${i.index}</td>
        <td>${pie.name}</td>
        <td>${pie.description}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>


</body>


</html>
