package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    /**
     * 6.8.1. Жадный алгоритм. Сдача в кофе машине [#34741]
     * Возвращает массив int значений в порядке убывания номинала монет для сдачи
     * money - сумма денег, полученных машиной от покупателя
     * price - цена покупки
     * 2023-04-02
     */
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int changeAmount = money - price;
        int i = 0;
        int j = 0;
        while (changeAmount > 0 && i < coins.length) {
            if (coins[i] <= changeAmount) {
                rsl[j] = coins[i];
                size = j + 1;
                j++;
                changeAmount -= coins[i];
            } else {
                i++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}