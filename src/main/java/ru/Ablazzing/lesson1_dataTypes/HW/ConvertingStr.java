package ru.Ablazzing.lesson1_dataTypes.HW;

public class ConvertingStr {
    /* 4 Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки
        "some_text" */

    void convertStr() {
        String str = "234";
        int num = Integer.parseInt(str);

        String text = "some_text";
        int length1 = text.length();
        int length2 = "some_text".length();

        int res = num + length2;

        System.out.println(res);
    }
}
