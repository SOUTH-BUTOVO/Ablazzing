package ru.Ablazzing.lesson13_stream_api.practice;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Practice1 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 5, 8, 8, 9);
//        List<Integer> integers = List.of();
        Random random = new Random(1);

        integers.stream()
                .filter(e -> e > 4)
                .distinct()
                .map(e -> new User(e))
                .peek(e -> e.setList(Stream.generate(() -> random.nextInt(10))
                        .limit(e.getNumber())
                        .toList()))
                .flatMap(e -> e.getList().stream())
                .map(e -> e * 10)
                .reduce((a, b) -> a + b)
                .ifPresentOrElse(
                        e -> System.out.println(e),
                        () -> System.out.println(0)
                );


        /** 1 Создать класс пользователей, каждый из которых будет иметь порядковый номер и список с
         числами. Сделать конструктор на порядковый номер, геттеры и сеттеры на все поля.
         С помощью stream api:
         - Оставить числа больше 4 из integers.
         - Убрать дубликаты чисел.
         - Создать пользователя на каждый элемент стрима, где каждый элемент стрима, является
         порядковым номером пользователя (список чисел null).
         - У каждого пользователя заполнить список чисел: количество чисел в списке определяется
         порядковым номером пользователя. Например: для пользователя с порядковым номером 5 генерируется
         пять случайных чисел, используя переменную random (random.nextInt(10)).
         - Создать единый стрим со всеми числами из списков пользователей.
         - Умножить числа на 10.
         - Посчитать сумму всех чисел с помощью reduce.
         - Вывести на экран.
         - В случае если integers пустой, то должно выводиться на экран "0".
         Внимание! Все операции должны выполняться одной цепочкой integers.stream().map()... ни каких
         переменных не должно появиться. Ожидаемый результат вывода на экран:
         1120 - из примера, 0 - при пустом листе. */


    }
}
