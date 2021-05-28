package Repl.it;

import java.util.Scanner;

public class countHi {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();



            int countHi = 0;
            int countChar = str.length();
            for(int i = 0; i < countChar - 1; i++) {
                if(str.substring(i , i + 2).equals("hi")) {
                    countHi++;
                }
            }
            System.out.println(countHi);

        }
    }

