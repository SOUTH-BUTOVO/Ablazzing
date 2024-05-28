package ru.Ablazzing.lesson12_HashMap_HashSet.task79;

public class Example implements Ex{
    @Override
    public void eat() {
        Ex.super.eat();
    }

    @Override
    public void run() {
        Ex.super.run();
    }

    public static void main(String[] args) {
        System.out.println(Ex.count);

        Example example = new Example();
        example.eat();
        example.run();
        //System.out.println(example.eat());
    }
}
