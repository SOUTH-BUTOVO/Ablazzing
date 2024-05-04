package ru.Ablazzing.lesson7_ObjectEnum;

import java.util.Objects;

public class Fish extends Object implements Cloneable{
    String name;
    Integer age;
    Country country;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Fish fish = (Fish) o;
        return Objects.equals(name, fish.name) && Objects.equals(age, fish.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Fish(String name, int age, Country country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Fish " + "name: '" + name + '\'';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Integer getAge() {
        return age;
    }

    public Country getCountry() {
        return country;
    }
}
