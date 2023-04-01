package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TurnTest {
    @Test
    void backIn0Out0() {
        int[] in = {0};
        int[] expected = {0};
        int[] result = Turn.back(in);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void backIn01Out10() {
        int[] in = {0, 1};
        int[] expected = {1, 0};
        int[] result = Turn.back(in);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void backIn011Out110() {
        int[] in = {0, 1, 1};
        int[] expected = {1, 1, 0};
        int[] result = Turn.back(in);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void backIn0123Out3210() {
        int[] in = {0, 1, 2, 3};
        int[] expected = {3, 2, 1, 0};
        int[] result = Turn.back(in);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void backIn0123456Out6543210() {
        int[] in = {0, 1, 2, 3, 4, 5, 6};
        int[] expected = {6, 5, 4, 3, 2, 1, 0};
        int[] result = Turn.back(in);
        assertThat(result).containsExactly(expected);
    }
}