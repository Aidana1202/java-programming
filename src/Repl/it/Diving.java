package Repl.it;
import java.util.*;
public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        double diff;
        int sum = 0;

        //WRITE YOUR CODE HERE
        for(int i = 0; i< score.length; i++) {
            System.out.println("Enter score for judge " + (i+1) +":");
             score[i] = input.nextFloat();
        }
        System.out.println("Enter difficulty:");
        diff = input.nextDouble();

        Arrays.sort(score);

        for(int i = 1; i < score.length-1; i++) {
            sum += i;
        }
        double total = (sum/diff) * 0.6;

        System.out.println("Total: " + total);
    }
}
