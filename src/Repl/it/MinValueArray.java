package Repl.it;
import java.util.*;
public class MinValueArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        // Do not touch above


        String shortest = str[0];

            for(String currentWord : str) {
                if(currentWord.length() < shortest.length()) {
                    shortest = currentWord;

                }
            }
        System.out.println(shortest);
        }


    }



