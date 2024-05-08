package ru.Ablazzing.lesson8_Exceptions.hw.airplane;

public class Airplane implements Flyable {
    private int countPassengers = 0;

    public static AirplaneBuilder builder() {
        return new AirplaneBuilder();
    }

    public static class AirplaneBuilder {
        private Airplane airplane = new Airplane();

        public AirplaneBuilder countPassengers(int countPassengers) {
            airplane.setCountPassengers(countPassengers);
            return this;
        }

        public Airplane build() {
            return airplane;
        }
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() {
        if (countPassengers < 0) {
            //System.out.println("Отрицательное количество пассажиров, самолёт не может лететь.");
            try {
                throw new FlyException(" Количество пассажиров самолёта: " + countPassengers);
            } catch (FlyException e) {
                System.err.println("Отрицательное количество пассажиров, самолёт не может лететь." + e.getMessage());
                //e.printStackTrace();
            }
        } else {
            System.out.println("Самолёт летит.");
        }
    }
}
