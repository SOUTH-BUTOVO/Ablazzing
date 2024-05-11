package ru.Ablazzing.lesson8_Exceptions.hw;

import ru.Ablazzing.lesson8_Exceptions.hw.Decorator.Car;
import ru.Ablazzing.lesson8_Exceptions.hw.Decorator.CarShop;
import ru.Ablazzing.lesson8_Exceptions.hw.airplane.Airplane;
import ru.Ablazzing.lesson8_Exceptions.hw.airplane.Duck;
import ru.Ablazzing.lesson8_Exceptions.hw.airplane.Flyable;
import ru.Ablazzing.lesson8_Exceptions.hw.shop.*;

public class Main {
    public static void main(String[] args) {

    /* 1 Создать два класса, которые умеют летать: Самолёт и Утка. Атрибут Утки: isInjured (ранен),
    атрибут Самолёта: countPassengers.
        - Создать интерфейс, который объединяет эти два класса.
        - Имплементировать его в двух классах.
        - Реализовать метод летать, для Утки:
            - Метод летать будет выкидывать ошибку FlyException (создать такой класс), если Утка
        подстрелена, иначе печатать на экран "Утка летит".
        Для Самолёта:
            - Метод летать будет выкидывать ошибку FlyException, если количество пассажиров меньше 0.
        Иначе печать на экран "Самолёт летит".
        - Создать 1 Утку не раненую, 1 Утку раненую, 1 Самолёт с 10 пассажирами, 1 Самолёт с -1 пассажиром.
        - Положить их всех в массив, перебрать и вызвать у каждого элемента метод fly.
        - Перехватить исключения: вывести на экран message ошибки. Ожидание:
            - Утка летит.
            - Ошибка: Утка ранена.
            - Самолёт летит.
            - Ошибка: пассажиров в Самолёте меньше 0. */
        Airplane pobeda = Airplane.builder().countPassengers(10).build();
        Airplane beda = Airplane.builder().countPassengers(-10).build();

        Duck billi = Duck.builder().isInjured(false).build();
        Duck villi = Duck.builder().isInjured(true).build();

        Flyable[] flyables = {pobeda, beda, billi, villi};
        for (Flyable flyable : flyables) {
            //flyable.fly();
        }

        String carMark = "Audi";
        String carModel = "Q3";
        double price = 15_000.00;
        boolean hasAutomaticTransmission = false;
        System.out.printf("Привет, я менеджер салона " + carMark +
                          "\nУ нас есть модель - " + carModel + " за " + price +
                          "\nЕсть ли у неё, автоматическая коробка передач?\n" +
                          (hasAutomaticTransmission ? "Да\n" : "Нет\n"));
        // Три кавычки! Это работает в ЖДК 15+
//        String str = """
//                     Привет, я менеджер салона %s
//                     У нас есть модель - %s за %f
//                     Есть ли у неё автоматическая коробка передач?
//                     %s
//                     """.formatted(carMark, carModel, price, hasAutomaticTransmission ? "Да" : "Нет");
        System.out.println("-----------------");

    /* 2 Создать следующую структуру из классов и интерфейсов:
        - Магазин (обладает работниками)
        - Работник (обладает часами - (часы одни))
        - Часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
        - Бренд (обладает массивом магазинов)
    Создать Бренд, положить в него два магазина, в каждом магазине будет по работнику, у каждого работника
    по часам. У одного работника часы сломаны, у второго нет.
    После создания Бренда, вытащить из него все часы и вызвать у всех часов метод тикать, обработать ошибку
    сломанных часов. Ожидание вывода на экран:
        - Часы тикают.
        - Ошибка: Часы сломаны. */
        Watch watch1 = new Watch(false);
        Watch watch2 = new Watch(true);

        Worker worker1 = new Worker(watch1);
        Worker worker2 = new Worker(watch2);

        Store store1 = new Store(new Worker[]{worker1});
        Store store2 = new Store(new Worker[]{worker2});

        Brand brands = new Brand(new Store[]{store1, store2});

        for (Store store : brands.getStores()) {
            for (Worker worker : store.getWorkers()) {
                try {
                    worker.getWatch().tick();
                } catch (WatchBrokenError e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        System.out.println("-----------------");


    /* 3 Реализовать Паттерн Decorator для Класса Car (атрибут - стоимость, метод - вывести на экран стоимость).
    Метод вывести на экран стоимость - выкидывает ошибку, если стоимость меньше 0. Для этого шаблона характерно:
        - Класс основа (Car), и Класс декоратор (CarShop), который принимает в себя экземпляр класса основы.
        - Вызов всех методов, происходит у декоратора.
    Необходимо вызвать у декоратора метод продать машину, который выведет на экран для машины со стоимостью 500.
        Здравствую клиент, цена этого авто (Вызвано из объекта CarShop):
            500 - (Вызвано из объекта Car)
            Хочешь купить авто? (Вызвано из объекта CarShop)

    Если стоимость машины меньше нуля:
        Здравствуй клиент, цена этого авто (Вызвано из объекта CarShop):
        Неизвестна мне - (Вызвано из объекта CarShop)
        Давайте посмотрим другое авто? (Вызвано из объекта CarShop) */
        Car car1 = new Car(10_000);
        Car car2 = new Car(-10_000);
        CarShop carShop1 = new CarShop(car1);
        CarShop carShop2 = new CarShop(car2);
        carShop1.getPrice();
        carShop2.getPrice();

    }
}
