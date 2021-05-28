package Repl.it;

import java.util.Arrays;

public class Ba {
    public static void main(String[] args) {
        String s = "07:05:45PM";

        if(s.contains("PM")) {
            String[] arr = s.split(":");
            arr[0] += 12;
            System.out.println
                    (Arrays.toString(arr));
        }


    }
}




