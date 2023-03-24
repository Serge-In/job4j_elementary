package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static ru.job4j.condition.Point.*;

public class PointTest {

    @Test
    public void when00To55Then7dot07() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 5;
        double exp = 7.07;
        double out = distance(x1, y1, x2, y2);
        double eps = 0.01;
        Assert.assertEquals(exp, out, eps);
    }

    @Test
    public void when00To15Then5dot09() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 1;
        int y2 = 5;
        double exp = 5.09;
        double out = distance(x1, y1, x2, y2);
        double eps = 0.01;
        Assert.assertEquals(exp, out, eps);
    }

    @Test
    public void when34To12Then2dot82() {
        int x1 = 3;
        int y1 = 4;
        int x2 = 1;
        int y2 = 2;
        double exp = 2.82;
        double out = distance(x1, y1, x2, y2);
        double eps = 0.01;
        Assert.assertEquals(exp, out, eps);
    }
}