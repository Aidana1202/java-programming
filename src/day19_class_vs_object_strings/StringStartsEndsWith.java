package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {

        // STARTSWITH/ENDSWITH METHODS IS CASE SENSITIVE ***REMEMBER***

        String word = "Aidana";
        if (word.startsWith("Aid")) {
            System.out.println("Aidana");
        } else {
            System.out.println("False");
        }
        //
        if (word.endsWith("na")) {
            System.out.println("Aidana");
        } else {
            System.out.println("False");
        }
        //
        String name = "Dr.Yaroslav";
        if (name.startsWith("Mr.")) {
            System.out.println("Man Yroslav");
        } else if (name.startsWith("Dr.")) {
            System.out.println("Doctor Yroslav");
        } else if (name.startsWith("Mrs.")) {
            System.out.println("Married woman");
        } else if (name.startsWith("Ms.")) {
            System.out.println("Single woman");
        } else if (name.startsWith("Sr.")) {
            System.out.println("Senior Yroslav");
        } else {
            System.out.println("false");
        }
        //
        String url = "https://stackoverflow.ru";
        if (url.endsWith(".com")) {
            System.out.println("American WebSite");
        } else if (url.endsWith(".ru")){
            System.out.println("Russian WebSite");
        } else if (url.endsWith(".org")) {
            System.out.println("Organization WebSite");
        } else if (url.endsWith(".gov")) {
            System.out.println("Goverment WebSite");
        } else if (url.endsWith(".edu")) {
            System.out.println("Education WebSite");
        } else {
            System.out.println("Unknow WebSite");
        }

    }
}
