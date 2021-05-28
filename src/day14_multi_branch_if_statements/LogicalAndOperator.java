package day14_multi_branch_if_statements;

public class LogicalAndOperator {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(10 > 5 && 1 ==1);
        System.out.println(10>9 && 11>15);
        System.out.println(45>50 && 60<70);
        System.out.println(5<4 && 9>10);
        
        int apples = 10,  oranges = 5;
        boolean check = apples > 5 && oranges>3;
        System.out.println("check = " + check);

        if (apples >6 && oranges <2) {
            System.out.println("I have enough apples and oranges");
        } else {
            System.out.println("I got to go to wallmart to buy some fruit");
        }
    }
}
