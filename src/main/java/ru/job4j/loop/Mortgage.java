package ru.job4j.loop;

public class Mortgage {
    public static int year(double loan, int salary, double percent) {
        int year = 0;
        while (loan > 0) {
            loan += loan * percent - salary;
            year++;
        }
        return year;
    }
}
