package com.siedlar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/hello")
public class MainServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        HttpSession session = req.getSession(true);
        CarList lista = (CarList) session.getAttribute("obiekt");
      if(req.getParameter("funkcja").equals("Wyswietl samochody")){
          String wynik=lista.wypisz();
          out.println("<html>");
          out.println("<body>");
          out.println("<h1>TO jest Servlet-Wyswietlanie</h1>");
          out.println("<p>"+wynik+"</p>");
          out.println("<a href=\"index.jsp\">Powrot do widoku glownego</a>");
          out.println("</body></html>");
      }else if(req.getParameter("funkcja").equals("dodaj")){
          out.println("<html>");
          out.println("<body>");
          String marka=req.getParameter("marka");
          String model=req.getParameter("model");
         int km=Integer.parseInt(req.getParameter("km"));
         out.println("<p> Dodano do bazy: "+marka+" "+model+" "+km+"</p>");
          out.println("<a href=\"index.jsp\">Powrot do widoku glownego</a>");
          out.println("</body></html>");
          Car car=new Car(marka,model,km);
          lista.dodaj(car);
          System.out.println( lista.wypisz());
          session.setAttribute("obiekt",lista);
        }else if(req.getParameter("funkcja").equals("usun")){
          int id=Integer.parseInt(req.getParameter("id"));
          String wiadomosc=null;
          try{
         wiadomosc=lista.usun(id);
              out.println("<html>");
              out.println("<body>");
              out.println(wiadomosc+"<br><br>");
              out.println("<a href=\"index.jsp\">Powrot do widoku glownego</a>");
              out.println("</body></html>");
              session.setAttribute("obiekt",lista);
          }catch (IndexOutOfBoundsException e){
              out.println("<html>");
              out.println("<body>");
              out.println("Indeks o podanym id nie istnieje w bazie<br><br>");
              out.println("<a href=\"index.jsp\">Powrot do widoku glownego</a>");
              out.println("</body></html>");
          }

      }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
