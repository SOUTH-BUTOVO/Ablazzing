package ru.Ablazzing.lesson13_stream_api;

public class Car {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    public void start() throws Exception {
        if (fuel < 1) {
            throw new Exception("В баке нет бензина!");
        }
        System.out.println("Машина завелась.");
    }
}
