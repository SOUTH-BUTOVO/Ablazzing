package ru.Ablazzing.lesson11_Generics_ArrayList_LinkedList.generics;

public class KeyBoard implements Input {

    @Override
    public void input() {
        System.out.println("Ввод с клавиатуры.");
    }

    void exit() {
        System.out.println("Нажали ctrl + alt + delete");
    }
}
