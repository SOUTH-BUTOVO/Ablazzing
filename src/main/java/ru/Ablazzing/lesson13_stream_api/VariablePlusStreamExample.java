package ru.Ablazzing.lesson13_stream_api;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class VariablePlusStreamExample {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3);
        int sum = 0;

        for (Integer i : list1) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("---------------");

        // Сумма чисел.
        AtomicInteger res = new AtomicInteger();
        list1.stream().forEach(e ->
                res.addAndGet(e)
        );
        System.out.println(res.get());
        System.out.println("---------------");

        List<String> list2 = List.of("a", "b", "c");
        String text1 = "";

        for (String string : list2) {
            text1 += string;
        }
        System.out.println(text1);
        System.out.println("---------------");

        StringBuffer text2 = new StringBuffer();
        list2.stream().forEach(e ->
                text2.append(e)
                );
        System.out.println(text2);
        System.out.println("---------------");
    }

}
