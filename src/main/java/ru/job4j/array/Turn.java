package ru.job4j.array;

public class Turn {
    /**
     * Return array in reverse order of elements
     *
     * @param array length is odd / even
     * @return array
     * @version 2023-04-01
     */
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}