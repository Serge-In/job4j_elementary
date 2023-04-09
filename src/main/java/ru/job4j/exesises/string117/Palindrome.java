package ru.job4j.exesises.string117;

/**
 * 1. Является ли число симметричным (палиндромом)
 * Задание: Написать код, который проверяет, является ли входящее int число симметричным (палиндромом),
 * и выводит в консоль "Да", если является, и "Нет", если не является.
 * Прим: класс StringBuilder предложила Idea взамен простой конкатенации строки
 */
public class Palindrome {
    public static void isPalindrome(int number) {
        String str = String.valueOf(number);
        StringBuilder strReverse = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            strReverse.insert(0, str.charAt(i));
        }
        String result = str.equals(strReverse.toString()) ? "Да" : "Нет";
        System.out.println(result);
    }

    public static void main(String[] args) {
        isPalindrome(6419346); // Нет
        isPalindrome(6439346); // Да
    }
}
