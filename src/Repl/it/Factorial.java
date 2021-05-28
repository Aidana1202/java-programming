package Repl.it;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       long result = 1L;

        for(int i = n; i>= 1; i-- ) {

            result = result * n;


    }
        System.out.println(result);

    }
}
