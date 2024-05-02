package ru.Ablazzing.lesson6_Polimorf_Interf_Static;

public class Main {
    public static void main(String[] args) {
        //animalExample();
        //defenderExample();
        //humanExample();

    }

    static void humanExample() {
        Human oleg1 = new Human("Oleg");
        Human petr1 = new Human("Petr");
        Human dima1 = new Human("Dima");
        System.out.println(Human.count);

        Human[] human = {oleg1, petr1, dima1};
        for (Human h : human) {
            System.out.println(h.name);
        }
        System.out.println("--------");
        System.out.println(oleg1.name + "\n" + petr1.name + "\n" + dima1.name);
    }

    static void defenderExample() {
        Defendable dog4 = new Dog("Sharik", 4);
        Defendable robot4 = new Robot();
        dog4.defend();
        robot4.defend();
        System.out.println("-------");

        Defendable[] defendables = {dog4, robot4};
        for (Defendable def : defendables) {
            if (def instanceof Defendable) {
                def.defend();
                def.attack();
            }
        }
    }

    static void animalExample() {
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
