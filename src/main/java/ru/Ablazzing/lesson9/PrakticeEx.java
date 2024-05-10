package ru.Ablazzing.lesson9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class PrakticeEx {
    public static void main(String[] args) throws IOException {

    /*  Дан файл, со следующим содержанием csv:
            price;carModel;mileage
        10_000;bmw;20_000;
        Создать массив машин, объектов, прочитать файл вытащить все машины и сохранить их в массив кар.*/
        String trackCar =
        "P:\\iT6ka\\JAVA\\PROJECTS\\Ablazzing\\src\\main\\java\\ru\\Ablazzing\\lesson9\\txt\\cars.csv";
        int countAllLines = countLines(trackCar);
        Car[] cars = new Car[countAllLines];
        readCarsToArray(trackCar, cars);
        System.out.println(Arrays.toString(cars));

//        Car bmw1 = Car.builder().carModel("BMW-M3").mileage(20_000).price(10_000).build();
//        Car bmw2 = Car.builder().carModel("BMW-X5").mileage(25_000).price(13_000).build();
//        Car[] mass = {bmw1, bmw2};
//        System.out.println(bmw1 +"\n"+ bmw2);
//        for (Car arr : mass) {
//            System.out.println(arr);
//        }
    }

    public static void readCarsToArray(String trackCar, Car[] cars) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(trackCar))) {
            int countLines = 0;
            while (reader.ready()) {
                String line = reader.readLine();
                if (countLines == 0) {
                    countLines++;
                    continue;
                }
                String[] fields = line.split(";");
                int price = Integer.parseInt(fields[0]);
                String carModel = fields[1];
                int mileage = Integer.parseInt(fields[2]);
                Car car = new Car(price, carModel, mileage);
                cars[countLines-1] = car;
                countLines++;
            }
        }
    }

    public static int countLines(String trackCar) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(trackCar))) {
            int countLines = 0;
            while (reader.ready()) {
                reader.readLine();
                countLines++;
            }
            return countLines-1;
        }
    }
}
