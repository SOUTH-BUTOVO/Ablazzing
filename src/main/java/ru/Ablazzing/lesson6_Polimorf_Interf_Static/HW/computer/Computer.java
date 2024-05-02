package ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW.computer;

public class Computer extends Electronic {

    void loadSystem() {
        System.out.println("загрузка компьютера");
    }

    @Override
    void work() {
        System.out.println("выполняет вычесления");
    }
}
