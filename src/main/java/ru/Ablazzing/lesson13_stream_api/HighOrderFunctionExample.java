package ru.Ablazzing.lesson13_stream_api;

public class HighOrderFunctionExample {
    public static void main(String[] args) {
        Operator operator = new Operator();
        operator.call1("кредитная карта");
        System.out.println("-----------------------------");

        OperatorAction creditCardAction = () ->
                System.out.println("Оператор спрашивает: хотите ли вы приобрести кредитную карту?");

        OperatorAction mobileChangeAction = () ->
                System.out.println("Оператор спрашивает: хотите ли вы поменять тариф сотовой связи?");

        OperatorAction socialAction = () -> {
            System.out.println("Оператор спрашивает: Вопрос №1 сколько вам лет?");
            System.out.println("Оператор спрашивает: Вопрос №2 любите ли вы собак?");
        };

        operator.call2(creditCardAction);
        operator.call2(mobileChangeAction);
        operator.call2(socialAction);
    }
}
