package day15_logicalops_switch_ternary;
import java.util.Scanner;
public class UsedCarSelector {
    public static void main(String[] args) {
        Scanner car = new Scanner(System.in);
        System.out.println("Enter model car and price:");
        int budget = 5000;
        String model = car.next();
        int carPrice = car.nextInt();

        if ((carPrice <= budget && (model.equals("Tesla") || model.equals("Honda") || model.equals("Toyota") ))){
            System.out.println("You can buy it");
        } else {
            System.out.println("It's out of your budget");
        }
    }
}
