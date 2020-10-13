<!DOCTYPE html>
<html lang="en">
<head>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<p><c:out value="${error}"></c:out></p>
<H1>What is the code?</H1>
<form method="POST" action="/code">
<input  name="code" type="text"></input>
<button type="submit">Try Code</button>
</form>
<script type="text/javascript" src="js/app.js"></script>
    
</body>
</html>
