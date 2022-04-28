<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dojos & Ninjas</title
</head>
<body>
    <h1>Dojos & Ninjas</h1>
    <table>
        <tr>
            <td><a href="/dojos/new"><input type="button" value="Add Dojo"></a></td>
            <td><a href="/ninjas/new"><input type="button" value="Add Ninja"></a></td>
        </tr>
    </table>
    <br>
    <table>
        <thead>
            <tr><th>LOCATIONS</th></tr>
        </thead>
        <tbody>
            <c:forEach var="dojo" items="${dojos}">
                <tr>
                    <td><a href="/dojos/${dojo.id}"><c:out value="${dojo.name}"></c:out></a></td>
                 </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
