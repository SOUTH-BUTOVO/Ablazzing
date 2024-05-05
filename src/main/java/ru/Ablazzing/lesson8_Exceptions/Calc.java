package ru.Ablazzing.lesson8_Exceptions;

public class Calc {
    public static Integer add(int a, int b) throws MyFirstException {
        if (b == 0) {
            throw new MyFirstException("Exception, b = 0.");
        }
        return a + b;
    }
}
