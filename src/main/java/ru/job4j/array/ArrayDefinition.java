package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("ages.length = " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("surnames.length = " + surnames.length);
        float[] prices = new float[50];
        System.out.println("prices.length = " + prices.length);
        String[] names = new String[4];
        names[0] = "Surya";
        names[1] = "Chandra";
        names[2] = "Mangal";
        names[3] = "Buddha";
        System.out.println("names[0] = " + names[0]);
        System.out.println("names[1] = " + names[1]);
        System.out.println("names[2] = " + names[2]);
        System.out.println("names[3] = " + names[3]);
    }
}




