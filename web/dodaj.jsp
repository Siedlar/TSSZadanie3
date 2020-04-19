<%--
  Created by IntelliJ IDEA.
  User: Siedlar
  Date: 2020-04-19
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>essa</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/hello" method="get">
   <h3>Marka</h3> <input type="text" name="marka"/>
    <h3>Model</h3>   <input type="text" name="model"/>
    <h3>Konie Mechaniczne</h3>  <input type="text" name="km"/><br>
    <input type="submit" name="funkcja" value="dodaj"/>
</form>
</body>
</html>



