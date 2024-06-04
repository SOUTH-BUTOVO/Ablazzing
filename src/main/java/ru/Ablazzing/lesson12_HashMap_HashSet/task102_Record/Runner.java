package ru.Ablazzing.lesson12_HashMap_HashSet.task102_Record;

public class Runner {
    public static void main(String[] args) {
        Human human1 = new Human(1992, "Ivan", "Ivanovich", "Ivanov");
        System.out.println(human1);

        System.out.println("---------------------------");

        HumanRecord humanRecord1 = new HumanRecord(1992, "Ivan", "Ivanovich", "Ivanov");
        System.out.println(humanRecord1);
        humanRecord1.getInfo();
    }
}
