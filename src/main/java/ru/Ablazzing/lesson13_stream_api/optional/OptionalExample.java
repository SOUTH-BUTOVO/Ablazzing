package ru.Ablazzing.lesson13_stream_api.optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Car audi = new Car("Audi");
        Car bmw = new Car("BMW");

        Car[] garage = {audi, bmw};

        garage[0] = null;
        Car firstCar = garage[0];

//        CarOptional carOptional = CarOptional.ofNullable(firstCar);
        Optional<Car> carOptional = Optional.ofNullable(firstCar);

        System.out.println(Arrays.toString(garage));
        printBrandOfCar(carOptional.orElse(new Car("Lada")));
    }

    public static void printBrandOfCar(Car car) {
        System.out.println(car.getBrand());
    }
}
