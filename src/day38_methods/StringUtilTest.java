package day38_methods;

import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "b";

        if(StringUtils.isNullOrEmpty(userName)) {
            System.out.println("FAIL: Username cannot be null or empty");
        }
        ///*******************************************************************************

        System.out.println("isPalindrome(civic) = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(Aidana) = " + StringUtils.isPalindrome("Aidana"));
        System.out.println("isPalindrome(Cybertek) = " + isPalindrome("Cybertek")); // no need classname, because
                                                                                    // imported all static methods;

        ///*******************************************************************************

        System.out.println(reverse("java"));
        System.out.println(reverse("Aidana"));
        String word = "Alex";
        String revWord = reverse(word);
        System.out.println("word = " + word);
        System.out.println("revWord = " + revWord);

        ///*******************************************************************************





    }



}
