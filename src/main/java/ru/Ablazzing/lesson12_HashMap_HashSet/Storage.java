package ru.Ablazzing.lesson12_HashMap_HashSet;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apples", 100);
        Integer worker1CountApples = 10;
        map.put("Apples", worker1CountApples);
        Integer apples = map.getOrDefault("Apples", 0);
        map.put("Apples", apples + worker1CountApples);
        System.out.println(map);
    }
}
