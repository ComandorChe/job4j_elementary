package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        String id = idea + " " + "But I am newbie.";
        int year = 2021;
        String result = " " + idea + " " + year;
        System.out.println(id + result);
    }
}
