package ru.Ablazzing.lesson12_HashMap_HashSet.task79;

@FunctionalInterface
public interface Functional {

    void doSomething();

    default void makeSound1() {
        System.out.println("s1");
    }

    default void makeSound2() {
        System.out.println("s2");
    }

    default void makeSound3_n() {
        System.out.println("s3...n");
    }


    class Main {
        public static void main(String[] args) {
            Functional func1 = () -> System.out.println("Если абстрактный метод, тогда будет вот это!");
            Functional func2 = () -> System.out.println("Если абстрактный метод, тогда будет вот это!");

            Functional[] fu = {func1, func2};

            for (Functional f : fu) {
                f.doSomething();
                f.makeSound1();
                f.makeSound2();
                f.makeSound3_n();
            }
            System.out.println("-------------------");

            func1.doSomething();
        }
    }
}
