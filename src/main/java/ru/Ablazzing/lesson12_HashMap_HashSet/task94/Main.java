package ru.Ablazzing.lesson12_HashMap_HashSet.task94;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("ablazzing", "111111");
        User user2 = new User("ablazzing", "222222");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.equals(user2));
    }
}
