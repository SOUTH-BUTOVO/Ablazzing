package ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW.task5;

public class Human {
    private int age;
    private String name;
    private double weight;


    public static HumanBuilder builder() {
        return new HumanBuilder();
    }

    public static class HumanBuilder {
        private Human human = new Human();

        public HumanBuilder age(int newAge) {
            human.setAge(newAge);
            return this;
        }

        public HumanBuilder name(String newName) {
            human.setName(newName);
            return this;
        }

        public HumanBuilder weight(double newWeight) {
            human.setWeight(newWeight);
            return this;
        }

        public Human build() {
            return human;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void info() {
        System.out.printf("Имя: %s, %s лет, вес - %s", name, age, weight);
    }
}
