package ru.Ablazzing.lesson11_Generics_ArrayList_LinkedList.list;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(null);
        System.out.println(listA);

        List<Integer> list = new ArrayList<>();
        list.add(0);
        listA.ensureCapacity(1);

        System.out.println(list.contains(0));

        listA.stream();
        list.stream();
        System.out.println("-----------");


        List<Integer> listL = new LinkedList<>();

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(10);
        myLinkedList.add(15);
        System.out.println(myLinkedList);


        List<Integer> integers = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            integers.add(i);
            if (i % 10_000 == 0) {
                System.out.println(i + " - done");
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);


//        Set<User> users = new TreeSet<>();
//        users.add(new User(13));
//        users.add(new User(10));
//        users.add(new User(15));
//
//        System.out.println(users);
    }
}
