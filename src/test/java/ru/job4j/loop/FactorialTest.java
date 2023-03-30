package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {

    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = 5;
        int out = Factorial.calc(in);
        int exp = 120;
        assertThat(out).isEqualTo(exp);
    }

    @Test
    void whenCalculateFactorialFor2Then2() {
        int in = 2;
        int out = Factorial.calc(in);
        int exp = 2;
        assertThat(out).isEqualTo(exp);
    }

    @Test
    void whenCalculateFactorialFor0ThenOne() {
        int in = 0;
        int out = Factorial.calc(in);
        int exp = 1;
        assertThat(out).isEqualTo(exp);
    }
}