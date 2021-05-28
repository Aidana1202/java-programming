package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 55;
        System.out.println("Are you speeding? " + (currentSpeed == speedLimit));
        boolean result = currentSpeed >= speedLimit;
        System.out.println("Are you speeding? - " + result);

        currentSpeed += 20;
        result = currentSpeed > speedLimit;
        System.out.println("result = " + result);

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("can I afford? - " + (250.25 >= 100));
        
        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("canAfford = " + canAfford);

        //accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice;
        System.out.println("canAfford = " + canAfford);

        boolean isBroke = accountBalance <= 0;
        System.out.println("isBroke = " + isBroke);

        
        

    }
}
