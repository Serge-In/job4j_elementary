package ru.job4j.exesises.basetypes;
/**
 * 10. Преобразовать градусы Фаренгейта в градусы Цельсия
 * Связь между температурой по шкале Цельсия и температурой по шкале Фаренгейта выражается следующей формулой:
 * C = 5 * (F - 32) / 9, где С - температура по шкале Цельсия, F - температура по шкале Фаренгейта.
 * Задача: написать код, который преобразовывает полученное значение градусов Фаренгейта в градусы Цельсия.
 * Значение градусов Фаренгейта принимается вводом с клавиатуры с помощью класса Scanner в виде целого числа.
 */

import java.util.Scanner;
public class Celsius2Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число - градусы по цельсию: ");
        int fahrenheit = input.nextInt();
        double celsius = ((double) fahrenheit - 32) * 5 / 9;
        System.out.printf("это равно %.1f по Фаренгейту", celsius);
    }
}