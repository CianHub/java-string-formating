package cian.og;

public class Main {

    public static void main(String[] args) {

        String apples = "Apples";
        int appleQuantity = 8;
        int applePrice = 100;
        String oranges = "Oranges";
        int orangeQuantity = 12;
        int orangePrice = 80;

        String col1Heading = "Fruit";
        String col2Heading = "Quantity";
        String col3Heading = "Price";

        System.out.printf("%s %s %s%n", col1Heading, col2Heading, col3Heading);
        System.out.printf("%s %d %d cents%n", apples, appleQuantity, applePrice);
        System.out.printf("%s %d %d cents%n", oranges, orangeQuantity, orangePrice);

    }
}
