package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoNumberSumTest {
    /**
     * getIndexesVer01
     * Version 01
     * индекс i с 0 до array.length
     * индекс j изменяется с i + 1 до array.length
     */
    @Test
    void ver01whenTwoEqualsNumbersYesTarget() {
        int[] array = {5, 5};
        int target = 10;
        int[] result = TwoNumberSum.getIndexesVer01(array, target);
        int[] expected = {0, 1};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void ver01whenTwoEqualsNumbersNoTarget() {
        int[] array = {5, 5};
        int target = 12;
        int[] result = TwoNumberSum.getIndexesVer01(array, target);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void ver01whenWithNegativeNumbersYesTarget() {
        int[] array = {-7, -5, 0, 5, 8, 12};
        int target = 3;
        int[] result = TwoNumberSum.getIndexesVer01(array, target);
        int[] expected = {1, 4};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void ver01whenWithoutNegativeNumbersYesTarget() {
        int[] array = {0, 2, 5, 8, 10, 12};
        int target = 15;
        int[] result = TwoNumberSum.getIndexesVer01(array, target);
        int[] expected = {2, 4};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * getIndexesVer02
     * Version 02
     * индекс i с 0 до array.length
     * индекс j изменяется с array.length - 1 до i
     */
    @Test
    void ver02whenTwoEqualsNumbersYesTarget() {
        int[] array = {5, 5};
        int target = 10;
        int[] result = TwoNumberSum.getIndexesVer02(array, target);
        int[] expected = {0, 1};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void ver02whenTwoEqualsNumbersNoTarget() {
        int[] array = {5, 5};
        int target = 12;
        int[] result = TwoNumberSum.getIndexesVer02(array, target);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void ver02whenWithNegativeNumbersYesTarget() {
        int[] array = {-7, -5, 0, 5, 8, 12};
        int target = 3;
        int[] result = TwoNumberSum.getIndexesVer02(array, target);
        int[] expected = {1, 4};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void ver02whenWithoutNegativeNumbersYesTarget() {
        int[] array = {0, 2, 5, 8, 10, 12};
        int target = 15;
        int[] result = TwoNumberSum.getIndexesVer02(array, target);
        int[] expected = {2, 4};
        assertThat(result).isEqualTo(expected);
    }
}