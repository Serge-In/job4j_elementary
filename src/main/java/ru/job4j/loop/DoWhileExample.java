package ru.job4j.loop;

import java.util.Scanner;

/**
 * Пример использования цикла DoWhile для ввода пароля
 * 2023-03-30
 */
public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password;
        do {
            System.out.println("Введите пароль: ");
            password = scanner.nextInt();
        } while (password != 555);
        System.out.println("Пароль введён успешно!");
    }
}