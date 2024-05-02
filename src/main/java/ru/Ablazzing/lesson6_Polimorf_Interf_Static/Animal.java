package ru.Ablazzing.lesson6_Polimorf_Interf_Static;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();
}
