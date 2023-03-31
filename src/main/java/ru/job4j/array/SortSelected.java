package ru.job4j.array;

public class SortSelected {
    /**
     * Сортировка int массива методом выборки
     */
    public static int[] sort(int[] data) {
        int minNumberInRange;
        int indexOfMinNumberInRange;
        int start;
        int end = data.length - 1;
        for (start = 0; start < end; start++) {
            minNumberInRange = MinDiapason.findMin(data, start, end);
            indexOfMinNumberInRange = FindLoop.indexInRange(data, minNumberInRange, start, end);
            if (start != indexOfMinNumberInRange) {
                data = SwitchArray.swap(data, start, indexOfMinNumberInRange);
            }
        }
        return data;
    }
}
