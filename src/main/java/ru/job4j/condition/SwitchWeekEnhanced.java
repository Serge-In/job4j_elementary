package ru.job4j.condition;

public class SwitchWeekEnhanced {
//    public static String nameOfDay(int day) {
//        return switch (day) {
//            case 1: yield "Понедельник";
//            case 2: yield "Вторник";
//            case 3: yield "Среда";
//            case 4: yield "Четверг";
//            case 5: yield "Пятница";
//            case 6: yield "Суббота";
//            case 7: yield "Воскресенье";
//            default: yield "Ошибка";
//        };
//    }
    public static String nameOfDay(int day) {
        return switch (day) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Ошибка";
        };
    }
}
