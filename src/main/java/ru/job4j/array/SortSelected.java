package ru.job4j.array;

public class SortSelected {
    /**
     * Сортировка int массива методом выборки
     */
    public static int[] sort(int[] data) {
        for (int start = 0; start < data.length - 1; start++) {
            if (start != FindLoop.indexInRange(
                    data, MinDiapason.findMin(data, start, data.length - 1), start, data.length - 1)
            ) {
                data = SwitchArray.swap(
                        data, start, FindLoop.indexInRange(
                                data, MinDiapason.findMin(data, start, data.length - 1), start, data.length - 1)
                );
            }
        }
        return data;
    }
}
