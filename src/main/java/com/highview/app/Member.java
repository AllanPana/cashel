package com.highview.app;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 5/3/13
 * Time: 11:51 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Member {
    
    @Id
    @GeneratedValue
    private Long id;
    private String fullName;
    private String email;
    private String country;
    private boolean active;

    protected Member() {
    }

    public Member(String fullName, String email, String country) {
        this.fullName = fullName;
        this.email = email.toLowerCase();
        this.country = country;
    }

    public void activeMembership(){
        
        this.active = true;

    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
