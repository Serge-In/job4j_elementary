package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    /**
     * 6.5. Поиск элемента в массиве в диапазоне индексов с start по finish. [#156318]
     * возвращает индекс в массиве для найденного элемента
     * если элемент в массиве не найден, вернет -1
     */
    public static int indexInRange(int[] data, int el, int start, int finish) {
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                return i;
            }
        }
        return -1;
    }
}