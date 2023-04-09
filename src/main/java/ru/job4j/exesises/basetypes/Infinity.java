package ru.job4j.exesises.basetypes;

public class Infinity {
    public static void main(String[] args) {
//        String sname = "DR";
//        float fname = Float.parseFloat(sname);
//        int num1 = 0;
//        System.out.println(fname / num1); // Приводит к исключению NumberFormatException во время выполнения

        //Деление float и double на ноль даст результат ‘Infinity’ в Java.
        double num2 = 344.55555555;
        System.out.println(num2 / 0);
    }
}

