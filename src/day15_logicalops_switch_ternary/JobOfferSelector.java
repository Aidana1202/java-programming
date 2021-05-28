package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "456 Ocean Dr, Miami, FL 22232";
        double salary = 109_000.0;
        boolean isRemote = true;
        boolean isBenefits = true;

        if(location.equals("456 Ocean Dr, Miami, FL 22232") && salary >= 109_000.0 && isRemote && isBenefits ) {
            System.out.println("I will accept your offer, Thank you!");
        } else {
            System.out.println("Thanks for your offer, I will think about it");

        }
    }
}
