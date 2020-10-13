<!DOCTYPE html>
<html lang="en">
<head>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<form method="POST" action="/result">
    <label>Name <input type="text" name="name"></label>
    <label>Dojo Location <input type="text" name="location"></label>
    <label>Favorite Language <input type="text" name="language"></label>
    <label>Comment(optional) <input type="text" name="comment"></label>
    <button type="submit">Login</button>
</form>

    
</body>
</html>
