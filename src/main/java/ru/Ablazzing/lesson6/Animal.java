package ru.Ablazzing.lesson6;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();
}
