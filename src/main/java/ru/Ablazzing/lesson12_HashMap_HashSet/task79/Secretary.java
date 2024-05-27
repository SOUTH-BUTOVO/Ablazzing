package ru.Ablazzing.lesson12_HashMap_HashSet.task79;

public class Secretary extends Professions {

    public Secretary() {
        super(30_000, "Женщина");
    }

    @Override
    void job() {
        System.out.println("Секретарша печатает документы.");
    }

    @Override
    void coffeeBreak() {
        System.out.println("Секретарша пьёт кофе с шоколадкой.");
    }

    @Override
    void getSalary() {
        super.salary = 45_000;
        System.out.println(gender + " Секретарша получает зарплату: " + salary + " рублей.");
    }

    @Override
    public String toString() {
        return "Secretary{" +
                "salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
}
