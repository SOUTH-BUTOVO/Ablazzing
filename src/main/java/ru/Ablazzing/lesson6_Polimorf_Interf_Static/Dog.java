package ru.Ablazzing.lesson6_Polimorf_Interf_Static;

public class Dog extends Animal implements Defendable {
    int countLegs;

    public Dog(String name, int countLegs) {
        super(name);
        this.countLegs = countLegs;
    }

    @Override
    void makeSound() {
        System.out.println("Собака кусака лает");
    }

    public void defend() {
        System.out.println("Собака охраняет");
    }

    public int getCountLegs() {
        return countLegs;
    }
}
