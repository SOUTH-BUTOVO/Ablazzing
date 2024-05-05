package ru.Ablazzing.lesson8_Exceptions;

public class MyFirstException extends Exception {
    public static int countException = 0;


    public MyFirstException() {
        countException++;
    }

    public MyFirstException(String message) {
        super(message);
        countException++;
    }

    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
        countException++;
    }

    public MyFirstException(Throwable cause) {
        super(cause);
        countException++;
    }
}
