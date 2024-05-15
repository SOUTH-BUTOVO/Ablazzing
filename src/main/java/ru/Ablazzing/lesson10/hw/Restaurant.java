package ru.Ablazzing.lesson10.hw;
/* 2 Создать сеть ресторанов, которая обладает общими для всех ресторанов, запасами продуктов:
        сосиски, хлеб. Каждый ресторан может подать блюдо, тогда минус 1 сосиска и два куска хлеба из
        общего запаса. Если сосисок или хлеба не хватает, тогда вывести на экран: "Нет ингредиентов!"
        Каждый ресторан может принять партию товара: плюс 100 сосисок и 200 кусков хлеба.
        Запасы продуктов должны быть скрыты от чужих глаз! */

public class Restaurant {

    private static int sausage = 0;
    private static int bread = 20;

    public static int getSausage() {
        return sausage;
    }

    public static int getBread() {
        return bread;
    }

    void order(int sausage, int bread) {
            for (int i = sausage; i > 0; i--) {
                sausage--;
                bread-=2;
                System.out.println("Заказ выполнен, клиент получил сосиску и 2 куска хлеба." + i);
            }
        System.out.println("Нет ингредиентов!");
    }

    void addProducts() {
        sausage += 10;
        bread += 20;
        System.out.println("Склад ресторанов получил сосиски: " + sausage + "  и хлеб: " + bread);
    }
}
