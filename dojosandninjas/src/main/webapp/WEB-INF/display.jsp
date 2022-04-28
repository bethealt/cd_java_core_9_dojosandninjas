<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Display Dojo</title>
</head>
<body>
    <table>
        <tr>
            <td><a href="/dojos/new"><input type="button" value="Add Dojo"></a></td>
            <td><a href="/ninjas/new"><input type="button" value="Add Ninja"></a></td>
            <td><a href="/dojos"><input type="button" value="Go Back"></a></td>
        </tr>
    </table>
    <br>
    <h1><c:out value="${dojo.name}"></c:out> Location Ninjas</h1>
    <table>
        <thead>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Age</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="ninja" items="${dojo.ninjas}">
                <tr>
                    <td><c:out value="${dojo.ninja.firstName}"></c:out></td>
                    <td><c:out value="${dojo.ninja.lastName}"></c:out></td>
                    <td<c:out value="${dojo.ninja.age}"></c:out></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>