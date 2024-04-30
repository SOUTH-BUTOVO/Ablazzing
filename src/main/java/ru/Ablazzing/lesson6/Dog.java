package ru.Ablazzing.lesson6;

public class Dog extends Animal {
    int countLegs;

    public Dog(String name, int countLegs) {
        super(name);
        this.countLegs = countLegs;
    }

    @Override
    void makeSound() {
        System.out.println("Собака кусака лает");
    }

    void defend() {
        System.out.println("Собака охраняет");
    }

    public int getCountLegs() {
        return countLegs;
    }
}
