package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int result = 0;
        for (int i = 2; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                result++;
            }
        }
        return result;
    }
}
