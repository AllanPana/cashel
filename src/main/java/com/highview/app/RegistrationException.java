package com.highview.app;

/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 4/30/13
 * Time: 1:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class RegistrationException extends Exception {


    public RegistrationException() {
        super();
    }

    public RegistrationException(String s) {
    }

    public RegistrationException(String message, Throwable cause) {
        super(message, cause);
    }

    public RegistrationException(Throwable cause) {
        super(cause);
    }

    protected RegistrationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
