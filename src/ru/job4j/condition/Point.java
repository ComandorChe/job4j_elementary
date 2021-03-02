package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int x = x2 - x1;
        int y = y2 - y1;
        double first = Math.pow(x, 2);
        double second = Math.pow(y, 2);
        double rsl = first + second;
        return Math.sqrt(rsl);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 2, 0, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(10, 35, 40, 75);
        System.out.println("result1 (10, 35) to (40, 75) " + result1);
        double result2 = Point.distance(4, 12, 60, 36);
        System.out.println("result2 (4, 12) to (60, 36) " + result2);
    }
}
