package ru.Ablazzing.lesson11_Generics_ArrayList_LinkedList.generics;

public class Mouse implements Input {

    @Override
    public void input() {
        System.out.println("Ввод с мыши.");
    }

    void scroll() {
        System.out.println("Прокрутка");
    }
}
