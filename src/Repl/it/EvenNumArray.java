package Repl.it;
import java.util.*;
public class EvenNumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO: Write your code below
        int count = 0;
        for (int each=0; each < nums.length; each++ ) {
            if (nums[each] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}