package day38_methods;

public class RecursiveMethod {
    public static void main(String[] args) {
        hundred(0);
        ////
        System.out.println();
        num(5);

    }

    public static void hundred(int num) {
        System.out.print(num + " ");
        num++;
        if (num <= 100) {            /// EXIT CONDITION
            hundred(num);           /// RECURSION/RECURSIVE CONDITION
        }
    }

    //******************************************************************

    public static void num(int num) {
        System.out.print(num + " ");
        num--;
        if (num >= 0) {   /// EXIT CONDITION
            num(num);    //////RECURSION/RECURSIVE CONDITION
        }}



}
