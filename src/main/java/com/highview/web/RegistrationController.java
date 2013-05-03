package com.highview.web;

import com.highview.app.MemberManagement;
import com.highview.app.RegistrationException;


import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 5/2/13
 * Time: 12:35 PM
 * To change this template use File | Settings | File Templates.
 */


@Named(value = "registrationControl")
@RequestScoped
public class RegistrationController {



    @Inject
    MemberManagement memberManagement;


    private String email ;
    private int registrationId;
    private String fullname;
    private String country;

    public int getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {

        return email;
    }

   public String register()  {

       try {
           this.registrationId = memberManagement.registerForNewsLetter(email,country,fullname);
           return "thanks";
       } catch (RegistrationException e) {
           FacesContext fc = FacesContext.getCurrentInstance();
           FacesMessage message = new FacesMessage("email adress already registered!");
           fc.addMessage("registrationForm:email",message);

           return null;
       }

   }


    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
