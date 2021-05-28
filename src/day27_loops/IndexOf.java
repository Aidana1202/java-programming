package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "gitghub";
        char letter = 'k';
        int index = -1;

        for(int i = 0; i < word.length(); i++) {
            if ( letter == word.charAt(i)) {
                index = i;
                System.out.println(index);
                break; // for loop
            }

            }
        if(index == -1) {
            System.out.println(letter + " is not found.");

        }
    }
}
