package ru.Ablazzing.lesson7_ObjectEnum;

public enum Country implements Statistics {
    RUSSIA(150), FRANCE(70),
    ITALY(60), GERMANY(75);

    private final long countPeoples;

    Country(long countPeoples) {
        this.countPeoples = countPeoples;
    }

    public long getCountPeoples() {
        return countPeoples;
    }

    @Override
    public void getStatistics() {

    }
}
