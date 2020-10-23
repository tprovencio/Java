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
<h1>Edit Idea</h1>
<form:form action="/ideas/${idea.id}" method="post" modelAttribute="idea">
    <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    
    <input type="submit" value="Submit"/>
</form:form>

</body>