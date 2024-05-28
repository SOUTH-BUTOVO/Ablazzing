package ru.Ablazzing.lesson12_HashMap_HashSet.task79;

public interface Ex extends Ex2, Ex3{

    @Override
    default void eat() {
        Ex2.super.eat();
        System.out.println("Ням-ням");
    }

    @Override
    default void run() {
        System.out.println("RUN");
    }
}
