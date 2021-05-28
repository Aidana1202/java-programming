package day13_conditional_statements;

public class ATMPinCodeProgram {
    public static void main(String[] args) {
        System.out.println("***** WELCOME TO BANK OF AMERICA ATM *****");
        int secretPincode = 2373;
        int inputpinCode = 2373;
        if (secretPincode == inputpinCode) {
            System.out.println("Welcome to your Account! \nYou can withdraw, check balance, deposit.");
        } else {
            System.out.println("Incorrect Pincode! " + inputpinCode + "\nPlease, try again!");
        }

    }
}
