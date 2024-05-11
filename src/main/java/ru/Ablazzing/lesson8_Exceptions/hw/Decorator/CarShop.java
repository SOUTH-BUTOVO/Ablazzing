package ru.Ablazzing.lesson8_Exceptions.hw.Decorator;

public class CarShop implements Sell{
    private Car car;

    public CarShop(Car car) {
        this.car = car;
    }

    public void getPrice() {
        System.out.println("Здравствуй клиент, цена этого авто");
        try {
            car.getPrice();
            System.out.println("Хочешь купить авто?");
        } catch (PriceException e) {
            System.out.println("Неизвестная мне.\n" +
                               "Давайте посмотрим другое авто!");
        }
    }
}
