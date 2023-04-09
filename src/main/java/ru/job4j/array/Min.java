package ru.job4j.array;

public class Min {
    /**
     * Возвращает значение минимального элемента в массиве int
     * 2023-03-31
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}