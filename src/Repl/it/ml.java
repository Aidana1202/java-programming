package Repl.it;
import java.util.Scanner;
public class ml {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of milligrams in drink:");

        int numOfMilligrams = scan.nextInt();

        numOfMilligrams = 10*1000 / numOfMilligrams;

        System.out.println("It would take about " + numOfMilligrams + " drinks for a lethal overdose.");

    }
}
