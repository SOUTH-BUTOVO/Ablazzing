package ru.Ablazzing.lesson9;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        // Чтение из файла

//        String test1 =
//        "P:\\iT6ka\\JAVA\\PROJECTS\\Ablazzing\\src\\main\\java\\ru\\Ablazzing\\lesson9\\test1.txt";
//
//        FileReader reader1 = new FileReader(test1);
//        String result = "";
//        while (reader1.ready()) {
//            result += (char) reader1.read();
//        }
//        //System.out.println(result);
//        reader1.close();
//
//        BufferedReader reader2 = new BufferedReader(new FileReader(test1));
//        String resultBuff = "";
//        while (reader2.ready()) {
//            String str = reader2.readLine();
//            resultBuff += str + '\n';
//        }
//        System.out.println(resultBuff);
//        reader2.close();
//        System.out.println("-----------------");
//
//        BufferedReader reader3 = new BufferedReader(new FileReader(test1));
//        String str3 = "";
//        while (reader3.ready()) {
//            str3 += reader3.readLine() + '\n';
//        }
//        System.out.println(str3);
//        reader3.close();

        // Запись в файл 20 мин

    String test2 = "P:\\iT6ka\\JAVA\\PROJECTS\\Ablazzing\\src\\main\\java\\ru\\Ablazzing\\lesson9\\GimnRussia.txt";
    String test3 = "P:\\iT6ka\\JAVA\\PROJECTS\\Ablazzing\\src\\main\\java\\ru\\Ablazzing\\lesson9\\test3.txt";
        //BufferedWriter writer1 = null;
        try(BufferedWriter writer1 = new BufferedWriter(new FileWriter(test2))) {
            String gimn = "Россия — священная наша держава,\n" +
                    "Россия — любимая наша страна,\n" +
                    "Могучая воля, великая слава,\n" +
                    "Твое достоянье на все времена.\n" +
                    "Славься, Отечество, наше свободное,\n" +
                    "Братских народов союз вековой,\n" +
                    "Предками данная мудрость народная,\n" +
                    "Славься, страна, мы гордимся тобой.\n" +
                    "От южных морей до полярного края\n" +
                    "Раскинулись наши леса и поля,\n" +
                    "Одна ты на свете, одна ты такая,\n" +
                    "Хранимая Богом родная земля.\n" +
                    "Славься, Отечество, наше свободное,\n" +
                    "Братских народов союз вековой,\n" +
                    "Предками данная мудрость народная,\n" +
                    "Славься, страна, мы гордимся тобой.\n" +
                    "Широкий простор для мечты и для жизни\n" +
                    "Грядущие нам открывают года.\n" +
                    "Нам силу дает наша верность Отчизне,\n" +
                    "Так было так есть и так будет всегда.\n" +
                    "Славься, Отечество, наше свободное,\n" +
                    "Братских народов союз вековой,\n" +
                    "Предками данная мудрость народная,\n" +
                    "Славься, страна, мы гордимся тобой.";
            writer1.write(gimn);
            writer1.newLine();
            writer1.newLine();
            throw new IOException("Что то пошло не так");
        } catch (IOException e) {
            System.out.println(e.getMessage());
//            writer1 = new BufferedWriter(new FileWriter(test3));
//            writer1.write("Учусь на программиста");
//            writer1.newLine();
//            writer1.newLine();
//            writer1.close();
            //throw new IOException("Что то пошло не так");
        }

        FileWriter writer2 = new FileWriter(test2, true);
        writer2.write("Записано методом (writer1.write(gimn);)");
        writer2.close();
    }
}
