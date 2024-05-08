package ru.Ablazzing.lesson8_Exceptions.hw.shop;

public class WatchBrokenError extends RuntimeException {
    public WatchBrokenError(String message) {
        super(message);
    }
}
