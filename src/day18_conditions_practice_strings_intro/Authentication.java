package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int last4SSN = 123;
        int pinCode = 4321;
        if (last4SSN == 1234) {
            if (pinCode == 4321) {
                System.out.println("Correct");
            } else {
                if (pinCode == 4321) {
                System.out.println("Try again your SSN");
            } else {
                    System.out.println("Not correct"); }
            }
        }
    }
}
