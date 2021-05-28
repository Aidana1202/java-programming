package day32_arrays_split;
import java.util.Arrays;
public class SplitMethod {
    public static void main(String[] args) {
        String words = "java:python:selenium:html";
        String[] wordsArray = words.split(":");
        System.out.println(wordsArray[0]);
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of Array "+wordsArray.length);
        //
        for(String each : wordsArray){
            System.out.println(each);
        }
        //

        String sentence = "Today I am coding java arrays";
        String[] sentenceArray = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println("Number of words in sentence "+sentenceArray.length);
        System.out.println("first word - " + sentence.split(" ")[0 + 4] );
        System.out.println("first word - " + wordsArray[0]);
        //
        for(String each : sentenceArray) {
            System.out.println(each);
        }


    }
}
