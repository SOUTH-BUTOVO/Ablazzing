package ru.Ablazzing.lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Pusok");
        Dog dog1 = new Dog("Muxtar", 4);
        Animal cat2 = new Cat("Vaska");
        Animal dog2 = new Dog("Palkan", 4);

        dog1.defend();
        Dog dog22 = (Dog) dog2;
        dog22.defend();
        System.out.println(dog22.name);
        System.out.println(dog22.countLegs);

        cat1.makeSound();
        dog1.makeSound();
        System.out.println("---------");

        Animal[] animals = {cat1, dog1, cat2, dog2};
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                ((Dog) animal).defend();
            }
            animal.makeSound();
        }
        System.out.println("---------");

    }
}
