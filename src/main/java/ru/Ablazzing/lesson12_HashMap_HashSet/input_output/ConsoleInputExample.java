package ru.Ablazzing.lesson12_HashMap_HashSet.input_output;

import java.util.Scanner;

public class ConsoleInputExample {
    public static void main(String[] args) {
        Calc calc = new Calc();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        long number1 = scanner.nextLong();

        System.out.println("Введите операцию:");
        String operation = scanner.next();

        System.out.println("ВВедите второе число:");
        long number2 = scanner.nextLong();

        System.out.println(calc.makeOperation(number1, number2, operation));
    }
}
