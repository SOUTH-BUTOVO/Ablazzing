package ru.Ablazzing.lesson13_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example {
    public static void main(String[] args) {
        List<String> products = List.of("яблоко", "молоко", "печенье", "яблоко", "масло");
        int cont = 0;
        for (String product : products) {
            System.out.println(product);
            if (product.equals("яблоко")) {
                cont++;
            }
        }
        System.out.println(cont);

        System.out.println(products.stream().filter(e -> e.equals("яблоко")).count());
        System.out.println("-----------------");

        System.out.println(sum(1, 2));
        System.out.println(sumDirty(1, 2));
        System.out.println(sumDirty(1, 2));
        System.out.println(sumDirty2(1, 2));
        System.out.println("-----------------");

        Airplane airplane = new Airplane();
        airplane.fly();
        Flyable flyable1 = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Самолётик лети!");
            }
        };
        flyable1.fly();
        System.out.println("-----------------");

        Flyable airplane3 = () -> System.out.println("Третий самолётик полетел!");
        airplane3.fly();
        System.out.println("-----------------");

        Calc calc = (a, b) -> a + b;
        int result1 = calc.add(11, 22);
        System.out.println(result1);
        System.out.println("-----------------");

        Flyable flyable2 = () -> {
            System.out.println("Вертолёт взлетел.");
            System.out.println("Вертолёт летит.");
            System.out.println("Вертолёт приземлился.");
        };
        flyable2.fly();
        System.out.println("-----------------");

        Calc calc2 = (a, b) -> {
            System.out.println("Результат программы: " + (a + b));
            return a + b;
        };
        calc2.add(2, 7);
        System.out.println("-----------------");

        // Проверка на возраст.
        Predicate<Integer> isAdult = (age) -> age >= 18;
        boolean result2 = isAdult.test(30);
        System.out.println(result2);
        System.out.println("-----------------");

        // Покупка в автомате
        Function<Integer, String> automate = (money) -> {
            if (money == 100) {
                return "Cola";
            } else if (money == 50) {
                return "Water";
            } else {
                return "Nothing";
            }
        };
        System.out.println(automate.apply(100));
        System.out.println("-----------------");

        // Костёр, принимает и не возвращает.
        Consumer<String> fire = (i) -> {
            if (i.equalsIgnoreCase("Дрова")) {
                System.out.println("Огонь горит долго.");
            } else if (i.equalsIgnoreCase("Бумага")) {
                System.out.println("Огонь горит быстро.");
            }
        };
        fire.accept("бумага");
        System.out.println("-----------------");

        // Терминал получения талона в очереди.
        Supplier<Integer> talon = () -> new Random().nextInt(100);
        System.out.println("Ваш талон: " + talon.get());
        System.out.println("-----------------");

        // Comparator
        Student ivan = new Student(190);
        Student petr = new Student(180);

        Student[] students = {ivan, petr};
        System.out.println(Arrays.toString(students));
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println(ivan.getHeight() - petr.getHeight());
        System.out.println(compare(ivan, petr));

        Comparator<Student> studentComparator = (st1, st2) -> st1.getHeight() - st2.getHeight();
        System.out.println(studentComparator.compare(ivan, petr));

        sortStudents(students, studentComparator);
        System.out.println(Arrays.toString(students));

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sumDirty(int a, int b) {
        return a + b + new Random().nextInt();
    }

    static int sumDirty2(int a, int b) {
        System.out.println("Печатаю результат на экран:" + (a + b));
        return a + b;
    }

    static int compare(Student st1, Student st2) {
        return st1.getHeight() - st2.getHeight();
    }

    static void sortStudents(Student[] students, Comparator<Student> comparator) {
        int result = comparator.compare(students[0], students[1]);
        if (result > 0) {
            Student temp = students[0];
            students[0] = students[1];
            students[1] = temp;
        }
    }

}
