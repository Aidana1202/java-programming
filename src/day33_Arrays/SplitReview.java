package day33_Arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String[] arrayWord = word.split("a");
        System.out.println(arrayWord.length);//2
        int countOfA = arrayWord.length;
        System.out.println("countOfA = " + countOfA);

        //
        System.out.println("-----SPLIT WITH EMPTY STRING-----");
        String[] strArr = word.split("");
        System.out.println(Arrays.toString(strArr));
        //
        String word2 = "java1sql2ht4ml";
        String[] strArr2 = word2.split("\\d");
        System.out.println(Arrays.toString(strArr2));
        word2 = word2.replaceAll("\\d", "_");
        System.out.println(word2);
        //
        String password = "bcTd123_5";
        if(password.matches(("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$"))){
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }


    }
}
