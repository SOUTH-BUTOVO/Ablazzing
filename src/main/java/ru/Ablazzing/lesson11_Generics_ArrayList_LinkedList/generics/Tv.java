package ru.Ablazzing.lesson11_Generics_ArrayList_LinkedList.generics;

public class Tv implements Output {
    @Override
    public void output() {
        System.out.println("Телевизор вещает.");
    }

    public void soundOff() {
        System.out.println("Звук телевизора выключен.");
    }
}
