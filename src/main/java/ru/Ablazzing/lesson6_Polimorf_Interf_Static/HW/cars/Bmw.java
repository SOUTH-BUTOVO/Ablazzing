package ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW.cars;

public class Bmw extends Cars {
    public Bmw(String color, int numSeat) {
        super(color, numSeat);
    }

    @Override
    public String toString() {
        return "BMW - " + "цвет: " + color + ", количество мест: " + numSeat;
    }
}
