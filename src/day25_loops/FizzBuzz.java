package day25_loops;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i % 3 ==0 && i % 5 == 0) {
                System.out.println();
                System.out.print("FizzBuzz " + i);
            } else if (i % 3 == 0) {
                System.out.println();
                System.out.print("Fizz " + i);
            } else if (i % 5 == 0) {
                System.out.println();
                System.out.print("Buzz " + i);
            } else {
                System.out.println();
                System.out.print(i);
            }
        }
    }
}
