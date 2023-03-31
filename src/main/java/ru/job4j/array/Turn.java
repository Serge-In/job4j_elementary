package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        if (array.length == 1) {
            return array;
        }
        for (int i = 0; i <= array.length / 2 - 1; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}