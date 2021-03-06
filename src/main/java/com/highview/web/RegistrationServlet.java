package com.highview.web;

import com.highview.app.MemberManagement;
import com.highview.app.RegistrationException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 4/30/13
 * Time: 11:40 AM
 * To change this template use File | Settings | File Templates.
 */


@WebServlet("/newsletter/register")
public class RegistrationServlet extends HttpServlet {

    @Inject
    MemberManagement memberManagement;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email") ;
        String fullName = request.getParameter("fullname") ;
        String country = request.getParameter("country");


        try {

            int registrationId = memberManagement.registerForNewsLetter(fullName, country, email);

            request.setAttribute("regId", registrationId);
            request.setAttribute("yourEmail",email);

            RequestDispatcher rd = request.getRequestDispatcher("thanks.jsp");

            rd.forward(request,response);


        } catch (RegistrationException e) {
            throw new ServletException(e);
        }



    }
}
