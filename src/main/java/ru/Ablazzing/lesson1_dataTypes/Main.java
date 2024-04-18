package ru.Ablazzing.lesson1_dataTypes;

public class Main {
    public static void main(String[] args) {
        int myNumber = 5;
        System.out.println(myNumber);

        byte myByte = -128;
        byte myByte2 = 127;
        short myShort = -32000;
        short myShort2 = 32000;
        int myInt = -2_100_000_000;
        int myInt2 = 2_100_000_000;
        long myLong = -9_200_000_000_000_000_000L;
        long myLong2 = 9_200_000_000_000_000_000L;
        float myFloat = 300_000_000_000_000_000_000_000_000_000_000_000_000.404f;
        double myDouble = 9000098.404;
        boolean myBool = false;
        boolean myBool2 = true;
        char myChar = 'a'+1;
        char[] mass = new char[6];
        mass[0] = 'ч';
        mass[1] = 'е';
        mass[2] = 'с';
        mass[3] = 'н';
        mass[4] = 'о';
        mass[5] = 'к';

        Object user = new Object();
        Object user2 = user + "1";
        System.out.println(user2.equals(user));
        System.out.println(user);
        System.out.println(user2);

        System.out.println(myDouble);
        System.out.println(myChar+1);
        System.out.println(mass);

        System.out.println(function(5, 2));

        String text = String.copyValueOf(mass);
        System.out.println(text.toUpperCase());

        String text2 = "мой текст";
        System.out.println(text2);
        System.out.println("мой текст");

        // Конкатенация
        String word1 = "Hello ";
        String word2 = "World!";
        String word3 = "    World!";
        String word4 = "   World   !";
        String res1 = word1 + word2;
        System.out.println(res1);

        System.out.println(word3);
        String trim = word3.trim();
        System.out.println(trim);

        String str = word4.replaceAll("d   ", "ds");
        System.out.println(str);
    }

    static int function(int x, int y) {
        return x * 2 + y * x;
    }
}
