package ru.job4j.array;

/**
 * 6.6.4. Двухмерный массив. Таблица умножения. [#33491]
 * Возвращает 2х мерный массив заданной размерности size * size
 * заполненный произведением индексов (i + 1) * (j + 1)
 * 2023-04-01
 */
public class Matrix {
    public static int[][] multiple(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }
        return arr;
    }
}
