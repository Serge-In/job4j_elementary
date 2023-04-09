package ru.job4j.loop;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PrimeNumberTest {

    @Test
    void when1Then0() {
        int number = 1;
        int exp = 0;
        int result = PrimeNumber.calc(number);
        assertThat(result).isEqualTo(exp);
    }

    @Test
    void when2Then1() {
        int number = 2;
        int exp = 1;
        int result = PrimeNumber.calc(number);
        assertThat(result).isEqualTo(exp);
    }

    @Test
    void when3Then2() {
        int number = 3;
        int exp = 2;
        int result = PrimeNumber.calc(number);
        assertThat(result).isEqualTo(exp);
    }

    @Test
    void when4Then2() {
        int number = 4;
        int exp = 2;
        int result = PrimeNumber.calc(number);
        assertThat(result).isEqualTo(exp);
    }

    @Test
    void when5Then3() {
        int number = 5;
        int exp = 3;
        int result = PrimeNumber.calc(number);
        assertThat(result).isEqualTo(exp);
    }

    @Test
    void when11Then5() {
        int number = 11;
        int exp = 5;
        int result = PrimeNumber.calc(number);
        assertThat(result).isEqualTo(exp);
    }
}