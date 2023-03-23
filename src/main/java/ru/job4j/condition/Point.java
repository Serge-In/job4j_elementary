package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double rsl = Point.distance(0, 0, 2, 0);
        System.out.println("rsl (0, 0) to (2, 0) " + rsl);

        rsl = Point.distance(1, 0, 2, 2);
        System.out.println("rsl (1, 0) to (2, 2) " + rsl);

        rsl = Point.distance(1, 0, 0, 0);
        System.out.println("rsl (1, 0) to (0, 0) " + rsl);
    }
}