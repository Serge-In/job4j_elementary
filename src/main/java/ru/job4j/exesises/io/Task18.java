package ru.job4j.exesises.io;

import java.util.Scanner;

/**
 * 18. Простые геометрические вычисления
 * Дана сторона квадрата a. Найти его периметр.
 * Дан радиус окружности r. Найти длину окружности и площадь круга.*
 * прим: в консоли десятичный разделитель . / , зависит от установок системы
 */
public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("сторона квадрата a = ");
        double a = input.nextDouble();
        System.out.printf("периметр = %.2f %n", Math.pow(a, 2));

        System.out.print("радиус окружности r = ");
        double r = input.nextDouble();
        System.out.printf("Длина окружности = %,1f \n", 2 * Math.PI * r);
        System.out.printf("Площадь круга = %,1f \n", Math.PI * Math.pow(r, 2.0));
    }
}
