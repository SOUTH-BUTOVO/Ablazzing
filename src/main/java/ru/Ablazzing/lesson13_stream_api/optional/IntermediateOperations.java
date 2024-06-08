package ru.Ablazzing.lesson13_stream_api.optional;

import java.util.List;

public class IntermediateOperations {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 10, 20, 30);
        System.out.println("Печатаем числа Листа:");
        list.stream()
                .filter(e -> e <= 20) // Оставляет элементы отвечающие условию
                .skip(1) // Убирает первые n элементов
                .distinct() // Удаляет дубликаты
                .limit(1) // Оставляет первые n элементы, остальные убирает
                .forEach(e -> System.out.print(e + " "));
    }
}
