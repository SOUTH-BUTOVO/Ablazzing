package ru.Ablazzing.lesson4.HW;

public class Number100 {
    /* 1 Написать цикл, который выводит через пробел 100 чисел, с приставкой "а".
    Ожидаемый результат: 1а 2а 3а .. 100а.
    */

    void number() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "a ");
        }
    }
}
