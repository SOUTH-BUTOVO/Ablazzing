package ru.Ablazzing.lesson13_stream_api.practice;

import java.util.List;

public class Practice2 {
    /** Узнать, есть ли в lists, хотя бы один список, который содержит сумму всех элементов, вложенного
    листа, равную 12. */
    public static void main(String[] args) {
        List<List<Integer>> lists = List.of(
                List.of(),
                List.of(0),
                List.of(1, 2),
                List.of(3, 4, 6),
                List.of(12));
        boolean anyMatch = lists.stream()
                .anyMatch(e -> e.stream()
                        .reduce((a, b) -> a + b)
                        .orElse(0) == 0);
        System.out.println(anyMatch);
    }
}
