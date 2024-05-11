package ru.Ablazzing.lesson8_Exceptions.hw.shop;

public class Watch {
    private boolean isBroken;

    public Watch(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public void tick() {
        if (isBroken) {
            throw new WatchBrokenError("Ошибка: Часы сломаны.");
        }
        System.out.println("Часы тикают");
    }
}
