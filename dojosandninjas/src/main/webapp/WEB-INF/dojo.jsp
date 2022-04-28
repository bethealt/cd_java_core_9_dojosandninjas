<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Dojo</title>
</head>
<body>
    <h1>Create Dojo</h1>
    <form:form action="/dojos/new" method="POST" modelAttribute="dojo">
        <p>
            <form:label path="name">Dojo Name</form:label>
            <form:errors path="name"></form:errors>
            <form:input type="text" path="name"></form:input>
        </p>
        <input type="submit" value="Create"/>
    </form:form>
</body>
</html>