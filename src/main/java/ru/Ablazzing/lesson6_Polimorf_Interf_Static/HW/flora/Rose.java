package ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW.flora;

public class Rose implements Plant {
    @Override
    public void cones() {}

    @Override
    public void smelling() {
        System.out.println("Роза имеет запах");
    }

    @Override
    public void blooms() {
        System.out.println("Роза умеет цвести");
    }
}
