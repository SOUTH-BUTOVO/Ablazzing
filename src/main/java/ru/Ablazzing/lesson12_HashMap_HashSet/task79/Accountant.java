package ru.Ablazzing.lesson12_HashMap_HashSet.task79;

public class Accountant extends Professions{

    public Accountant() {
        super(50_000, "Женщина");
    }

    @Override
    void job() {
        System.out.println("Бухгалтер считает налоги.");
    }

    @Override
    void coffeeBreak() {
        System.out.println("Бухгалтер пьёт кофе с тортиком.");
    }

    @Override
    void getSalary() {
        System.out.println(gender + " Бухгалтер получает зарплату: " + salary + " рублей.");
    }

    @Override
    public String toString() {
        return "Accountant{" +
                "salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
}
