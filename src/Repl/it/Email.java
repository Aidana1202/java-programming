package Repl.it;
import java.util.*;
public class Email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName,lastName, domain;
        int underScore, atSighn, dotSighn;
        underScore = email.indexOf("_");
        atSighn = email.indexOf("@");
        dotSighn = email.indexOf(".");
        firstName = email.substring(0, underScore);
        lastName = email.substring(underScore +1, atSighn);
        domain = email.substring(atSighn + 1, dotSighn);

        System.out.println("First name: " + firstName.substring(0,1).toUpperCase() +firstName.substring(1) +
                "\nLast name: " + lastName.substring(0,1).toUpperCase() + lastName.substring(1) + "\nDomain: " + domain);
    }
}