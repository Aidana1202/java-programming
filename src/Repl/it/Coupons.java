package Repl.it;
import java.util.Scanner;
public class Coupons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons = scan.nextInt();

        if (coupons>=3)  {
            int result = coupons/10;
            System.out.println("Number of Candies: " + result);
            int remainder = (coupons % 10) / 3;
            System.out.println("Number of Gumballs: " + remainder);
        } else {
            System.out.println("Not enough coupons");
        }




    }
}
