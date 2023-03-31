package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {

    @Test
    void whenSwap0to3() {
        int[] array = {1, 2, 3, 4};
        int source = 0;
        int destination = array.length - 1;
        int[] expected = {4, 2, 3, 1};
        int[] result = SwitchArray.swap(array, source, destination);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap1to2() {
        int[] array = {1, 2, 3, 4};
        int source = 1;
        int destination = 2;
        int[] expected = {1, 3, 2, 4};
        int[] result = SwitchArray.swap(array, source, destination);
        assertThat(result).containsExactly(expected);
    }
}