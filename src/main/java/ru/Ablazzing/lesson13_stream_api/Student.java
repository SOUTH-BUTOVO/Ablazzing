package ru.Ablazzing.lesson13_stream_api;

public class Student {
    private int height;

    public Student(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Student {" + "height - " + height + '}';
    }
}
