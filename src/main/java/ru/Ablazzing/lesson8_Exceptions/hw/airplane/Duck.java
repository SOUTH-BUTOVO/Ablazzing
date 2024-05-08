package ru.Ablazzing.lesson8_Exceptions.hw.airplane;

public class Duck implements Flyable {
    boolean isInjured = true;

    public static DuckBuilder builder() {
        return new DuckBuilder();
    }

    public static class DuckBuilder {
        private Duck duck = new Duck();

        public DuckBuilder isInjured(boolean isInjured) {
            duck.setInjured(isInjured);
            return this;
        }

        public Duck build() {
            return duck;
        }
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    @Override
    public void fly() {
        if (isInjured) {
            //System.out.println("Утка ранена и не может лететь");
            try {
                throw new FlyException(" Утка ранена: " + isInjured);
            } catch (FlyException e) {
                System.err.println("Утка ранена и не может лететь." + e.getMessage());
                //e.printStackTrace();
            }
        } else {
            System.out.println("Утка летит.");
        }
    }
}
