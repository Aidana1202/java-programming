package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here. Exit!!!");
        }
        boolean isAffordable = true;
        if (!isAffordable) {
            System.out.println("Item not affordable");
        } else if (isAffordable) {
            System.out.println("Item affordable");
        }
        String secretPassword = "abc123";
        String inputPassword = "abc12";
        if(!inputPassword.equals(secretPassword)) {
            System.out.println("Incorrect Password");
        } else {
            System.out.println("Correct!");
        }
    }
}
