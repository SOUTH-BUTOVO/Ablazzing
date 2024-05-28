package ru.Ablazzing.lesson12_HashMap_HashSet.cloneAgent95;

public class Agent implements Cloneable {
    String name;

    public Agent(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Agent {" + "name - '" + name + '\'' + '}';
    }
}
