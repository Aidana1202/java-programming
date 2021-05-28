package day21_string_manipulations;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "Github";
        System.out.println(word.replace("G" , "g" ));
        //
        word = "gitlab";
        System.out.println("word = " + word);
        System.out.println(word.replace('i' , 'o').replace('a' , 'i'));
        //
        String sentence = "java is fun";
        String withNoSpace = sentence.replace(" " , "");
        System.out.println("withNoSpace = " + withNoSpace);
        withNoSpace = sentence.replace("java" , "selenium").replace("fun" , "a lot of fun").replace(" " , "");
        System.out.println("withNoSpace = " + withNoSpace);
        //
        String result = "1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over " , "")
                       .replace("," , "")
                        .replace("results for java book" , "");
        System.out.println("result = " + result);



    }
}
