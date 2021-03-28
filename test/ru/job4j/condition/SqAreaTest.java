package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP4K1thenSquare1() {
        double p = 4;
        double k = 1;
        double expected = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K2thenSquare2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K3thenSquare3() {
        double p = 8;
        double k = 3;
        double expected = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP150K4thenSquare9() {
        double p = 15;
        double k = 4;
        double expected = 9;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP30K5thenSquare31() {
        double p = 30;
        double k = 5;
        double expected = 31.25;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}