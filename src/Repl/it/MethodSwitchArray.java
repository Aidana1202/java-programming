package Repl.it;
import java.util.*;
public class MethodSwitchArray {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
        Arrays.toString(do_switch(arr));
    }


    public static int[] do_switch (int[] i) {
        int first = i[0];
        i[0] = i[3];
        i[3] = first;
        System.out.println(Arrays.toString(i));
        return i;
    }
}
