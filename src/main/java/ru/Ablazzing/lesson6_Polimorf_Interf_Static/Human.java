package ru.Ablazzing.lesson6_Polimorf_Interf_Static;

public class Human {
    static int count = 0;
    static final String PREFIX = "Mr.";
    String name;


    public Human() {
    }

    public Human(String name) {
        this.name = PREFIX + name;
        count++;
    }

//    public String getName() {
//        return name;
//    }
}
