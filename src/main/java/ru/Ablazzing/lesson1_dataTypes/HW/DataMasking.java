package ru.Ablazzing.lesson1_dataTypes.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataMasking {
    /* 8 Создать метод маскирования персональных данных, который:
        Телефон (до/после маскирования): 79991113344/7999***3344
        Email (до/после маскирования): test@yandex.ru/tes*@******.ru, my_mail@gmail.com/my_mai*@*****.com
        ФИО (до/после маскирования): Иванов Иван Иванович / И****в Иван И.

        Входящие параметры: String text
        Возвращаемый результат: String

        Примеры возможного текста:
        <client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client> - "<client>(Какие то данные)<data>7999***3344;test*@******.ru;И****в Иван И.</data>
        <client>(Какие то данные)<data></data></client> - вернёт то же (никаких ошибок)
        <client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client> - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"
        Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
        Регулярные выражения, класс StringBuilder */

    void createData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите номер телефона в формате 79998886655");
        Integer telephone = Integer.valueOf(reader.readLine());

        System.out.println(telephone);
    }
}
