package ru.job4j.array;

public class TwoNumberSum {
    /**
     * 6.8. Метод двух указателей [#225]
     * Метод принимает одномерный массив array типа int, а также число target.
     * Возвращает массив из двух индексов элементов массива array, которые в сумме равны числу target.
     * Если такой суммы нет – метод должен вернуть массив нулевой длины.
     * Условия:
     * - в массиве не может быть менее 2 элементов;
     * - в массиве может быть только одна пара чисел, сумма которых равна целевой сумме;
     * - одно и то же число можно использовать только один раз;
     * - числа могут повторяться;
     * - элементы в массиве отсортированы по возрастанию.
     * Применяется алгоритм «Метод двух указателей»
     * 2023-04-02
     */
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        while (i < array.length && j < array.length) {
            if (array[i] + array[j] == target) {
                int[] result = {i, j};
                return result;
            } else if (j == array.length - 1 || array[i] + array[j] > target) {
                i++;
                j = i + 1;
            }
            j++;
        }
        int[] result = {};
        return result;
    }
}