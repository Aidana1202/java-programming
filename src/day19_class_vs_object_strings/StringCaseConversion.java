package day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        String sentence = "Java IS Fun!!!";
        // CONVERT WORD TO ALL LOWERCASE
        System.out.println(word.toLowerCase());
        System.out.println(sentence.toLowerCase());
        //CONVERT WORD TO UPPERCASE
        System.out.println(word.toUpperCase());
        System.out.println(sentence.toUpperCase());
        //
        System.out.println("JAVA".toLowerCase());

        word.toLowerCase();
        System.out.println(word);

        String wordInLCase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLCase);

        // CHANGE WORD TO ALL LOWERCASE LETTERS. AND ASSIGN BACK
        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = "Amazon Web Services";
        System.out.println(company.toUpperCase());

        //
        System.out.println("java".toUpperCase());

        // CHANGE COMPANY AMAZON TO AMAZON
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);

    }
}
