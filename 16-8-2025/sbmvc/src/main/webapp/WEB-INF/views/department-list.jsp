<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Department List</title>
</head>
<body>
<h2>Departments</h2>
    <table border="1">
        <tr>
            <th>ID</th><th>Name</th>
        </tr>
        <c:forEach var="dept" items="${departments}">
            <tr>
                <td>${dept.id}</td>
                <td>${dept.deptName}</td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="${pageContext.request.contextPath}/employee/list">Back to Employees</a>

</body>
</html>