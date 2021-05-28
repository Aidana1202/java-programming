package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("1st word " + words[0]);
        System.out.println("2nd word" + words[1]);
        System.out.println("2nd word " + words[2]);
        //
        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] arrayResult = googleResult.split(" ");
        System.out.println("count = " + arrayResult[1]);
        System.out.println("Seconds = " + arrayResult[3].replace("(","") );
        System.out.println("Seconds = " + arrayResult[3].substring(1));
        //

    }
}
