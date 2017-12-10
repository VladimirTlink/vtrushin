package ru.job4j.calculator;

/**
 *Class Calculate решение задачи части 3 урок 2.3.
 *@autor vtrushin
 *@since 09.12.2017
 */

public class Calculator {
    private double result;

    public void plus(double first, double second) {
        this.result = first + second;
    }

    public void subtract(double first, double second) {
        this.result = first - second;
    }
    public void div(double first, double second) {
        this.result = first / second;
    }
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    public double getResult() {
        return this.result;
    }
}