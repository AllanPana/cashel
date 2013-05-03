package com.highview.app;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 5/3/13
 * Time: 11:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class Member {
    private Long id;
    private String fullName;
    private String email;
    private String country;
    private boolean active;

    public Member(String fullName, String email, String country) {
        this.fullName = fullName;
        this.email = email;
        this.country = country;
    }

    public void activeMembership(){

    }
}
