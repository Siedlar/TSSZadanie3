<%--
  Created by IntelliJ IDEA.
  User: Siedlar
  Date: 2020-04-19
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<form action="${pageContext.request.contextPath}/hello" method="get">
    <h3>Podaj id samochodu ktory chcesz usunąć</h3>
    <input type="number" name="id"required/>
    <input type="submit" name="funkcja" value="usun"/>
</form>
<br><br>
<a href="index.jsp">Powrot do widoku glownego</a>
</body>
</html>
