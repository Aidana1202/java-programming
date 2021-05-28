package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double salesAmount = 5005;
        int bonus = 0;
        if (salesAmount <= 1000) {
            System.out.println("Good job, you qualified for bonus");
            bonus = 50;
            System.out.println("Here is your bonus $" + bonus);
        } else {
            System.out.println("Great job, you are qualified for full bonus");
            bonus = 100;
            System.out.println("Here is your bonus $" + bonus);

        }
    }

}
