package ru.Ablazzing.lesson13_stream_api.optional;

import java.util.List;

public class GetOneElementOperations {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 8, 2);

        // Получение первого элемента Листа.
        System.out.println("Получение первого элемента Листа. " +
                list.stream().findFirst().orElseThrow());

        // Получение максимального элемента Листа.
        System.out.println("Получение максимального элемента Листа. " +
                list.stream().max((a, b) -> a - b).orElseThrow());

        // Получение минимального элемента Листа.
        System.out.println("Получение минимального элемента Листа. " +
                list.stream().min((a, b) -> a - b).orElseThrow());

        List<Student> students = List.of(
                new Student(20, "Misha"),
                new Student(18, "Ivan"),
                new Student(21, "Natalya")
        );

        // Получить самого старшего студента.
        System.out.println(students.stream().max((s1, s2) -> s1.getAge() - s2.getAge()).orElseThrow());

        // Получить студента с самым коротким именем 2:29:30!!!.
        System.out.println(students.stream().min((s1, s2) ->
                s1.getName().length() - s2.getName().length()).orElseThrow());
    }
}
