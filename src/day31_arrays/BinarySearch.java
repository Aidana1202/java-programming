package day31_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        //PRE-CONDITION
        int[] nums = {23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums, 23)); // 0
        System.out.println(Arrays.binarySearch(nums, 2344)); // 3
        System.out.println(Arrays.binarySearch(nums,25 )); // -2
        System.out.println(Arrays.binarySearch(nums,700)); // -4

        // check if number 12345 is among numbers in array
        if(Arrays.binarySearch(nums, 1234) >= 0) {
            System.out.println("12345 is present in array");
        } else {
            System.out.println("12345 is not present in array");
        }
    }
}
