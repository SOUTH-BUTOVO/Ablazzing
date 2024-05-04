package ru.Ablazzing.lesson7_ObjectEnum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Fish fish1 = new Fish("yaz", 3, Country.FRANCE);
        Fish fish3 = new Fish("yaz", 3, Country.FRANCE);
        System.out.println(fish1);
        Fish fish2 = new Fish("okyn`", 1, Country.RUSSIA);
        Fish fish4 = new Fish("okyn`", 1, Country.RUSSIA);

        Class<? extends Fish> fishClass = fish1.getClass();
        System.out.println(fishClass.getSuperclass().getName());

        System.out.println(fish1.hashCode());
        System.out.println(fish3.hashCode());
        System.out.println(fish2.hashCode());

        boolean b = fish1.equals(fish3);
        boolean b2 = fish1 == fish3;
        System.out.println(b);
        System.out.println(b2);
        System.out.println(fish2.equals(fish4));

        System.out.println("--------------");
        Fish clone = (Fish) fish1.clone();
        System.out.println(clone.equals(fish1));
        System.out.println(clone == fish1);
        System.out.println(fish3 == fish1);

        Country russia = Country.RUSSIA;
        System.out.println(russia);
        boolean b3 = fish1.getCountry() == fish3.country;
        System.out.println(b3);

        System.out.println("--------------");
        Country[] values = Country.values();
        System.out.println(Arrays.toString(values));

        System.out.println(Country.RUSSIA.ordinal());
    }
}
