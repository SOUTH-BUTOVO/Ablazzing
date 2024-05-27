package ru.Ablazzing.lesson12_HashMap_HashSet;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Product, Integer> map1 = giveMeStorageWithApples();
        Product product = new Product("Apple0");
        System.out.println(product);
        System.out.println("---------");
        System.out.println(map1);
        System.out.println("---------");

        for (Map.Entry<Product, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("Orange", 101);
        map2.put("Apple", 155);
        System.out.println(map2);

    }

    public static HashMap<Product, Integer> giveMeStorageWithApples() {
        HashMap<Product, Integer> map1 = new HashMap<>();
        Product apple = new Product("Apple");
        map1.put(apple, 100);
        return map1;
    }
}
