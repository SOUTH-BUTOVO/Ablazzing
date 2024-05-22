package ru.Ablazzing.lesson11_Generics_ArrayList_LinkedList.list;

public class MyLinkedList {
    private Integer value;
    private MyLinkedList myLinkedList;

    public void add(Integer num) {
        if (value == null) {
            this.value = num;
        } else {
            myLinkedList = new MyLinkedList();
            myLinkedList.add(num);
        }
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "value=" + value +
                ", myLinkedList=" + myLinkedList +
                '}';
    }
}
