package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ','f', 'u', 'n'};
        for(int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);
        }
        //
        System.out.println();
        for(char n : letters) {
            System.out.print(n + " ");
        }
        //CONVERT CHAR ARRAY INTO STRING
        System.out.println();
        String sentence = new String(letters);
        System.out.println("sentence = " + sentence);

        //CONVERT STRING INTO CHAR ARRAY
        String item = "Wooden Spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());
                        // 0            1         2       3       4          5
        String[] fruits = {"banana", "apples", "kiwi", "mango", "papaya", "strawberry"};
        String fruitStr = "";
        for(String each : fruits) {
            fruitStr = each + "-";
            System.out.print(fruitStr);

        }
        System.out.println();
        //Way to convert to single String
        String[] languages = {"java", "python", "c++", "javascript"};
        System.out.println(String.join("|", languages));
        System.out.println(String.join(" <> ", languages));
    }
}
