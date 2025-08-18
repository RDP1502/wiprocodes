<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>
</head>
<body>
 <h2>Employee Form</h2>
 
 <form:form method="post" modelAttribute="employee" action="save">
    <form:hidden path="id"/>

    Name: <form:input path="empName"/><br/>
    Email: <form:input path="empEmail"/><br/>
    Salary: <form:input path="empSalary"/><br/>
    Type: 
    <form:select path="empType">
        <form:option value="regular" label="Regular"/>
        <form:option value="contract" label="Contract"/>
    </form:select><br/><br/>

    <h3>Address</h3>
    State: <form:input path="address.state"/><br/>
    City: <form:input path="address.city"/><br/>
    Zipcode: <form:input path="address.zipcode"/><br/><br/>

    <h3>Department</h3>
    <form:select path="department.id">
        <form:options items="${departments}" itemValue="id" itemLabel="deptName"/>
    </form:select><br/><br/>

    <input type="submit" value="Save"/>
 </form:form>

 <br/>
 <a href="${pageContext.request.contextPath}/employee/list">Back to List</a>
</body>
</html>
