package ru.Ablazzing.lesson10.hw;

public class FinancialRecord {
    /* 2 Создать класс FinancialRecord, с двумя атрибутами (incomes, outcomes), (доходы, расходы).
        Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты. Создать объект класса,
        прямо здесь (class HomeWork, метод main), с доходами 500, расходами 300. Записать в файл
        "report.txt" данные из объекта класса.
        Ожидаемый результат: В файле "report.txt" - одна строка (доходы = 500, расходы = 300). */

    private double incomes, outcomes;

    public FinancialRecord() {}

    public FinancialRecord(double incomes, double outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public double getIncomes() {
        return incomes;
    }

    public void setIncomes(double incomes) {
        this.incomes = incomes;
    }

    public double getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(double outcomes) {
        this.outcomes = outcomes;
    }

    HomeWork homeWork = new HomeWork();

    void main2() {
        incomes = 300;
        outcomes = 150;
        System.out.println(incomes + " " + outcomes);
    }

    class HomeWork {
        void main() {
            FinancialRecord financialRecord = new FinancialRecord(200, 100);
            incomes = 500;
            outcomes = 30;
            System.out.println(outcomes);
        }
    }
}
