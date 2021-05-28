package Repl.it;
import java.util.*;
public class FirstAndLastArray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below
        String[] arr = new String[5];
        for(int i = 0; i < words.length; i++ ) {
            String toStr = words[i];
            String firstAndLastChar = "" + toStr.charAt(0) + toStr.charAt(toStr.length()-1);
            arr[i] += firstAndLastChar;



        }
        System.out.println(Arrays.toString(arr).replace("null", ""));


    }
}
