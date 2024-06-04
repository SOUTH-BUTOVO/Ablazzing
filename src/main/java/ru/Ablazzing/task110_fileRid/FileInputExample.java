package ru.Ablazzing.task110_fileRid;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInputExample {
    public static void main(String[] args) throws IOException {
        String track =
        "P:\\iT6ka\\JAVA\\PROJECTS\\Ablazzing\\src\\main\\java\\ru\\Ablazzing\\task110_fileRid\\article.txt";

//        InputStream article =
//        FileInputExample.class.getClassLoader().getResourceAsStream(track);

        FileReader reader = new FileReader(track);
        StringBuilder stringBuilder = new StringBuilder();
        while (reader.ready()) {
            stringBuilder.append((char) reader.read());
        }
//        System.out.println(stringBuilder);

        //reader.close();

        Scanner scanner = new Scanner(track);
        //scanner.nextLine();
        int count = 0;
        int lineNeeded = 1;
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            if (count == lineNeeded) {
                System.out.println(nextLine);
            }
            count++;
        }
        //System.out.println(scanner.nextLine());

        //scanner.close();
    }
}
