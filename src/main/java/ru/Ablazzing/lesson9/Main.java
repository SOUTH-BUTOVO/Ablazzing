package ru.Ablazzing.lesson9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "P:\\iT6ka\\JAVA\\PROJECTS\\Ablazzing\\src\\main\\java\\ru\\Ablazzing\\lesson9\\test1.txt";

        // Чтение из файла

        FileReader reader1 = new FileReader(filename);
        String result = "";
        while (reader1.ready()) {
            result += (char) reader1.read();
        }
        //System.out.println(result);
        reader1.close();

        BufferedReader reader2 = new BufferedReader(new FileReader(filename));
        String resultBuff = "";
        while (reader2.ready()) {
            String str = reader2.readLine();
            resultBuff += str + '\n';
        }
        System.out.println(resultBuff);
        reader2.close();
        System.out.println("-----------------");

        BufferedReader reader3 = new BufferedReader(new FileReader(filename));
        String str3 = "";
        while (reader3.ready()) {
            str3 += reader3.readLine() + '\n';
        }
        System.out.println(str3);
        reader3.close();

        // Запись в файл


    }
}
