package ru.Ablazzing.lesson13_stream_api.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        // Массив
        int[] mass = {1, 2, 3};
        IntStream streamMass = Arrays.stream(mass);
        streamMass.forEach(e -> System.out.print(e));
        System.out.println();
        System.out.println("------");

        // Коллекция
        List<Integer> list = List.of(4, 5, 6);
        Stream<Integer> streamList = list.stream();
        streamList.forEach(e -> System.out.print(e));
        System.out.println();
        System.out.println("------");

        // Из элементов
        Stream<Integer> streamElement = Stream.of(7, 8, 9);
        streamElement.forEach(e -> System.out.print(e));
        System.out.println();
        System.out.println("------");

        // Stream Generate
        Stream.generate(() -> 0).limit(3).forEach(e -> System.out.print(e));
    }
}
