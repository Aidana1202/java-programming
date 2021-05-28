package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'd';
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println(grade + " - Passed ");
        } else if (grade == 'D') {
            System.out.println(grade + " - qualify for retake");
        } else if (grade == 'E') {
            System.out.println(grade + " - FAIL");
        } else {
            System.out.println("Invalid grade");
        }

        if ((grade == 'A' || grade == 'a') || (grade == 'B' || grade == 'b') || (grade == 'C' || grade == 'c')) {
            System.out.println(grade + " - Passed ");
        } else if (grade == 'D' || grade == 'd') {
            System.out.println(grade + " - qualify for retake");
        } else if (grade == 'E' || grade == 'e') {
            System.out.println(grade + " - FAIL");
        } else {
            System.out.println("Invalid grade");
        }

    }
}
