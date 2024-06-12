package ru.Ablazzing.task112_113_output;

import java.io.*;

public class FileOutputExample {
    public static void main(String[] args) throws IOException {
        String fileTrack = "P:\\iT6ka\\JAVA\\PROJECTS\\Ablazzing\\src\\main\\java\\ru\\Ablazzing\\task112_113_output\\menu.txt";
        String menu1 = "Хлеб - 40 рублей.\n";

        FileOutputStream outputStream = new FileOutputStream(fileTrack);
        outputStream.write(menu1.getBytes());
        outputStream.close();

        String menu2 = "Бананы - 100 рублей.\n";

        try (FileWriter fileWriter = new FileWriter(fileTrack, true)) {
            fileWriter.write(menu2);
        }
    }
}
