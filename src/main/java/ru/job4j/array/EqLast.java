package ru.job4j.array;

public class EqLast {
    /**
     * Are the last elements in both arrays equal?
     *
     * @param left  - integer array
     * @param right - integer array
     * @return (true / false)
     * @author Sergin
     * @version 2023-03-31
     */
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }
}