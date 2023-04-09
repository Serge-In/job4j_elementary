package ru.job4j.array;

/**
 * Способы инициализации 2-х массива с присвоением
 * 2023-04-01
 */
public class ArraysInit {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("a.length = " + a.length); // -> 3

        int[][] b = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("b.length = " + b.length); // -> 3
    }
}
