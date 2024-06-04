package ru.Ablazzing.lesson12_HashMap_HashSet.task102_Record;

public record HumanRecord(int birthYear,
                          String name,
                          String surName,
                          String lastName) {

    public HumanRecord {
        System.out.println("Hello Record!");
    }

    public void getInfo() {
        System.out.println(lastName + " " + name);
    }
}
