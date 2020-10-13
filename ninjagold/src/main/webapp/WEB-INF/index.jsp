<!DOCTYPE html>
<html lang="en">
<head>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Ninja Gold</h1>
    <p> <c:out value="${gold}"></c:out></p>

    <div>
        <form action="/process_gold" method= "POST">
            
            <input type="hidden" name="building" value="farm">
            <h2>Farm</h2>
            <p>(earns 10-20 gold)</p>
            <button type="submit">Farm Gold</button>
        </form>
    </div>

    <div>
        <form action="/process_gold" method= "POST">
            <input type="hidden" name="building" value="cave">
            <h2>Cave</h2>
            <p>(earns 5-200)</p>
            <button type="submit">Mine Gold</button>
        </form>
    </div>

    <div>
        <form action="/process_gold" method= "POST">
            
            <input type="hidden" name="building" value="house">
            <h2>House</h2>
            <p>(earns/takes 0-50 gold)</p>
            <button type="submit">House Gold</button>
        </form>
    </div>

    <div>
        <form action="/process_gold" method= "POST">
            
            <input type="hidden" name="building" value="casino">
            <h2>Casino</h2>
            <p>(earns/takes 500 gold)</p>
            <button type="submit">Gamble Gold</button>
        </form>
    </div>
</body>
</html>