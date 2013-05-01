package com.highview.app;

/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 4/30/13
 * Time: 12:17 PM
 * To change this template use File | Settings | File Templates.
 */



import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 * @author Allan Pana
 */
@Singleton
public class MemberManagement {
    @Inject
    MemberRepository memberRepository;

    /**
     * Register a new email address for our news letter
     * @param email  the email to register
     * @throwsRegistrationExceptionException when email has been registered already
     * @return a unique regiastration Id
     */
    public int registerForNewsLetter(String email) throws RegistrationException {
        String emailLowercase = email.toLowerCase();

        boolean isRegistered = memberRepository.alreadyRegistered(emailLowercase);

        if(isRegistered) {
            throw new RegistrationException(emailLowercase + "already register");

        }

        memberRepository.insert(emailLowercase);
        return email.hashCode();

    }
}
