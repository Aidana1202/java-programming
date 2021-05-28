package day28_loops;
import java.util.*;
public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789_!@#$%^&*";
        Random random = new Random();
        String password = "";

        for(int repeat = 1; repeat <= 15; repeat++) {
            int index = random.nextInt(70);
          System.out.print(source.charAt(index) + " ");
           // System.out.print(random.nextInt(source.length()) + " ");
            password += source.charAt(index) + " ";

        }
        System.out.println("\npassword = " + password);

    }
}
