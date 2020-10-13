<!DOCTYPE html>
<html lang="en">
<head>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h2> Submitted Info:</h2>
<p>Name: <c:out value="${name}"></c:out></p>
<p>Location: <c:out value="${location}"></c:out></p>
<p>Favorite Language: <c:out value="${language}"></c:out></p>
<p>Comments: <c:out value="${comment}"></c:out></p>

<a href="/">Go Back</a>
</body>
</html>
