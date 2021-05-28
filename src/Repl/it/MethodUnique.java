package Repl.it;

import java.util.Scanner;

public class MethodUnique {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE
       for(int unique : nums) {
           for (int i = 0; i < nums.length; i++) {
               if(unique != i) {
                   System.out.println(unique);
               }
           }
       }


    }
    }

