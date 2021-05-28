package Repl.it;
import java.util.*;
public class MaxArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int max= 0;
        for(int each=0; each < nums.length; each++) {
            if (nums[each] > max) {
                max = nums[each];
            }
        }
        System.out.println(max);
    }


}
