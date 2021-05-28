package Repl.it;
import java.util.*;
public class ShoppingList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        System.out.println("Enter Item" +count + " and its price:");
        item = scan.next();
        price = scan.nextDouble();
        totalPrice += price;
        shoppingListReport = ("Item" + count + ":" + item + " Price: " + price);
        for (int i = 2; i <= 10; i++) {
            System.out.println("Add one more item?");
            countinue = scan.next();

            if (countinue.equals("yes")) {
                count++;
                System.out.println("Enter Item" + count + " and its price:");
                item = scan.next();
                price = scan.nextDouble();
                shoppingListReport = shoppingListReport + (", Item" + count + ": " + item + " Price: " + price ) ;
                totalPrice += price;


            } else {
                break;
            }
        }

        System.out.println(shoppingListReport);
        System.out.println("Total price: " + totalPrice);


    }
}