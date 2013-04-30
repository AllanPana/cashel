package com.highview.app;

/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 4/30/13
 * Time: 12:17 PM
 * To change this template use File | Settings | File Templates.
 */

import javax.management.MBeanRegistrationException;

/**
 *
 * @author Allan Pana
 */
public class MemberManagement {


    /**
     * Register a new email address for our news letter
     * @param email  the email to register
     * @throwsRegistrationExceptionException when email has been registered already
     * @return a unique regiastration Id
     */
    public int registerForNewsLetter(String email) throws RegistrationException {

        MemberDAO memberDAO = new MemberDAO();
        boolean isRegistered = memberDAO.alreadyRegistered(email);

        if(isRegistered) {
            throw new RegistrationException(email + "already register");

        }

        memberDAO.insert(email);
        return email.hashCode();

    }
}
