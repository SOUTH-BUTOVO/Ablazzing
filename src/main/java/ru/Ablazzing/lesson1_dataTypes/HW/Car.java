package ru.Ablazzing.lesson1_dataTypes.HW;

public class Car {
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

    void problemsCar() {
    CarService carService = new CarService(false,
                                  false,
                                  false,
                                  false,
                                  false);
    carService.repair();
    }
}
