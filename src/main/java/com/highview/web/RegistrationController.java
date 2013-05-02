package com.highview.web;

import com.highview.app.MemberManagement;
import com.highview.app.RegistrationException;

import javax.inject.Inject;

/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 5/2/13
 * Time: 12:35 PM
 * To change this template use File | Settings | File Templates.
 */


public class RegistrationController {

    @Inject
    MemberManagement memberManagement;
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {

        return email;
    }

   public void register() throws RegistrationException {

       int registrationId = memberManagement.registerForNewsLetter(email);

   }
}
