package day16_switch_ternary;
import java.util.Scanner;
public class AdaireApartment {
    public static void main(String[] args) {
        System.out.println("######## WELCOME TO ADAIRE APARTMENT ##########");
        Scanner bedroom = new Scanner(System.in);
        System.out.println("Please Enter number of bedrooms:");
        int numberOfBedrooms = bedroom.nextInt();
        double startingPrice = 0;
        switch (numberOfBedrooms) {
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454.76;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725.89;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899.74;
                break;
            default:
                System.out.println(numberOfBedrooms + " - bedroom apartment currently not available.");
                return;

        }

        System.out.println("Starting price is: $" + startingPrice);
    }
}
