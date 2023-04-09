package ru.job4j.exesises.io;

/**
 * 20. Вывод значений двух переменных с поясняющими надписями
 * 2023-03-25
 */
public class Task20 {
    public static void print(int x, int y) {
        System.out.println("Переменные: " + x + " " + y);
        System.out.println("Сумма: " + (x + y));
        System.out.println("Произведение: " + x * y);
    }

    public static void main(String[] args) {
        print(1, 2);

        String name = "Bob";
        String str = String.format("Привет, %s!", name);
        System.out.println(str); // Привет, Bob!

        str = String.format("ПРИВЕТ,   %S!", name); // Привет,   BOB!
        System.out.println(str);
    }
}