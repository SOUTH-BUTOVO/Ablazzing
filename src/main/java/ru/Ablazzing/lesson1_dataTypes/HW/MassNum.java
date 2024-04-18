package ru.Ablazzing.lesson1_dataTypes.HW;

import java.util.Arrays;

public class MassNum {
    /* 6 Создать два массива чисел:
            [1, 2, 5, 7, 10]
            [2, 3, 2, 17, 15]
        Создать массив чисел, в котором будут, все числа из этих массивов и результат умножения чисел с
        одинаковым порядковым номером. Ожидаемый результат:
        [1, 2, 5, 7, 10, 2, 3, 2, 17, 15], (первый массив - 1, 2, 5, 7, 10), (второй массив - 2, 3, 2, 17, 15),
        результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15) */

    void massArr() {
        int[] mass1 = {1, 2, 5, 7, 10};
        int[] mass2 = {2, 3, 2, 17, 15};
        int[] mass3 = new int[mass1.length];
        int[] massLong = new int[mass1.length + mass2.length];

        System.arraycopy(mass1, 0, massLong, 0, mass1.length);
        System.arraycopy(mass2, 0, massLong, mass1.length, mass2.length);

        for (int i = 0; i < mass3.length; i++) {
            mass3[i] = mass1[i] * mass2[i];
        }

        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));
        System.out.println(Arrays.toString(mass3));
        System.out.println(Arrays.toString(massLong));
    }
}
