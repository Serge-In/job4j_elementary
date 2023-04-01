package ru.job4j.array;

public class SortSelected {
    /**
     * Сортировка int массива методом выборки
     */
    public static int[] sort(int[] data) {
        for (int start = 0; start < data.length - 1; start++) {
            int min = MinDiapason.findMin(data, start, data.length - 1);
            int index = FindLoop.indexInRange(data, min, start, data.length - 1);
            if (start != index) {
                data = SwitchArray.swap(data, start, index);
            }
        }
        return data;
    }
}
