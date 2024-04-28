package ru.Ablazzing.lesson4;

public class Human {
    Integer height;
    private int age;

    String name;

    public Human() {
    }

    public Human(Integer height, String name) {
        this.height = height;
        this.name = "Yuri";
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = "Yuri";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Поздравляем с днём рождения!");
    }

    @Override
    public String toString() {
        return name + " " + age + " " + height;
    }
}
