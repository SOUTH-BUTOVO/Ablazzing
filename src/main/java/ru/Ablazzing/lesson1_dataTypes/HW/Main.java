package ru.Ablazzing.lesson1_dataTypes.HW;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
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
        HelloWorld helloWorld = new HelloWorld();
        //helloWorld.stringConvert();
        System.out.println("1----------------");

        /* 2 Создать переменные с ростом, весом. Произвести расчёт индекса массы тела (вес) / (рост * рост),
        используя переменные, вывести на экран.
        Пример результата вывода на экран:
        21.0 */
        BodyMassIndex bodyMassIndex = new BodyMassIndex();
        //bodyMassIndex.bodyMass();
        System.out.println("2----------------");

        /* 3 Создать из массива букв [a, b, c, d, e] строку, вывести на экран, поменять в массиве 4 букву
        по счёту на [h], и снова создать строку, вывести на экран. */
        MassLetters massLetters = new MassLetters();
        //massLetters.word();
        System.out.println("3----------------");

        /* 4 Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки
        "some_text" */
        ConvertingStr convertingStr = new ConvertingStr();
        //convertingStr.convertStr();
        System.out.println("4----------------");

        /* 5 Посчитать (a + b) ^ 2 = ?, при a = 3, b = 5 */
        Expression expression = new Expression();
        //expression.express();
        System.out.println("5----------------");

        /* 6 Создать два массива чисел:
            [1, 2, 5, 7, 10]
            [2, 3, 2, 17, 15]
        Создать массив чисел, в котором будут, все числа из этих массивов и результат умножения чисел с
        одинаковым порядковым номером. Ожидаемый результат:
        [1, 2, 5, 7, 10, 2, 3, 2, 17, 15], (первый массив - 1, 2, 5, 7, 10), (второй массив - 2, 3, 2, 17, 15),
        результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15) */
        MassNum massNum = new MassNum();
        //massNum.massArr();
        System.out.println("6----------------");

        /* 7 В слове "Hello world!" заменить все l на r, сделать все буквы заглавными, выбрать первые 8 символов */
        ReplaceLetters replaceLetters = new ReplaceLetters();
        //replaceLetters.replace();
        System.out.println("7----------------");

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
        DataMasking dataMasking = new DataMasking();
        dataMasking.createData();
        System.out.println("8----------------");
    }
}
