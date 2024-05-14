package ru.Ablazzing.lesson10;

public final class StringUtilClass {

    public static final String SUFFIX = ".";

    /** Приватные методы и атрибуты, можно вызывать только внутри класса StringUtilClass.
    Класс УТИЛИТНЫЙ:
            - У него, нет экземпляра.
            - Все атрибуты и методы статические.
            - И сам класс, final class. */

    private StringUtilClass() {}

    public static String getFirstLetterFromName(String text) {
        if (text.length() > 0) {
            return text.substring(0, 1) + SUFFIX;
        }
        return "";
    }
}
