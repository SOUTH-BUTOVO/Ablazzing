package ru.Ablazzing.lesson13_stream_api;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

public class MethodReferenceExample {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        FactoryBrick.createBrick();
        System.out.println("-----------");

        Class<FactoryBrick> factoryBrickClass = FactoryBrick.class;
        Arrays.stream(factoryBrickClass.getMethods()).forEach(e -> System.out.println(e.getName()));
        System.out.println("-----------");

        Method method = factoryBrickClass.getMethods()[0];
        method.invoke(FactoryBrick.class, null);
        System.out.println(method.getName());
        System.out.println("---------------");

        Stream.of(1, 2, 3).forEach(e -> System.out.print(e));
        System.out.println();
        Stream.of(1, 2, 3).forEach(System.out::print);
    }
}
