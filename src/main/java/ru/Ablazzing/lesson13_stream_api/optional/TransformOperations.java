package ru.Ablazzing.lesson13_stream_api.optional;

import java.util.List;

public class TransformOperations {
    public static void main(String[] args) {
        Student petr = new Student(20, "Petr");
        Student yuri = new Student(25, "Yuri");
        Student ivan = new Student(27, "Ivan");

        List<Student> students = List.of(petr, yuri, ivan);
        //students.stream().forEach(e -> System.out.println(e.getName()+ " - " + e.getAge()));

        students.stream()
                .map(e -> e.getAge()) // Получаем возраст студентов.
                .forEach(e -> System.out.print(e + " "));
        System.out.println("\n" + "-------------------");

        students.stream()
                .peek(e -> e.setName("Mr." + e.getName().equals("Yuri"))) // Меняем имя студентов.
                .forEach(e -> System.out.println(e));
        System.out.println("-------------------");

        List<List<Integer>> listList = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        System.out.println(listList);
        listList.stream()
                .flatMap(e -> e.stream()) // Объединение элементов стрима в плоскую структуру.
                .forEach(e -> System.out.print(e + "  "));
    }
}
