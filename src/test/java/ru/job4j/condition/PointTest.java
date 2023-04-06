package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To55Then7dot07() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 5;
        double exp = 7.07;
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        double out = point1.distance(point2);
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
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        double out = point1.distance(point2);
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
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        double out = point1.distance(point2);
        double eps = 0.01;
        Assert.assertEquals(exp, out, eps);
    }
}