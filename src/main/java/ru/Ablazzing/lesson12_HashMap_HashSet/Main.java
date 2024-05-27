package ru.Ablazzing.lesson12_HashMap_HashSet;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Long> map = new HashMap<>();
        map.put("France", 80_000_000L);
        map.put("Spain", 40_000_000L);
        System.out.println(map);

        Long countPeopleOfChina = map.getOrDefault("China", -1L);
        System.out.println(countPeopleOfChina);

        System.out.println(map.values());

        map.put("China", 1_500_000_000L);
        System.out.println(map);

        for (Map.Entry<String, Long> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
