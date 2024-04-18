package ru.Ablazzing.lesson1_dataTypes.HW;

public class HelloWorld {
    /* 1 Дано, (их менять нельзя):
        String h1 = "           Hello ";
        String world = "WoRld!";
        char newLine = '\n';
        Создать из трёх переменных единую строку. Привести к правильному виду (Ниже)
        затроить (Можно вызвать только одну команду System.out.println();)
        Результат вывода на экран:
        Hello world!
        Hello world!
        Hello world! */

    void stringConvert() {
        String h1 = "           Hello ";
        String world = "WoRld!";
        char newLine = '\n';

        String str = h1.replaceAll(" +", "");
        System.out.print(((str + " " + world) + newLine).repeat(3));
        System.out.println("-----------------");
        System.out.println((str + " " + world) + newLine +
                         (str + " " + world) + newLine +
                         (str + " " + world));
    }
}
