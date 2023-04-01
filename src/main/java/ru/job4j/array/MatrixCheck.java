package ru.job4j.array;

public class MatrixCheck {
    /**
     * 6.7.1. Моно строка в матрице. [#214126]
     * Проверяет заполнение строки массива символов
     * возвращает true, если в заданной строке массива содержатся только пробел или 'X', иначе - false
     * 2023-04-01
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int j = 0; j < board[row].length; j++) {
            if (!(board[row][j] == 'X' || board[row][j] == ' ')) {
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
        for (char[] chars : board) {
            if (chars[column] != 'X') {
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
     * Проверяет двумерный массив char на заполнение строки или столбца
     * последовательностью из 5-ти символов 'X'.
     * 2023-04-01
     */
    public static boolean isWin(char[][] board) {
        int charSequence = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    charSequence++;
                    if (charSequence == 5) {
                        return true;
                    }
                } else {
                    charSequence = 0;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] == 'X') {
                    charSequence++;
                    if (charSequence == 5) {
                        return true;
                    }
                } else {
                    charSequence = 0;
                }
            }
        }
        return false;
    }
}