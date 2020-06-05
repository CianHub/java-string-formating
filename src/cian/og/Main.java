package cian.og;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        String apples = "Apples";
        int appleQuantity = 8;
        int applePrice = 100;
        String oranges = "Oranges";
        int orangeQuantity = 12;
        int orangePrice = 80;

        String col1Heading = "Fruit";
        String col2Heading = "Quantity";
        String col3Heading = "Price";

        System.out.printf("%-12s %-8s %6s%n", col1Heading, col2Heading, col3Heading);
        System.out.printf("%-12s %-8d %6s%n", apples, appleQuantity,
                currencyFormat.format(applePrice/ 100.0));
        System.out.printf("%-12s %-8d %6s%n", oranges, orangeQuantity,
                currencyFormat.format(orangePrice / 100.0));

    }
}
