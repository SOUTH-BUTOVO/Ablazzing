package ru.Ablazzing.lesson9;

public class Car {
    private int price;
    private String carModel;
    private int mileage;

    public Car() {
    }

    public Car(int price, String carModel,  int mileage) {
        this.price = price;
        this.carModel = carModel;
        this.mileage = mileage;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {
        private Car car = new Car();

        public CarBuilder carModel(String carModel) {
            car.setCarModel(carModel);
            return this;
        }

        public CarBuilder price(int price) {
            car.setPrice(price);
            return this;
        }

        public CarBuilder mileage(int mileage) {
            car.setMileage(mileage);
            return this;
        }

        public Car build() {
            return car;
        }
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", price=" + price +
                ", mileage=" + mileage +
                '}';
    }
}
