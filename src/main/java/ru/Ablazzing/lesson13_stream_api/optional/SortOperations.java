package ru.Ablazzing.lesson13_stream_api.optional;

import java.util.Comparator;
import java.util.List;

public class SortOperations {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 4, 0, 2, 5, 1);
        list.stream()
                .sorted() // Сортировка элементов, от меньшего к большему.
                .sorted(Comparator.reverseOrder()) // Сортировка элементов наоборот, от большего к меньшему.
                .forEach(e -> System.out.print(e + " | "));
        System.out.println("\n" + "-------------------");

        Student petr = new Student(20, "Petr");
        Student yuri = new Student(25, "Yuri");
        Student ivan = new Student(27, "Ivan");

        List<Student> students = List.of(petr, yuri, ivan);
        students.stream()
                .sorted((a, b) -> b.getAge() - a.getAge())
                .forEach(e -> System.out.println(e));
        System.out.println("\n" + "-------------------");

        students.stream()
                .sorted(Comparator.reverseOrder()) // С переопределённым Компаратором!!!
                .sorted() // С переопределённым Компаратором!!!
                .forEach(e -> System.out.println(e));
    }
}
