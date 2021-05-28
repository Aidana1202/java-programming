package Repl.it;
import java.util.*;
public class SumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        // DO NOT TOUCH ABOVE
        //TODO: Write your code below

        int sum = 0;

        for (int i : nums) {
            sum += i;

        }
        System.out.println(sum);
    }
}