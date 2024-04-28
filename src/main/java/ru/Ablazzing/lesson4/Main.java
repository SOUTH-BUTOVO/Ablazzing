package ru.Ablazzing.lesson4;

public class Main {
    public static void main(String[] args) {

        Human human = new Human(21, "Sergey");
        System.out.println(human.getAge() + " " + human.name);

        Human human1 = new Human((Integer) 100, "Oleg");
        System.out.println(human1.height + " " + human1.name);

        Human human2 = new Human((Integer) 100, "Oleg");
        System.out.println(human2.getAge() + " " + human2.name);

        System.out.println("-----------------");
        human.setAge(30);
        System.out.println(human.getAge());

//        human1.setAge(31);
        System.out.println(human1.getAge());

        human2.setAge(32);
        System.out.println(human2.getAge());

        System.out.println("-----------------");
        System.out.println(human);
        System.out.println(human1);
        System.out.println(human2);
    }
}
