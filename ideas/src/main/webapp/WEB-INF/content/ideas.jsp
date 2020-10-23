<!DOCTYPE html>
<html lang="en">
<head>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h1>All Ideas</h1>
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Creator</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${ideas}" var="idea">
        <tr>
            <td><a href="/ideas/${idea.id }"><c:out value="${idea.name}"/></a></td>
            <td><c:out value="${idea.creator}"/></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
<a href="/ideas/new">Create an Idea</a>
</body>