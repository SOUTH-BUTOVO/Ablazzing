package ru.Ablazzing.lesson1_dataTypes.HW;

public class BodyMassIndex {
    /* 2 Создать переменные с ростом, весом. Произвести расчёт индекса массы тела (вес) / (рост * рост),
        используя переменные, вывести на экран.
        Пример результата вывода на экран:
        21.0 */

    void bodyMass() {
        float height = 1.85f;
        float weight = 90.7f;
        float bodyMassIndex = weight / (height * height);
        System.out.println("Индекс массы тела = " + bodyMassIndex);
    }
}
