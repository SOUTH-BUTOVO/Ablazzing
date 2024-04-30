package ru.Ablazzing.lesson5.after_extends;

public class Cat extends Animal {

    public Cat(String nickname) {
        super(nickname);
    }

    @Override
    public void makeSound() {
        System.out.println("Кот мяукнул");
    }
}
