package ru.Ablazzing.lesson13_stream_api.stream_api;

import java.util.List;

public class LogikalTerminalOperations {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 8, 2);
        System.out.println("Лист: " + list);
        System.out.println("----------------");

        // Ищем хотя бы один элемент в листе значением 8.
        boolean anyMatch = list.stream().anyMatch(e -> e == 8);
        System.out.println("Ищем хотя бы один элемент в листе значением 8: " +
                (anyMatch ? "- Число найдено!" : "- Число не найдено."));
        System.out.println("----------------");

        // Все элементы Листа меньше 10.
        boolean allMatch = list.stream().allMatch(e -> e < 10);
        System.out.println("Проверяем, что все элементы Листа меньше 10: " +
                (allMatch ? "Да, это так!" : "Нет, это не так."));
        System.out.println("----------------");

        //Ни один элемент Листа не меньше 0.
        System.out.println("Ни один элемент Листа не меньше 0: " +
                (list.stream().noneMatch(e -> e < 0) ? "Да, это так!" : "Нет, это не так"));
    }
}
