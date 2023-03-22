package ru.job4j.calculator;

public class Calculator {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static int func1(int x) {
        return  x * x + 1;
    }

    public static void main(String[] args) {
        Calculator.plus(1, 2);
        Calculator.plus(10, 11);

        int result3 = func1(100);
        System.out.println(result3);
    }
}
