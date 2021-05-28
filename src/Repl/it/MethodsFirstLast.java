package Repl.it;
import java.util.*;
public class MethodsFirstLast {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info) {
        //your code here
        String[] information  = info.split(",");
        System.out.println("person name: " + information[0]);
        System.out.println("plast name: " + information [1]);
        System.out.println("page: " + information [2]);







    }
}
