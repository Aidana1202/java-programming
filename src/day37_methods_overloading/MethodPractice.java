package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        repeatMethods("love", 3, '|');
    }
    public static void repeatMethods(String word, int times, char delimiter) {
        String total = "";
        for(int i = 1; i <= times; i++) {
            if(i == times) {
                total += word;
            } else {
                total += word + delimiter;
            }
        }
        System.out.print(total);
    }
}
