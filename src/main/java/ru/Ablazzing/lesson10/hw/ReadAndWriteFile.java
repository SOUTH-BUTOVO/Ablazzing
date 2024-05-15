package ru.Ablazzing.lesson10.hw;

import java.io.*;

public class ReadAndWriteFile {
    /* 1 Создать файл "my_first_file.txt". На первой строке написать: "Моя бабушка",
        на второй: "читает газету жизнь". Прочитать файл и вывести на экран все слова файла в одну строку.
        Ожидаемый результат: "Моя бабушка читает газету жизнь". */

    void writeFile() throws IOException {
        String trackFile = "P:\\iT6ka\\JAVA\\PROJECTS\\Ablazzing\\src\\main\\java\\ru\\Ablazzing\\lesson10\\hw\\my_first_file.txt";
        String text1 = "Моя бабушка";
        String text2 = "читает газету жизнь.";

        BufferedWriter writer = new BufferedWriter(new FileWriter(trackFile));
        writer.write(text1);
        writer.newLine();
        writer.write(text2);
        writer.close();

        readerFile(trackFile);
    }

    void readerFile(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String result = "";
        while (reader.ready()) {
            result += reader.readLine() + " ";

        }
        System.out.println(result);
    }
}
