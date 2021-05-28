package day38_methods;
import static day38_methods.ArrayUtils.*;
public class ArrayUtilsTest {
    public static void main(String[] args) {
       int[] nums = {5, 23, 1, 543, 90};
       printArray(nums);

    ///*******************************************************************************

        System.out.println(sum(new int[] {1,2,3}));

    ///*******************************************************************************
        int[] nums1 = {1, 2, 3, 4};
        int num = 4;
        System.out.println("4 - is found = " + ArrayUtils.contains(nums1, num)); // 4 true
    ///*******************************************************************************

        System.out.println("2 - is found = " + contains(new int[] {1, 2, 3} , 2)); // 2 true

        System.out.println("7 - is found = " + contains(new int[] {1,2,3,4,6}, 7) ); // 7 false


    }
}
