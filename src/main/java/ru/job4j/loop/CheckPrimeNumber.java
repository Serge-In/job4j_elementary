package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number == 1) {
            return false;
        } else {
            for (int i = number / 2; i > 1; i--) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}