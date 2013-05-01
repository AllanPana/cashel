package com.highview.app;

/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 4/30/13
 * Time: 12:17 PM
 * To change this template use File | Settings | File Templates.
 */

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

        MemberRepository memberRepository = new MemberRepository();
        boolean isRegistered = memberRepository.alreadyRegistered(email);

        if(isRegistered) {
            throw new RegistrationException(email + "already register");

        }

        memberRepository.insert(email);
        return email.hashCode();

    }
}
