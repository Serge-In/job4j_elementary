package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort1() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[]{12, 0, 0, 12, 5, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{0, 0, 4, 5, 12, 12};
        assertThat(result).containsExactly(expected);
    }
}