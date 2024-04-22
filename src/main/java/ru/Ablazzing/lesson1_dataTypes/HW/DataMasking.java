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
//        System.out.println("Введите ФОИ в формате Иванов Иван Иванович");
//        String fio = reader.readLine();
//        System.out.println("Введите номер телефона в формате 79998886655");
//        String telephone = reader.readLine();
        System.out.println("Введите свой Email в формате test@yandex.ru/my_mail@gmail.com");
        String emailOrig = reader.readLine();
        StringBuffer buffer = new StringBuffer(emailOrig);
        //Распечатаю оригинальный email
        System.out.println(emailOrig);

        int emailMid = buffer.indexOf("@");
        int emailStart = 1;
        String rep = "*****";
        buffer.replace(emailStart, emailMid - 1, rep);
        System.out.println(buffer);
        //Делаем правую часть email sergey@mail.ru
        //System.out.println(buffer.indexOf("@"));
        emailMid = buffer.indexOf("@");
        int emailEnd = buffer.indexOf(".");
        buffer.replace(emailMid + 1, emailEnd, rep);
        System.out.println(buffer);

        char i = 10828;
        System.out.println(i);

    }
}