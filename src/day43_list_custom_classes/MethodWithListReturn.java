package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodWithListReturn {
    public static void main(String[] args) {
        System.out.println("System.nanoTime() = " + System.nanoTime());

        List<Integer> nums = getIntegerList();
        //
        int[] mlnNums = getIntegerArray();

    }


    public static List <Integer> getIntegerList() {
        List<Integer> nums1 = new ArrayList<>();
        for (int i = 0; i <= 1_000_000 ; i++) {
            nums1.add (i);
        }
        return nums1;
    }

    public static int[] getIntegerArray() {
        int[] nums = new int[1_000_000];
        for (int i = 0; i < 1_000_000; i++) {
            nums[i] = i;
        }
        return nums;
    }
}
