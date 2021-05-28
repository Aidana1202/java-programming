package day09_scanner_practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your cents: ");
        int cents = scan.nextInt();
        int dollars = cents / 100;
        int cents1 = cents % 100;
        System.out.println("cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println("Remaining Cents is: " + cents1);
        System.out.println("In " + cents + " cents: $" + dollars + " and " + cents1 + " cents." );
    }
}
