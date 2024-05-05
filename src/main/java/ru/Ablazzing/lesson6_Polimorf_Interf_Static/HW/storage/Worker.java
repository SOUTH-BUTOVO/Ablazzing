package ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW.storage;

public class Worker {
    int countBrokenVodka = 0;

    public Worker() {
    }

    public Worker(int countBrokenVodka) {
        this.countBrokenVodka = countBrokenVodka;
    }

    public int getCountBrokenVodka() {
        return countBrokenVodka;
    }

    public void setCountBrokenVodka(int countBrokenVodka) {
        this.countBrokenVodka = countBrokenVodka;
    }

    public void takeVodka(Storage storage) {
        storage.takeProduct();
        System.out.println("Ура, я испортил водку!");
        countBrokenVodka++;
    }
}
