package Repl.it;
import java.util.Scanner;
public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int giftCard = 100;
        int price = 0;


        String item = scan.nextLine();
        if (item.equals("Blanket") ) {
            price = 60;
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - price)  );
        } else if (item.equals("Charger" )) {
            price = 25;
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - price));
        } else if (item.equals("Hat")) {
            price = 25;
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - price));
        } else if (item.equals("Headphones")) {
            price = 30;
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - price));
        } else if (item.equals("Laptop")) {
            price = 200;
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equals("Pants")) {
            price = 50;
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - price));
        } else if (item.equals("Pillow")) {
            price = 40;
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - price));
        } else if (item.equals("Smartphone")) {
            price = 1000;
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equals("Socks")) {
            price = 5;
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - price));
        } else if (item.equals("USB cable")) {
            price = 10;
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - price));
        } else {
            System.out.println("Invalid item");
        }

    }
}
