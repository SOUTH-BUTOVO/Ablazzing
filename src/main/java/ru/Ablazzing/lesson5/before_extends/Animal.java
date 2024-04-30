package ru.Ablazzing.lesson5.before_extends;

public class Animal {
    String nickname;
    String name;

    public Animal() {
    }

    public Animal(String nickname, String name) {
        this.nickname = nickname;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound() {
        if (name.equals("Лошадка")) {
            System.out.println("Ржёт");
        } else {
            System.out.println("Voice");
        }
    }
}
