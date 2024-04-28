package ru.Ablazzing.lesson4;

import java.util.Locale;

public class AboutString {
    public static void main(String[] args) {
        String name = "ФранцузскихБулок";
        //Количество символов в строке
        int lengthName = name.length();
        System.out.println(lengthName);
        System.out.println(name.length());
        System.out.println("-----------------");

        // Все буквы заглавные
        String upperName = name.toUpperCase();
        System.out.println(upperName);
        System.out.println(name.toUpperCase());
        System.out.println("-----------------");

        // Все буквы маленькие
        String lowerName = name.toLowerCase();
        System.out.println(lowerName);
        System.out.println(name.toLowerCase());
        System.out.println("-----------------");

        // Удаляем N первых символов из строки, или диапозон N,N который хотим сохранить в строке.
        String substringName = name.substring(2);
        System.out.println(substringName);
        System.out.println(name.substring(10, 15));
        System.out.println("-----------------");

        // Объединение строк (Конкатенация)
        String str1 = "хочешь?";
        System.out.println(name + " " + str1);

        // Удаление лишних пробелов
        String str2 = "    Da   ";
        System.out.println(str2.trim());
        System.out.println("-----------------");

        // Многократная печать строк
        String repeatName = name.repeat(3);
        System.out.println(repeatName);
        System.out.println(name.repeat(3));
        System.out.println("-----------------");

        // Содержится ли, какой то символ в строке
        boolean containsName = name.contains("а");
        System.out.println(containsName);
        System.out.println(name.contains("ж"));
        System.out.println("-----------------");

        // Узнать индекс искомого символа в строке (-1, искомого символа в строке не найдено)
        int indexName = name.indexOf("б");
        System.out.println(indexName);
        System.out.println(name.indexOf("Б"));
        System.out.println("-----------------");

        // Получить символ по индексу в строке
        char charAtName = name.charAt(11);
        System.out.println(charAtName);
        System.out.println(name.charAt(11));
        System.out.println("-----------------");
    }
}
