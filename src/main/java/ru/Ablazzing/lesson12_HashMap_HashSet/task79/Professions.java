package ru.Ablazzing.lesson12_HashMap_HashSet.task79;

public class Professions {
    int salary;
    String gender;

    public Professions(int salary, String gender) {
        this.salary = salary;
        this.gender = gender;
    }

    void coffeeBreak() {
        System.out.println("Кофе заваривается");
    }

    void job() {
        System.out.println("Работа работается");
    }

    void getSalary() {
        System.out.println("Зарплата в банке");
    }
}

class Runner {
    public static void main(String[] args) {
        Security security = new Security();
        Accountant accountant = new Accountant();
        Secretary secretary = new Secretary();

//        secretary.job();
//        accountant.coffeeBreak();
//        security.getSalary();

        Professions[] prof = {security, accountant, secretary};
        for (Professions professions : prof) {
            //System.out.println(professions);
            System.out.println("-----------------");
            professions.job();
            professions.coffeeBreak();
            professions.getSalary();
        }
        System.out.println("-----------------");

        workers(security, accountant, secretary);
    }

    static void workers(Professions prof1, Professions prof2, Professions prof3) {
        prof1.job();
        prof2.job();
        prof3.job();
    }
}
