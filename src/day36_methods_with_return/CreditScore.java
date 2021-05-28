package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(701);
        checkEligible(600);
        System.out.println(getCreditScore());
        System.out.println("CreditScore " + getCreditScore());
        int score = getCreditScore();
        System.out.println("score = " + score);

    }
    public static void checkEligible(int creditscore) {
        if(creditscore >= 700) {
            System.out.println("You are eligible for leasing this car");
        } else {
            System.out.println("Sorry, you not eligible for this car");
        }
    }
    //
    public static int getCreditScore() {
        return 800;
    }
}
