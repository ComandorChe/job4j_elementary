package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(1000);
        System.out.println("1000 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(1000);
        System.out.println("1000 rubles are " + dollar + " dollar.");

        int in = 1000;
        int expected = 14;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("1000 rubles are 14. Test result : " + passed);

        int in1 = 1000;
        int expected1 = 16;
        int out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("1000 rubles are 16. Test result : " + passed1);
    }
}
