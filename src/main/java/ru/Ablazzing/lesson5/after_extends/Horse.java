package ru.Ablazzing.lesson5.after_extends;

public final class Horse extends Animal {
    int weight;

    public Horse(String nickname, int weight) {
        super(nickname);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void name() {
        System.out.println(super.nickname);
    }

    public void name2() {
        System.out.println(this.nickname);
    }

    @Override
    public void makeSound() {
        System.out.println("Лошадка заржала");
    }
}
