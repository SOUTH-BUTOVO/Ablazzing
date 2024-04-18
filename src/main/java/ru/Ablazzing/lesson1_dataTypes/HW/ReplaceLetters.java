package ru.Ablazzing.lesson1_dataTypes.HW;

public class ReplaceLetters {
    /* 7 В слове "Hello world!" заменить все l на r,
    сделать все буквы заглавными,
    выбрать первые 8 символов */

    void replace() {
        String str1 = "Hello world!";
        String str2 = str1.replace('l', 'r').toUpperCase();
        String fin = str2.substring(0, 8);

        System.out.println("Длинна строки = " + str2.length());
        System.out.println(str2);
        System.out.println(fin);
    }
}
