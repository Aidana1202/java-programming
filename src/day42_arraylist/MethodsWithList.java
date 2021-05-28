package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        // First method
        List<String> str1 = new ArrayList<>(Arrays.asList("hello", "we are", "coding", "java"));
        printStrList(str1);

        // Second method
        List<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(sumIntegerList(nums1));


    }

    public static void printStrList(List<String> stringList) {
        for(String each : stringList) {
            System.out.print(each + " ");
        }
        System.out.println();

    }

    public static int sumIntegerList(List<Integer> nums) {
        int sum = 0;
        for(int each : nums) {
            sum += each;
        }
        return sum;
    }

}
