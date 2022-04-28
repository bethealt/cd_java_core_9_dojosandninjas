<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Ninja</title>
</head>
<body>
    <h1>Create Ninja</h1>
    <form:form action="/ninjas/new" method="POST" modelAttribute="ninja">
        <p>
            <form:label path="dojo">Dojo</label>
            <form:select path="dojo">
            <c:forEach var="oneDojo" items="${dojos}">
                <form:option value="${oneDojo}">
                    ${oneDojo.name} Location
                </form:option>
            </c:forEach>
            </form:select>
        </p>
        <p>
            <form:label path="firstName">First Name</form:label>
            <form:errors path="firstName"></form:errors>
            <form:input path="firstName"></form:input>
        </p>
        <p>
            <form:label path="lastName">Last Name</form:label>
            <form:errors path="lastName"></form:errors>
            <form:input path="lastName"></form:input>
        </p>
        <p>
            <form:label path="age">Age</form:label>
            <form:errors path="age"></form:errors>
            <form:input path="age"></form:input>
        </p>
        <input type="submit" value="Create"/>
    </form:form>
</body>
</html>