package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minAndDiv(double first, double second) {
        return min(first, second)
                + div(first, second);
    }

    public static double sumResult(double first, double second) {
        return sum(first, second)
                + min(first, second)
                + multiply(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minAndDiv(15, 30));
        System.out.println("Результат расчета равен: " + sumResult(25, 40));
    }
}
