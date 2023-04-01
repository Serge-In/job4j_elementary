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

    /**
     * 6.7.2. Моно столбец в матрице. [#214127]
     * Проверяет заполнение колонки массива символов
     * возвращает true, если в заданной колонке массива содержатся только 'X', иначе - false
     * 2023-04-01
     */
    public static boolean monoVertical(char[][] board, int column) {
        for (char[] row : board) {
            if (row[column] != 'X') {
                return false;
            }
        }
        return true;
    }

    /**
     * 6.7.3. Массив из диагонали матрицы.  [#214128]
     * Возвращает одномерный массив char элементами диагонали из двухмерного массива char.
     * 2023-04-01
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * 6.7.4. Выигрышные комбинации в сокобан [#53859]
     * Проверяет двумерный 5*5 массив char на заполнение строки или столбца символами 'X'.
     * 2023-04-01
     */
    public static boolean isWin(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    return true;
                }
            }
        }
        return false;
    }
}