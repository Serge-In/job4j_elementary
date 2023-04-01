package ru.job4j.array;

public class MatrixCheck {
    /**
     * 6.7.1. Моно строка в матрице. [#214126]
     * Проверяет заполнение строки массива символов
     * возвращает true, если в заданной строке массива содержатся только 'X', иначе - false
     * 2023-04-01
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        for (char el : board[row]) {
            if (el != 'X') {
                return false;
            }
        }
        return true;
    }
}
