package com.highview.web;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 4/29/13
 * Time: 4:20 PM
 * To change this template use File | Settings | File Templates.
 */

@WebServlet("/SevletExample")
public class ServletExample extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {


        httpServletResponse.setContentType("text/html");
        ServletOutputStream out = httpServletResponse.getOutputStream();


        String name = httpServletRequest.getParameter("name") ;
        String upperCaseName = name.toUpperCase();
        out.println(upperCaseName);

        if("allan".equals(name)) {
            httpServletResponse.sendRedirect("www.yahoo.com");
        }

        out.println("<html>");
        out.println("<title>");
            out.print("Servlet Example");
        out.println("</title>");
        out.println("<body>");
            out.println("<h1>");
               out.print("My name is ");
               out.print(upperCaseName);
            out.println("</h1>");
        out.println("</body>");
        out.println("</html>");



    }
}
