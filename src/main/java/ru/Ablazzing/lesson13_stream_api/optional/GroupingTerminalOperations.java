package ru.Ablazzing.lesson13_stream_api.optional;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingTerminalOperations {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 6, 2, 5);

        // Сумма всех элементов стрима.
        list.stream().reduce((a, b) -> a + b).ifPresent(e -> System.out.println(e));

        // Собрать элементы в Лист.
        List<Integer> collectList = list.stream().collect(Collectors.toList());
        System.out.println(collectList);

        // Собрать элементы в Сэт (уникальные элементы).
        Set<Integer> collectSet = list.stream().collect(Collectors.toSet());
        System.out.println(collectSet);

        // Собрать элементы в Мар ([Значение Листа - ключ]-[Количество повторений в Листе - значение])
        Map<Integer, Integer> collectMap =
        list.stream().collect(Collectors.toMap(k -> k, k -> 1, (valuePrev, valueCurrent) ->
        valuePrev + valueCurrent));
        System.out.println(collectMap);
    }
}
