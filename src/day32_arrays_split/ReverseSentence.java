package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "today is java array class";
        String[] wordArray = sentence.split(" ");
        String reversed = "";
        for(int i = wordArray.length -1; i >= 0; i--){
            reversed += wordArray[i] + " ";
        }
        System.out.println("sentence = " + sentence);
        System.out.println("reversed = " + reversed.trim());
    }

}
