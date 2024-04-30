package ru.Ablazzing.lesson5.after_extends;

public abstract class Animal {
    String nickname;

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return "Animal{" +
                "nickname='" + nickname + '\'' +
                '}';
    }
}
