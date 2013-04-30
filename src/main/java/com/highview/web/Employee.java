package com.highview.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 4/24/13
 * Time: 10:14 PM
 * To change this template use File | Settings | File Templates.
 */
@WebServlet("/Employee")
public class Employee extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        String firstname = httpServletRequest.getParameter("firstname") ;
        String lastname = httpServletRequest.getParameter("lastname") ;

        httpServletResponse.getWriter().print("Hello from doGet Method by " + firstname + " " + lastname);
    }

    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {


    }
}
