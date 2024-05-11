package ru.Ablazzing.lesson10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car.Wheel wheel = new Car.Wheel(true);
        Car car = new Car(20_000);
        Car.Engine engine = car.new Engine(3);
        Car.Engine engine1 = new Car(1).new Engine(11);
        double volume = engine1.getVolume();
        System.out.println(volume);

        System.out.println(engine);
        System.out.println("-----------------");

        Move human = new Move() {
            @Override
            public void move() {
                System.out.println("Человек идёт.");
            }
        };
        Move airplane = new Move() {
            @Override
            public void move() {
                System.out.println("Самолёт летит.");
            }
        };
        Move dog = new Move() {
            @Override
            public void move() {
                System.out.println("Собака бежит.");
            }
        };
        Move[] mass = {human, airplane, dog};
        for (Move arr : mass) {
        arr.move();
        }

        human.move();
        airplane.move();
        dog.move();
    }
}
