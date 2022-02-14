package com.training.exceptions;

public class UserDefinedException extends Exception {

    public UserDefinedException(String message) {
        super();
        System.out.println(" UserDefinedException :: " + message);
    }

    public UserDefinedException(String code, String message) {
        super();
        System.out.println(" UserDefinedException :: " + message);
    }
}
