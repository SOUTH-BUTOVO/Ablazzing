package ru.Ablazzing.lesson6_Polimorf_Interf_Static;

public interface Defendable {
    void defend();
    String STR ="404";

    default void attack() {
        System.out.println("Attack");
    }
}
