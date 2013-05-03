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
@javax.ejb.Singleton
public class MemberManagement {


    @Inject
    MemberRepository memberRepository;





    /**
     * Register a new email address for our news letter
     *
     * @param fullName
     * @param country
     *@param email  the email to register  @throwsRegistrationExceptionException when email has been registered already
     * @return a unique regiastration Id
     */
    public int registerForNewsLetter(String fullName, String country, String email) throws RegistrationException {

        Member member = new Member(fullName, country, email) ;


        boolean isRegistered = memberRepository.alreadyRegistered(member);

        if(isRegistered) {
            throw new RegistrationException(email + "already register");

        }

        memberRepository.insert(member);
        return member.getEmail().hashCode();

    }
}
