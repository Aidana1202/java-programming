package Repl.it;
import java.util.*;
public class PopulateMethod {

    public static int[] populate(int[] r) {
        for (int i = 0; i <= r.length - 1; i++) {
            r[i] = i + 1;
        }
        //System.out.println(Arrays.toString(r));
        return r;

}

    public static void main(String[] args) 	{
        int [] i= new int[new Scanner(System.in).nextInt()];
        i = populate(i) ;
        System.out.println(Arrays.toString(i));

    }
}
