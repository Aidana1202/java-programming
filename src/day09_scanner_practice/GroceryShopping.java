package day09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price for milk: ");
        double price1 = scan.nextDouble();

        System.out.println("Enter price for bread: ");
        double price2 = scan.nextDouble();

        System.out.println("Enter price for sugar: ");
        double price3 = scan.nextDouble();

        double total = price1 + price2 + price3;
        System.out.println("Total price: $" + total + "\nThank you for shopping with us!");

        long a = 3_000L;
        double b = (float) a;
        System.out.println("b = " + b);

        System.out.println("result b" + (1) + (2));


    }
}
