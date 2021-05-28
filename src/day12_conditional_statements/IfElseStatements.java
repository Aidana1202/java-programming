package day12_conditional_statements;

public class IfElseStatements {
    public static void main(String[] args) {
        if (10 > 5) {
            System.out.println("Condition is true");
        } else {
            System.out.println("CONDITION IS FAlse");
        }
        int count = 25;
        if (25 > 30) {
            System.out.println("count is more than 30");
        } else {
            System.out.println("count less than 30"); }

        int ageVote = 10;
        if (ageVote >= 18 ) {
            System.out.println("you can vote");
            System.out.println("Age is garter or equal to 18");
        } else {
           System.out.println("Age is less than 18");
           System.out.println("you can't vote");
        }
    }
}
