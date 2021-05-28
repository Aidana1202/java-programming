package Repl.it;
import java.util.*;
public class ShiftLeft {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below

        for(int i = 0; i < words.length; i++) {

            String[] eachLetter = words[i].split("");
            System.out.println(eachLetter[0] + eachLetter[eachLetter.length-1]);
        }
        }
    }

