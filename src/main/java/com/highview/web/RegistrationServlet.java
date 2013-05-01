package com.highview.web;

import com.highview.app.MemberManagement;
import com.highview.app.RegistrationException;

import javax.servlet.RequestDispatcher;
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
 * Date: 4/30/13
 * Time: 11:40 AM
 * To change this template use File | Settings | File Templates.
 */


@WebServlet("/newsletter/register")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String myEmail = request.getParameter("email") ;
        String email = myEmail.toLowerCase();
        MemberManagement memberManagement = new MemberManagement();





        try {

            int registrationId = memberManagement.registerForNewsLetter(email);

            request.setAttribute("regId", registrationId);
            request.setAttribute("yourEmail",email);

            RequestDispatcher rd = request.getRequestDispatcher("thanks.jsp");

            rd.forward(request,response);


        } catch (RegistrationException e) {
            throw new ServletException(e);
        }



    }
}
