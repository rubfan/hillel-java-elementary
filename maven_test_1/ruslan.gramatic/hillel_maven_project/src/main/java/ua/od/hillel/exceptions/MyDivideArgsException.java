package ua.od.hillel.exceptions;

import java.io.IOException;

/**
 * Created by ruslangramatic on 4/15/18.
 */
public class MyDivideArgsException extends Exception {
    public MyDivideArgsException(String s, String mySpecialMessage) {
        super(s);
        this.mySpecialMessage = mySpecialMessage;
    }

    public MyDivideArgsException(String s) {
        super(s);
    }

    public String getMySpecialMessage() {
        return mySpecialMessage;
    }

    private String mySpecialMessage = "This is very bad exception!!!";
}
