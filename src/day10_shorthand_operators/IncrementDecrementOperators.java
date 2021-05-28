package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        ++i;
        System.out.println("i = " + i);
        i++;
        i++;
        System.out.println("i = " + i);

        int linesOfCod = 15;
        System.out.println("linesOfCod = " + linesOfCod);
        linesOfCod--;
        System.out.println("linesOfCod = " + linesOfCod);

        linesOfCod = linesOfCod - 1;
        linesOfCod -= 1;
        linesOfCod--;
        --linesOfCod;
        System.out.println("linesOfCod = " + linesOfCod);

        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);

    }
}
