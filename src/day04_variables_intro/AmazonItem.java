package day04_variables_intro;

public class AmazonItem {
    public static void main(String[] args){
     String description = "HIC wooden spoon";
     int ratingsCount = 181;
     double price = 5.99;
     String seller = "amazaon.com";
     boolean prime = true;

     System.out.println("---PRODUCT INFORMATION---");
     System.out.println(description);
     System.out.print("* * * * * ");
     System.out.println(ratingsCount);
     System.out.print("$ ");
     System.out.println(price);
     System.out.println(prime);
    }
}