package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        // 3 STEPS TO LEARN ANY METHOD
        // 1) WHAT DOES IT ACCEPT: str.isEmpty(); str.length(); str.equals("some other string");
        // 2)
        // 3)
        String name = "";
        System.out.println(name.isEmpty());

        String veggie = "carrots";
         if (!veggie.isEmpty()) {
             System.out.println("we have " + veggie);
         } else {
             System.out.println("we need to go to store and buy!");
         }
    }
}
