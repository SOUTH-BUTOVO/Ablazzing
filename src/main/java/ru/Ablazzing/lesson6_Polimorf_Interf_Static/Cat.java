package ru.Ablazzing.lesson6_Polimorf_Interf_Static;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Кот мяучит");
    }
}
