package ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW;

import ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW.cars.Bmw;
import ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW.cars.Cars;
import ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW.cars.Lada;
import ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW.computer.Electronic;
import ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW.flora.*;
import ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW.storage.Storage;
import ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW.storage.Worker;
import ru.Ablazzing.lesson6_Polimorf_Interf_Static.HW.task5.Human;

public class Main {
    public static void main(String[] args) {
        /* 1 Создать следующие классы:
            - Electronic (имеет метод on и off - включает/выключает электрический прибор, подумать
        какой нужен атрибут для этого метода, имеет метод без реализации - work).
            - Computer (имеет метод loadSystem - выводит в консоль сообщение "загрузка компьютера").
            - LenovoComputer (имеет метод loadSystem - выводит в консоль сообщение "загрузка Lenovo").
        Метод work у компьютера выводит в консоль "выполняет вычесления".
        Подумать какие классы и методы являются абстрактными, к каким методам нужна надпись @Override. */
        //Electronic electronic = new Electronic();
        Electronic.onAndOff(false);
        Electronic.onAndOff(true);
        Electronic.onAndOff(false);
        System.out.println("--------------------");

        /* 2 Создать два класса машин, создать 4 экземпляра и положить их в один массив. */
        Cars bmw1 = new Bmw("Белый", 5);
        Cars bmw2 = new Bmw("Красный", 2);
        Cars lada1 = new Lada("Баклажан", 5);
        Cars lada2 = new Lada("Чёрный", 5);

        Cars[] cars = {bmw1, bmw2, lada1, lada2};
        for (Cars car : cars) {
            System.out.println(car);
        }
        System.out.println("--------------------");

        /* 3 Создать следующую структуру из классов и интерфейсов:
            - дерево -> ель (имеет шишки, умеет пахнуть)
            - дерево -> сосна (имеет шишки, умеет пахнуть)
            - растение -> роза (умеет цвести, умеет пахнуть)
            - растение -> папортник (умеет цвести)
        Создать у каждого класса по объекту, распределить по массивам интерфейсов. И у каждого массива
        вызвать характерный метод. Ожидание:
            - сосна: умеет пахнуть
            - ель: умеет пахнуть
            - роза: умеет пахнуть
            - роза: умеет цвести
            - папортник: умеет цвести */
        Spruce spruce = new Spruce();
        Pine pine = new Pine();
        Rose rose = new Rose();
        Fern fern = new Fern();
        Flora[] floras = {spruce, pine, rose, fern};
        for (Flora flor : floras) {
            flor.smelling();
            flor.blooms();
            //flor.cones();
            //System.out.println(flor);
        }
        System.out.println("--------------------");

        int numberDay = 5;

        switch (numberDay) {
            case (1):
                System.out.println("Понедельник");
                break;
            case (2):
                System.out.println("Вторник");
                break;
            case (3):
                System.out.println("Среда");
                break;
            case (4):
                System.out.println("Четверг");
                break;
            case (5):
                System.out.println("Пятница");
                break;
            case (6):
                System.out.println("Суббота");
                break;
            case (7):
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Не правильно введён день недели");
        }

//        switch (numberDay) {
//            case 1 -> System.out.println("Понедельник");
//            case 2 -> System.out.println("Вторник");
//            case 3 -> System.out.println("Среда");
//            case 4 -> System.out.println("Четверг");
//            case 5 -> System.out.println("Пятница");
//            case 6 -> System.out.println("Суббота");
//            case 7 -> System.out.println("Воскресенье");
//            default -> System.out.println("Не правильно введён день недели");
//        }

        /* Проверить работоспособность машины: двигатель(Engine) и трансмиссия(Transmission) -
        работают, и хотя бы 3 колеса из 4 не проколоты.
        Если машина работоспособна, вывести на экран - машина готова к эксплуатации.
        Если машина НЕработоспособна, вывести на экран - машина сломана.
        */
        boolean isWorkEngine = true;
        boolean isWorkTransmission = true;
        boolean isFineWheel1 = true;
        boolean isFineWheel2 = false;
        boolean isFineWheel3 = true;
        boolean isFineWheel4 = false;

        int countFineWheel = 0;

        countFineWheel += isFineWheel1 ? 1 : 0;
        countFineWheel += isFineWheel2 ? 1 : 0;
        countFineWheel += isFineWheel3 ? 1 : 0;
        countFineWheel += isFineWheel4 ? 1 : 0;

        System.out.println("Исправных шин: " + countFineWheel);
        if (isWorkEngine && isWorkTransmission && countFineWheel >= 3) {
            System.out.println("Машина готова к эксплуатации");
        } else {
            System.out.println("Машина сломана");
        }
        System.out.println("--------------------");

    /* 4 Написать систему управления складскими запасами. Создать класс склад, создать класс работники
    (написать геттеры на все атрибуты). Количество работников минимум 3. Работники берут со склада
    товар и портят его. Нужно написать взаимодействие через методы работников и склада. Работник берёт
    со склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран "Ура, я
    испортил водку!" и добавляет к себе в журнал, количество испорченного товара. У склада есть только
    одна позиция товара - Водка. */
        Storage storage = new Storage(10);
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();
        worker1.takeVodka(storage);
        worker2.takeVodka(storage);
        worker3.takeVodka(storage);
        System.out.println("--------------------");

        /* 5 Реализовать шаблон Builder для класса Human (атрибуты - возраст, имя, вес. Метод: инфо о
        человеке). Для этого шаблона характерно:
            - Приватный конструктор.
            - Вложенный статический класс (HumanBuilder).
            - Статический метод builder(), который возвращает экземпляр типа HumanBuilder.
        Во время инициализации HumanBuilder, создаётся объект класса Human и записывается в приватный атрибут.
            - Класс HumanBuilder имеет методы, которые имеют то же самое название, что и атрибуты класса
        Human, которые вызывают сеттеры у экземпляра класса Human.
            - HumanBuilder имеет метод buld(); который возвращает готовый объект типа Human.
        Ожидаемый результат:
        Human human = Human.builder().name("Пётр").age(20).weight(80).build();
        human.info();
        Пётр - возраст 20, вес 80. */
        //Human.HumanBuilder humanBuilder = new Human.HumanBuilder();
        Human petr = Human.builder().name("Petr").age(20).weight(81).build();
        petr.info();
    }
}
