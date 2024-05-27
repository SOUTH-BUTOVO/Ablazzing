package ru.Ablazzing.lesson12_HashMap_HashSet.task79;

public class Security extends Professions {

    public Security() {
        super(15_000, "Мужчина");
    }

    @Override
    void job() {
        System.out.println("Охранник сторожит.");
    }

    @Override
    void coffeeBreak() {
        System.out.println("Охранник пьёт кофе с печеньками.");
    }

    @Override
    void getSalary() {
        System.out.println(gender + " Охранник получает зарплату: " + salary + " рублей.");
    }

    @Override
    public String toString() {
        return "Security{" +
                "salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
}
