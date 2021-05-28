package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "venti";
        double price;
        double callories;
        switch (size) {
            case "tall":
                price = 2.99;
                callories = 150 ;

                System.out.println("Tall cappucino please!! $" + price + " " +callories);
                break;
            case "grande":
                price = 3.99;
                callories = 250;
                System.out.println("Grande cappucino please!! $" + price + " " + callories);
                break;
            case "venti":
                price = 4.99;
                callories = 350;
                System.out.println("Venti cappucino please!! $" + price + " " + callories);
                break;
            default:
                System.out.println("Sorry, we do not serve this size!!!!");

        }


    }
}
