package Repl.it;
import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter seconds:");
        int inputSeconds = scan.nextInt();
        int hours = inputSeconds / 3600;
        int remainderAfterHour = inputSeconds % 3600;
        int minutes = remainderAfterHour / 60;
        int seconds = remainderAfterHour % 60;

        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
    }
}
