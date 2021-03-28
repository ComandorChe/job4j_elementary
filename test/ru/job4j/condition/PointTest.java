package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 2;
        int x2 = 0;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1035to4075then50() {
        int x1 = 10;
        int y1 = 35;
        int x2 = 40;
        int y2 = 75;
        double expected = 50;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when412to6036then60() {
        int x1 = 4;
        int y1 = 12;
        int x2 = 60;
        int y2 = 36;
        double expected = 60.92618484691127;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}