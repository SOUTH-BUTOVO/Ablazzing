package ru.Ablazzing.lesson6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Кот мяучит");
    }
}
