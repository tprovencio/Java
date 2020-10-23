<!DOCTYPE html>
<html lang="en">
<head>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h1>New Idea</h1>
<form action="/ideas" method="post">
    <p>
        <label path="name">Name</label>
        <errors path="name"/>
        <input name="name"/>
    </p>
        <p>
        <label path="creator"></label>
        <errors path="creator"/>
        <input hidden="true" name="creator" value="${user}"/>
    </p>
    
  
    <input type="submit" value="Submit"/>
</form>    

</body>