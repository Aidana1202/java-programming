package Repl.it;

import day41_arraylist.ArraysAsList;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {
    public static void main(String[] args) {
        ArrayList<Integer>  numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(2, 97, 2, 56,46, 73,6,2,3,7));
        String s = "";
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > 5 ) {
                continue;
            }

            if(numbers.get(i) % 2 == 0) {
                s += "1";
            } else {
                s += "0";
            }
            System.out.println(s);
        }



    }

    public static int add(int n) {
        return 5;
    }

    public static double add(double d) {
        return 2.5;
    }

    public static long add(String s) {
        return 10;
    }

}



