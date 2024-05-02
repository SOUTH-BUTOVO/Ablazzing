package ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW.flora;

public class Pine implements Wood {
    @Override
    public void cones() {
        System.out.println("У сосны есть шишки");
    }

    @Override
    public void smelling() {
        System.out.println("У сосны есть аромат");
    }

    @Override
    public void blooms() {}
}
