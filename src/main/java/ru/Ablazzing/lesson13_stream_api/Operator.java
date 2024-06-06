package ru.Ablazzing.lesson13_stream_api;

public class Operator {

    public void call1(String action) {
        if (action.equals("кредитная карта")) {
            System.out.println("Оператор спрашивает: хотите ли вы приобрести кредитную карту?");
        } else if (action.equals("сотовая связь")) {
            System.out.println("Оператор спрашивает: хотите ли вы поменять тариф сотовой связи?");
        } else if (action.equals("социологический опрос")) {
            System.out.println("Оператор спрашивает: Вопрос №1 сколько вам лет?");
            System.out.println("Оператор спрашивает: Вопрос №2 любите ли вы собак?");
        }
    }

    public void call2(OperatorAction operatorAction) {
        System.out.println("Оператор начинает звонок");
        System.out.println(".....");
        operatorAction.action();
        System.out.println("Оператор заканчивает звонок");
        System.out.println(".....");
    }
}
