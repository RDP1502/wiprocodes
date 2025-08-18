<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employees</title>
</head>
<body>
<h2>All Employees</h2>
    <table border="1">
        <tr>
            <th>ID</th><th>Name</th><th>Email</th><th>Type</th><th>Actions</th>
        </tr>
        
        <c:forEach var="emp" items="${employees}">
            <tr>
                <td>${emp.id}</td>
                <td>${emp.empName}</td>
                <td>${emp.empEmail}</td>
                <td>${emp.empType}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/employee/edit/${emp.id}">Edit</a>
                    <a href="${pageContext.request.contextPath}/employee/delete/${emp.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="${pageContext.request.contextPath}/employee/new">Add New Employee</a>

</body>
</html>
