package ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW.computer;

public class Electronic {

    public static void onAndOff(boolean button) {
        Computer computer = new Computer();
        LenovoComputer lenovoComputer = new LenovoComputer();
        if (button == true) {
            System.out.println("Включено");
            computer.loadSystem();
            lenovoComputer.loadSystem();
            computer.work();
        } else {
            System.out.println("Выключено");
        }
    }

    void work() {}
}
