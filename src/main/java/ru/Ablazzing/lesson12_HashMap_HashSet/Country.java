package ru.Ablazzing.lesson12_HashMap_HashSet;

public enum Country {
    FRANCE(67_000_000L, "French language", "Eurasia"),
    ARGENTINA(47_000_000L, "Spanish language", "South America"),
    ITALY(58_000_000L, "Italian language", "Eurasia");

    private long population;
    private String language;
    private String continent;

    Country(long population, String language, String continent) {
        this.population = population;
        this.language = language;
        this.continent = continent;
    }



    static class Runner {
        public static void main(String[] args) {
            System.out.println(FRANCE + " " + FRANCE.population + " " + FRANCE.language + " " + FRANCE.continent);
            System.out.println(Country.ARGENTINA + " " + ARGENTINA.language);
            System.out.println(ITALY + " " + ITALY.continent);
        }
    }
}
