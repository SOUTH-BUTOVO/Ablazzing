package ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW.flora;

public class Spruce implements Wood {
    @Override
    public void cones() {
        System.out.println("У ели есть шишки");
    }

    @Override
    public void smelling() {
        System.out.println("У ели есть аромат");
    }

    @Override
    public void blooms() {}
}
