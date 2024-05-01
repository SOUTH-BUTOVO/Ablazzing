package ru.Ablazzing.lesson6;

public interface Defendable {
    void defend();
    String STR ="404";

    default void attack() {
        System.out.println("Attack");
    }
}
