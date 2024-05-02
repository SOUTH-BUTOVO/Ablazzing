package ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW.cars;

public class Lada extends Cars {
    public Lada(String color, int numSeat) {
        super(color, numSeat);
    }

    @Override
    public String toString() {
        return "L A D A - " + "цвет: " + color + ", количество мест: " + numSeat;
    }
}
