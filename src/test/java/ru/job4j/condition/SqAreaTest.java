package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static ru.job4j.condition.SqArea.*;

public class SqAreaTest {

    @Test
    public void whenP5K1Then1dot5625() {
        double p = 5;
        double k = 1;
        double exp = 1.5625;
        double out = square(p, k);
        double eps = 0.0001;
        Assert.assertEquals(exp, out, eps);
    }

    @Test
    public void whenP4K6Then0dot4897() {
        double p = 4;
        double k = 6;
        double exp = 0.4897;
        double out = square(p, k);
        double eps = 0.0001;
        Assert.assertEquals(exp, out, eps);
    }

    @Test
    public void whenP0K0Then0() {
        double p = 0;
        double k = 0;
        double exp = 0;
        double out = square(p, k);
        double eps = 0.0001;
        Assert.assertEquals(exp, out, eps);
    }
}