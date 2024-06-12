package ru.Ablazzing.lesson13_stream_api;

import java.util.List;

public class ExceptionStreamExample {
    public static void main(String[] args) {
        List<Car> car = List.of(new Car(0));
        car.stream().forEach(e -> {
            try {
                e.start();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}
