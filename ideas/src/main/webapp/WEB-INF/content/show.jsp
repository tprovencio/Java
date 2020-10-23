<!DOCTYPE html>
<html lang="en">
<head>
<%@ page isErrorPage="true" %> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<h1><c:out value="${idea.name}"/></h1>
<a href="/ideas/${idea.id}/edit">Edit Idea</a>
<form action="/ideas/${idea.id}" method="post">

	<p> Name: <c:out value="${idea.name}"></c:out>
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>
</body>