package ru.Ablazzing.lesson1_dataTypes.HW;

/* 2.2 Дано:
            boolean hasFuel = true;
            boolean hasElectricsProblem = false;
            boolean hasMotorProblem = false;
            boolean hasTransmissionProblem = true;
            boolean hasWheelsProblem = true;
        В автосервис приехала сломанная машина. Механники находят неисправность следующим способом:
            - Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1 т.р.
            за консультацию.
            - Если у машины проблемы с двигателем, то чинят и берут 10 000.
            - Если у машины проблема с электрикой, то чинят и берут 5 000.
            - Если у машины проблема с коробкой передач, то чинят и берут 3 000.
            - Если у машины проблема с колёсами, то чинят и берут 2 000.
            - Если две детали сломаны, то на общий счёт идёт скидка 10%.
            - Если сломана коробка передач, электрика или двигатель, то на общий счёт скидка 20%.
            - Если нет бензина и что то сломано, то за консультацию денег не берут.
        Ситуации, что бензин есть и ничего не сломано - быть не может.
        Ожидаемый результат: выведен на экран, счёт клиенту. */

public class CarService {
    boolean hasFuel;
    int fuelPrice = 1000;
    boolean hasElectricsProblem;
    int electricsProblemPrice = 5000;
    boolean hasMotorProblem;
    int motorProblemPrice = 10000;
    boolean hasTransmissionProblem;
    int transmissionProblemPrice = 3000;
    boolean hasWheelsProblem;
    int wheelsProblemPrice = 2000;

    int price = 0;
    int count = 0;

    public CarService() {
    }

    public CarService(boolean hasFuel,
                      boolean hasElectricsProblem,
                      boolean hasMotorProblem,
                      boolean hasTransmissionProblem,
                      boolean hasWheelsProblem) {
        this.hasFuel = hasFuel;
        this.hasElectricsProblem = hasElectricsProblem;
        this.hasMotorProblem = hasMotorProblem;
        this.hasTransmissionProblem = hasTransmissionProblem;
        this.hasWheelsProblem = hasWheelsProblem;
    }

    void repair() {
        if (hasFuel && (hasElectricsProblem ||
                    hasMotorProblem ||
                    hasTransmissionProblem ||
                    hasWheelsProblem)) {
            System.out.println("В баке автомобиля небыло бензина.");
        } else {
            price += fuelPrice;
            System.out.println("В баке автомобиля небыло бензина.\nСчёт клиенту: " +
                    fuelPrice + " рублей за консультацию/диагностику.");
        }
        if (hasMotorProblem) {
            price += motorProblemPrice;
            count++;
            System.out.println("В автомобиле устранили проблему с двигателем.\nСчёт клиенту: " +
                    motorProblemPrice + " рублей за ремонт двигателя.");
        }
        if (hasElectricsProblem) {
            price += electricsProblemPrice;
            count++;
            System.out.println("В автомобиле устранили проблему с электрикой.\nСчёт клиенту: " +
                    electricsProblemPrice + " рублей за ремонт электрики.");
        }
        if (hasTransmissionProblem) {
            price += transmissionProblemPrice;
            count++;
            System.out.println("В автомобиле устранили проблему с коробкой передач.\nСчёт клиенту: " +
                    transmissionProblemPrice + " рублей за ремонт коробки передач.");
        }
        if (hasWheelsProblem) {
            price += wheelsProblemPrice;
            count++;
            System.out.println("В автомобиле устранили проблему с колёсами.\nСчёт клиенту: " +
                    wheelsProblemPrice + " рублей за ремонт колёс.");
        }

        int discount = 0;
        if (count == 2) {
            discount = 10;
        } if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
            discount = 20;
        }

        System.out.println("----------------------------------------------");
        if (discount != 0) {
            System.out.println("Скидка для клиента от выполненных работ: " + discount + "%");
            System.out.println("Скидка составила: " + (price * discount / 100) + " рублей.");
            System.out.println("Стоимость ремонта без скидки: " + price + " рублей.");
        }

        System.out.println("----------------------------------------------");

        System.out.println("Итоговая стоимость ремонта: " +
                          (price - (price * discount / 100)) + " рублей.");
    }
}
