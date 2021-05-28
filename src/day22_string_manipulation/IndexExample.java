package day22_string_manipulation;

public class IndexExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testing, maven, cucumber";
        // FIRST COMMA
        System.out.println(technologies.indexOf(","));
        //LAST COMMA
        System.out.println(technologies.lastIndexOf(","));
        //
        int indexOfJava = technologies.indexOf("java");
        System.out.println("indexOfJava = " + indexOfJava);
        //
        int idxOfCss = technologies.indexOf("css");
        System.out.println("idxOfCss = " + idxOfCss);
        //
        int indexOfSql = technologies.indexOf("sql"); // COULD NOT FIND "-1"!!!!!!
        System.out.println("indexOfSql = " + indexOfSql);

        //TECHNOLOGIES CONTAINS "maven" ?????
        if(technologies.contains("maven")) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }
        // to do with index
        if(technologies.indexOf("maven") > -1) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }
    }
}
