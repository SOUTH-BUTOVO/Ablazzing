package ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW.flora;

public class Fern implements Plant {
    @Override
    public void cones() {}

    @Override
    public void smelling() {}

    @Override
    public void blooms() {
        System.out.println("Папоротник умеет цвести");
    }
}
