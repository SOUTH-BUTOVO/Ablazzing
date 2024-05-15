package ru.Ablazzing.lesson11_Generics_ArrayList_LinkedList;

public class Computer<T extends Input> {
    private T input;

    public Computer() {
    }

    public Computer(T input) {
        this.input = input;
    }

    public T getInput() {
        return input;
    }

    public void setInput(T input) {
        this.input = input;
    }
}
