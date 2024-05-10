package ru.Ablazzing.lesson9;

import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {

        //Создать файл с 5 строками, на каждой строке будут числа, от 1 до 5.
        String trackFile1 =
        "P:\\iT6ka\\JAVA\\PROJECTS\\Ablazzing\\src\\main\\java\\ru\\Ablazzing\\lesson9\\txt\\writeTask.txt";
        try(BufferedWriter writ = new BufferedWriter(new FileWriter(trackFile1))) {
            writeNumbers(writ, 1, 5);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        // Прочитать первый файл и создать файл, только с чётными числами.
        String trackFile2 =
        "P:\\iT6ka\\JAVA\\PROJECTS\\Ablazzing\\src\\main\\java\\ru\\Ablazzing\\lesson9\\txt\\readTask.txt";

        String trackFile3 =
                "P:\\iT6ka\\JAVA\\PROJECTS\\Ablazzing\\src\\main\\java\\ru\\Ablazzing\\lesson9\\txt\\writeTask2.txt";
        try(BufferedReader read = new BufferedReader(new FileReader(trackFile1));
        BufferedWriter writ3 = new BufferedWriter(new FileWriter(trackFile3))) {
            String str3 = readNumbers(read);
            writ3.write(str3);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    static void writeNumbers(BufferedWriter writer, int from, int to) throws IOException {
        for (int i = from; i <= to; i++) {
            writer.write(String.valueOf(i));
            if (i < to) {
                writer.newLine();
            }
        }
    }

    static String readNumbers(BufferedReader reader) throws IOException {
        String result = "";
        while (reader.ready()) {
            String line = reader.readLine();
            int num = Integer.parseInt(line);
            if (num % 2 == 0) {
                result += num + "\n";
            }
        }
        return result;
    }
}
