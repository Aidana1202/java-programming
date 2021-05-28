package Repl.it;
import java.util.*;
public class ContainsEMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
        System.out.println(Arrays.toString(getWithE(arr)));

    }



    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------

        String wordE = "";
        for (int i = 0; i <= arr.length-1; i++) {
            if(arr[i].contains("e")) {

                wordE += arr[i] + " ";

            } else{
                continue;
            }

        }
        String[] fewValues = wordE.split(" ");
        Arrays.toString(fewValues);


        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }
}
