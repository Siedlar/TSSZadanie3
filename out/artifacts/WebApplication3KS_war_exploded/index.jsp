<%@ page import="java.time.LocalDate" %>
<%@ page import="com.siedlar.CarList" %>
<%@ page import="com.siedlar.Car" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Siedlar
  Date: 2020-04-19
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  LocalDate data=LocalDate.now();%>
          <html>
  <head>
    <%
      CarList listaAut;
      if(session.getAttribute("obiekt")==null){
     listaAut=new CarList();}else{
        listaAut=(CarList) session.getAttribute("obiekt");
      }
    %>
  </head>
  <body>
  <title>WEBAPPLICATION3KS</title>
  <p>Autor projektu:Krystian Siedlarski </p>
  <p>Aktualna data:
    <%
      out.print(data);

    %></p>
  <table cellspacing="1" cellpadding="4" border="3">
    <th> ID</th>
    <th> Marka</th>
    <th> Model</th>
    <th> Konie Mechaniczne</th>
    <%for(int row=0;row<listaAut.getLista().size();row++){%>
    <tr>
      <td>
        <% out.print(row+1);%>
      </td>
      <td>
        <% out.print(listaAut.getLista().get(row).getMarka());%>
      </td>
      <td>
        <% out.print(listaAut.getLista().get(row).getModel());%>
      </td>
      <td>
        <% out.print(listaAut.getLista().get(row).getKm());%>
      </td>
    </tr>
    <%}%>
  </table>
  <br><br>
  <%session.setAttribute("obiekt",listaAut);%>
  <form action="${pageContext.request.contextPath}/hello" method="get">
    <input type="submit" name="funkcja" value="Wyswietl samochody" />
  </form>
  <form action="dodaj.jsp" >
    <input type="submit" value="Przejdz do strony dodawania" />
  </form>
  <form action="usun.jsp" >
    <input type="submit" value="Przejdz do strony usowania" />
  </form>
  </body>
</html>
