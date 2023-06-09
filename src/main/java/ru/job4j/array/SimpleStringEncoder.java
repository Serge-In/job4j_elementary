package ru.job4j.array;

/**
 * 3. Тестовое задание. Блок "Базовый синтаксис" [#505049  [#505049 #420688]]
 * 2023-06-08
 */

public class SimpleStringEncoder {
    public static String encode(String input) {
        char symbol = input.charAt(0);
        int counter = 1;
        String result = "";
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else if (counter == 1) {
                result += String.valueOf(symbol);
                symbol = input.charAt(i);
            } else {
                result += String.valueOf(symbol) + counter;
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        if (counter == 1) {
            result += String.valueOf(symbol);
        } else {
            result += String.valueOf(symbol) + counter;
        }
        return result;
    }
}