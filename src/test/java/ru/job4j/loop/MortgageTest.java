package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MortgageTest {
    @Test
    void whenLoan100Salary120Percent20ThenYear1() {
        double loan = 100;
        int salary = 120;
        double percent = 0.20;
        int expected = 1;
        int rsl = Mortgage.year(loan, salary, percent);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenLoan100Salary50Percent20ThenYear3() {
        double loan = 100;
        int salary = 50;
        double percent = 0.20;
        int expected = 3;
        int rsl = Mortgage.year(loan, salary, percent);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenLoan150Salary50Percent20ThenYear6() {
        double loan = 150;
        int salary = 50;
        double percent = 0.20;
        int expected = 6;
        int rsl = Mortgage.year(loan, salary, percent);
        assertThat(rsl).isEqualTo(expected);
    }
}