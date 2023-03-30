package ru.job4j.loop;

public class Mortgage {
    public static int year(int loan, int salary, double percent) {
        double loanBalance = loan;
        int yearCount = 0;

        while (loanBalance > 0) {
            loanBalance = loanBalance + loanBalance * percent - salary;
            yearCount++;
        }
        return yearCount;
    }
}
