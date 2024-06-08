package ru.Ablazzing.lesson13_stream_api.stream_api;

import java.util.List;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {

        List<Integer> list = List.of(4, 5, 6);
        Stream<Integer> integerStream = list.stream();
        System.out.println("List: " + integerStream.count());
        Stream<Integer> integerStream2 = list.stream();
        integerStream2.forEach(e ->
                System.out.print(e));
        System.out.println();
        System.out.println("---------------");

        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        System.out.println("Количество элементов в стриме: " + stream1.count());

        System.out.print("Печатаем на экран элементы: ");
        Stream<Integer> stream2 = Stream.of(1, 2, 3);
        stream2.forEach(e -> {
            System.out.print("Делаем ещё что то!  ");
            System.out.print(e + " ");
        });
    }

    public static void logical() {

    }
}
