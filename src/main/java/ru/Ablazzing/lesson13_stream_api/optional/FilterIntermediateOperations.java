package ru.Ablazzing.lesson13_stream_api.optional;

import java.util.List;

public class FilterIntermediateOperations {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 0, 10, 0);
        numbers.stream()
                .filter(e -> e > -1) // Фильтр-я эл-ов по условию. Элементы Листа больше -1, (5, 0, 10, 0).
                .distinct() // Удаляем дубликаты (5 0 10 0 -> 5 0 10).
                .skip(1) // Убирает первые n (1) элементов (5 0 10 -> 0 10).
                .limit(1) // Оставляет первые n (1) элементы, остальные убирает (0 10 -> 0).
        .forEach(e -> System.out.print(e + " "));
    }
}
