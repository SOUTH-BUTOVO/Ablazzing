package ru.Ablazzing.lesson10;

import java.util.Arrays;

public class Car {
    private double price;
    private Wheel[] wheels = new Wheel[4];
    private Engine engine;

    public Car(double price) {
        this.price = price;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getPrice() {
        return price;
    }

    public static class Wheel {
        private boolean isBroken;

        public Wheel(boolean isBroken) {
            this.isBroken = isBroken;
        }
    }

    public class Engine {
        private double volume;

        public Engine(double volume) {
            this.volume = volume;
        }

        public double getVolume() {
            return volume;
        }
    }

    @Override
    public String toString() {
        return "Это engine1 " + price+"/"+engine+"/"+wheels;
    }
}
