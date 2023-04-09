package ru.job4j.exesises.io;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Катет А = ");
        double cathetA = input.nextDouble();
        System.out.printf("Катет Б = ");
        double cathetB = input.nextDouble();
        System.out.printf("Гипотенуза = ");
        double hypotenuse = input.nextDouble();
        double perimeter = cathetA + cathetB + hypotenuse;
        System.out.printf("Периметр = %.1f%n", perimeter);
        double area = (cathetA * cathetB) / 2;
        System.out.printf("Площадь = %.1f%n", area);
    }
}