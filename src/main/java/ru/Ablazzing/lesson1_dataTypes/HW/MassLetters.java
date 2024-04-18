package ru.Ablazzing.lesson1_dataTypes.HW;

public class MassLetters {
    /* 3 Создать из массива букв [a, b, c, d, e] строку, вывести на экран, поменять в массиве 4 букву
        по счёту на [h], и снова создать строку, вывести на экран. */

    void word() {
        char[] mass1 = {'a', 'b', 'c', 'd', 'e'};
        String str1 = String.copyValueOf(mass1);
        System.out.println(str1);
        char[] mass2 = mass1;
        mass2[3] = 'h';
        String str2 = String.copyValueOf(mass2);
        System.out.println(str2);
    }
}
