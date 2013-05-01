package com.highview.app;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 4/30/13
 * Time: 1:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class MemberRepository {

    private static Set<String> member = new HashSet<>();

    /**
     *
     * @param email
     * @return
     */
    public boolean alreadyRegistered(String email)  {

            return member.contains(email) ;
    }


    /**
     *  Register a new email address for our news letter
     * @param email
     */
    public void insert(String email) {

            member.add(email);


    }
}
