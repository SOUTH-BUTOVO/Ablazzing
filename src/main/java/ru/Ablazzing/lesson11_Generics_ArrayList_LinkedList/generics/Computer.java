package ru.Ablazzing.lesson11_Generics_ArrayList_LinkedList.generics;

public class Computer<T extends Input, V extends Output> {
    private T input;
    private V output;

    public Computer() {
    }

    public Computer(T input) {
        this.input = input;
    }

    public Computer(V output) {
        this.output = output;
    }

    public Computer(T input, V output) {
        this.input = input;
        this.output = output;
    }

    public T getInput() {
        return input;
    }

    public void setInput(T input) {
        this.input = input;
    }

    public V getOutput() {
        return output;
    }

    public void setOutput(V output) {
        this.output = output;
    }
}
