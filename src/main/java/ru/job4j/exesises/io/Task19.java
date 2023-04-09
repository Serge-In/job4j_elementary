package ru.job4j.exesises.io;

/**
 * Напишите класс, который присваивает переменной х значение 9,
 * а затем выводит на экран: в первой строке ― это значение с поясняющей надписью (например, «значение х равно 9»),
 * а во второй ― квадрат этого значения (тоже с поясняющей надписью).
 */
public class Task19 {
    public static void main(String[] args) {
        int x = 9;
        System.out.println("Значение x равно " + x); // 9
        System.out.println("Значение x^2 равно " + (int) Math.pow(x, 2.0)); // 81
        System.out.println("Значение x^2 равно " + Math.pow(x, 2.0)); // 81.0
    }
}
