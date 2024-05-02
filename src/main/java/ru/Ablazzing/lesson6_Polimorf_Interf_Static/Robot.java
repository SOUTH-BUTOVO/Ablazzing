package ru.Ablazzing.lesson6_Polimorf_Interf_Static;

public class Robot implements Defendable{

    public void defend() {
        System.out.println("Робот охраняет" + STR);
    }

    @Override
    public void attack() {
        System.out.println("Робот атакует нарушителя");
    }
}
