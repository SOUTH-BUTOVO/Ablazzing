package ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW.storage;

public class Storage {
    int countVodka = 0;

    public Storage() {
    }

    public Storage(int countVodka) {
        this.countVodka = countVodka;
    }

    public int getCountVodka() {
        return countVodka;
    }

    public void setCountVodka(int countVodka) {
        this.countVodka = countVodka;
    }

    void takeProduct() {
        this.countVodka--;
    }
}
