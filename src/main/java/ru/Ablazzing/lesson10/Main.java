package ru.Ablazzing.lesson10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.function.Function;

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

        Move human = new Move () {
            @Override
            public void move() {
                System.out.println("Человек идёт.");
            }

            @Override
            public void stop() {
                System.out.println("Человек остановился.");
            }
        };

        Move airplane = new Move () {
            @Override
            public void move() {
                System.out.println("Самолёт летит.");
            }
            @Override
            public void stop() {
                System.out.println("Самолёт приземлился.");
            }
        };

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.stream().map((e) -> e * 3);

        Function<Integer, Integer> function = new Function<>() {
            @Override
            public Integer apply(Integer o) {
                return o * 3;
            }
        };

        Move dog = new Move() {
            @Override
            public void move() {
                System.out.println("Собака бежит.");
            }
            @Override
            public void stop() {
                System.out.println("Собака остановилась.");
            }
        };
        human.move();
        airplane.move();
        dog.move();
        System.out.println("-----------------");

        Move[] mass = {human, airplane, dog};
        for (Move arr : mass) {
            //arr.move();
            arr.stop();
        }
        System.out.println("-----------------");

        String result = StringUtilClass.getFirstLetterFromName("Sergey");
        System.out.println(result);
        System.out.println("-----------------");

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(1986, Month.JUNE, 26);
        LocalDate date3 = date1.minus(30, ChronoUnit.DAYS);
        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(dateTime1);
    }
}
