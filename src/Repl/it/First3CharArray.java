package Repl.it;
import java.util.*;
public class First3CharArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }

        for(int i = 0; i < arr.length; i++) {
            String wordStr = arr[i];
            System.out.println(wordStr.substring(0, 3));
        }


    }
}
