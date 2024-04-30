package ru.Ablazzing.lesson5;

import ru.Ablazzing.lesson5.after_extends.Cat;
import ru.Ablazzing.lesson5.after_extends.Horse;
import ru.Ablazzing.lesson5.after_extends.Tiger;
import ru.Ablazzing.lesson5.after_extends.Zoo;
import ru.Ablazzing.lesson5.before_extends.Animal;

public class Main {
    public static void main(String[] args) {
//        Animal horse = new Animal("horse", "Лошадка");
//        System.out.print(horse.getName() + " ");
//        horse.makeSound();
//
//        Animal cat = new Animal("cat", "Васька");
//        System.out.print(cat.getName() + " ");
//        cat.makeSound();
//
//        Horse horse2 = new Horse("Rysak");
//        horse2.makeSound();
//
//        Cat cat2 = new Cat("Semen");
//        cat2.makeSound();
//        System.out.println("________________________");

        Horse horse3 = new Horse("Лошадка" , 300);
        System.out.println(horse3.getNickname() + ", вес: " + horse3.getWeight());
        horse3.name();
        horse3.name2();
        horse3.makeSound();

        Cat cat3 = new Cat("Vaska");
        cat3.makeSound();

        Tiger tiger3 = new Tiger("Sherhan");
        System.out.print(tiger3.getNickname() + " ");
        tiger3.makeSound();

        Zoo zoo = new Zoo(horse3, tiger3, cat3);
        System.out.println(zoo);
    }
}
