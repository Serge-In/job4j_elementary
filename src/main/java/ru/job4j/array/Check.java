package ru.job4j.array;

/**
 * Проверяет, что элементы в массиве являются либо ВСЕ true либо ВСЕ false
 * Решение задачи сводится к проверке всех элементов с эталонным (с первым элементом массива)
 */
public class Check {
    public static boolean mono(boolean[] data) {
        for (int i = 1; i < data.length; i++) {
            if (data[i] != data[0]) {
                return false;
            }
        }
        return true;
    }
}