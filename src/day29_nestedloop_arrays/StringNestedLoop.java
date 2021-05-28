package day29_nestedloop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        for (int i = 0; i < word.length(); i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }

        for (int i = 0; i < word.length(); i++){
            for ( int j = i; j < word.length(); j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
        String word1 = "java";
        for(int i = 0; i < word1.length(); i++) {
            char outerChar = word1.charAt(i);
            int count = 0;
             for (int j = 0; j < word1.length(); j++){
                 char innerChar = word1.charAt(j);
                 if(outerChar == innerChar) {
                     count++;
                 }
             }
            System.out.println("count = " + count);

    }
}}
