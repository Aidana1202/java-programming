package day25_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for(int n = 1; n <= 5; n++) {
            System.out.println(n);
            sum += n;
        }
        System.out.println("sum =  " + sum);
    }

}
