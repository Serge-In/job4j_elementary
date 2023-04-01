package ru.job4j.array;

public class MinDiapason {
    /**
     * Возвращает значение минимального элемента в массиве int в пределах диапазона индексов start - finish
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];

        for (int index = start + 1; index <= finish; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}