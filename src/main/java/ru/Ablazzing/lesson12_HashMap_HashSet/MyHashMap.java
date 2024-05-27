package ru.Ablazzing.lesson12_HashMap_HashSet;

import java.util.Arrays;

public class MyHashMap {
    private Node[] keys = new Node[16];

    public static class Node {
        private String key;
        private Long value;
        private Node next;

        public Node(String key, Long value) {
            this.key = key;
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key='" + key + '\'' +
                    ", value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public void put(String key, Long value) {
        int index = Math.abs(key.hashCode() % 15);
        if (keys[index] == null) {
            keys[index] = new Node(key, value);
        } else {
            if (!keys[index].equals(key)) {
                Node existNode = keys[index];
                existNode.next = new Node(key, value);
            }
        }
    }

    public Long get(String key) {
        int index = Math.abs(key.hashCode() % 15);
        if (keys[index] == null) {
            return null;
        }
        Node currentNode = keys[index];
        do {
            if (currentNode.key.equals(key)) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }
        while (currentNode != null);
        return null;
    }

    public boolean contains(String key) {
        int index = key.hashCode() % 15;
        return keys[index] != null && keys[index].equals(key);
    }

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put("Yuri8", 100L);
        myHashMap.put("Yuri13", 200L);
//        myHashMap.put("Petr", 300L);

        System.out.println(Arrays.toString(myHashMap.keys));
        System.out.println(myHashMap.contains("Yuri8"));
        System.out.println(myHashMap.get("Yuri13"));
    }
}
