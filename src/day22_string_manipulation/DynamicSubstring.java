package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "search count:12345";
        System.out.println(result.substring(13, 18));
        //find the index of :
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println("colonIndex = " + colonIndex);
        System.out.println(result.substring(colonIndex + 1));
        //
        String today = "i learn [python] today";
        int start = today.indexOf("[");
        int end = today.indexOf("]");

        System.out.println(today.substring(start + 1, end));

        System.out.println(today.substring(today.indexOf("[") + 1, today.indexOf("]")));


    }
}
