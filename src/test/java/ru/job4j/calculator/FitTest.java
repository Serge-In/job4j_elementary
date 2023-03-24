package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void when187Then100dot05() {
        short in = 187;
        double exp = 100.05;
        double out = Fit.manWeight(in);
        float eps = 0.01f;
        Assert.assertEquals(exp, out, eps);
    }

    @Test
    public void when167Then100dot05() {
        short in = 167;
        double exp = 65.55;
        double out = Fit.womanWeight(in);
        float eps = 0.01f;
        Assert.assertEquals(exp, out, eps);
    }
}